package com.wxh.NewServer.Service;

import com.wxh.NewServer.DAO.User_SystemRepository;
import com.wxh.NewServer.Entity.User_system;
import com.wxh.NewServer.Exception.CustomException;
import com.wxh.NewServer.Exception.CustomExceptionType;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    private User_SystemRepository repository;

    public UserService(User_SystemRepository repository){
        this.repository = repository;
    }

    public void loginVerification(User_system user_system) throws CustomException {
        User_system user = repository.findByUsernameAndPassword(user_system.getUsername(), user_system.getPassword());
        if (user == null){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, "请输入正确的用户名和密码");
        }
    }
}

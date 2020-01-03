package com.wxh.NewServer.Service;

import com.wxh.NewServer.Generator.Mission;
import com.wxh.NewServer.Generator.UserSystem;
import com.wxh.NewServer.Generator.UserSystemDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserSystemMybatisRestServiceImpl implements UserSystemRestService {

    @Resource
    UserSystemDao systemDao;

    @Override
    public Mission saveUserSystem(UserSystem userSystem) {
        systemDao.insert(userSystem);
        return null;
    }

    @Override
    public void deleteUserSystem(String id) {
        systemDao.deleteByPrimaryKey(id);
    }

    @Override
    public void updateUserSystem(UserSystem userSystem) {
        systemDao.updateByPrimaryKeySelective(userSystem);
    }

    @Override
    public UserSystem getUserSystem(String id) {
        return systemDao.selectByPrimaryKey(id);
    }

    @Override
    public List<UserSystem> getAll() {
        return systemDao.selectByExample(null);
    }
}

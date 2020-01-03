package com.wxh.NewServer.Service;

import com.wxh.NewServer.Generator.Mission;
import com.wxh.NewServer.Generator.UserSystem;

import java.util.List;

public interface UserSystemRestService {
    Mission saveUserSystem(UserSystem userSystem);
    void deleteUserSystem(String id);
    void updateUserSystem(UserSystem userSystem);
    UserSystem getUserSystem(String id);
    List<UserSystem> getAll();
}

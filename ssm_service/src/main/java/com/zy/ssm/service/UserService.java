package com.zy.ssm.service;

import com.zy.ssm.entity.User;


public interface UserService {
    User login(String uname,String upwd);
    int insert(User user);

}

package com.zy.ssm.service.Impl;

import com.zy.ssm.dao.UserDao;
import com.zy.ssm.entity.User;
import com.zy.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User login(String uname, String upwd) {
        System.out.println(uname);
        User user=userDao.selectByName(uname);
        if(user!=null&&user.getUpwd().equals(upwd)){
            return user;
        }
        return null;
    }

    @Override
    public int insert(User users) {
        int flag=0;
        User user=userDao.selectByName(users.getUname());
        if(user!=null){
            return 0;
        }else {
            flag= userDao.insert(users);
        }
        return flag;
    }

}

package com.zy.ssm.dao;

import com.zy.ssm.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    int insert(User user);
    void update(User user);
    User selectByName(String uname);
}

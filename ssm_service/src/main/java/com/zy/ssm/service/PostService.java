package com.zy.ssm.service;

import com.zy.ssm.entity.Post;
import com.zy.ssm.entity.User;

import java.util.List;


public interface PostService {
    Post select(String ptitle);
    List<Post> selectId(int id,int end_id);
    int insert(Post post);
    int update(String ptitle,String pcontext);
    List<Post> selectPtype(String ptype);
}

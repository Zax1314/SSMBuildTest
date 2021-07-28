package com.zy.ssm.service.Impl;

import com.zy.ssm.dao.PostDao;
import com.zy.ssm.dao.UserDao;
import com.zy.ssm.entity.Post;
import com.zy.ssm.entity.User;
import com.zy.ssm.service.PostService;
import com.zy.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("postServiceImpl")
public class PostServiceImpl implements PostService {
    @Autowired
    private PostDao postdao;
    public Post select(String ptitle) {
        System.out.println(ptitle);
        Post post=postdao.selectByName(ptitle);
        if(post!=null){
            return post;
        }
        return null;
    }

    @Override
    public List<Post> selectId(int id,int end_id) {
        List<Post> list=new ArrayList<>();
        list = postdao.selectById(id,end_id);
        return list;
    }

    @Override
    public int insert(Post posts) {
        int flag=0;
        Post post=postdao.selectByName(posts.getPtitle());
        if(post!=null){
            flag=0;
        }else{
            flag= postdao.insert(posts);
        }
            return flag;
    }

    @Override
    public int update(String ptitle, String pcontext) {
        int flag=0;
        Post post=postdao.selectByName(ptitle);
        if (post!=null){
            flag=postdao.updateByName(ptitle,pcontext);
        }else
            flag=0;
        return flag;
    }

    @Override
    public List<Post> selectPtype(String ptype) {

        return null;
    }


}

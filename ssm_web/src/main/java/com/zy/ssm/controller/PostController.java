package com.zy.ssm.controller;

import com.zy.ssm.entity.AllFlag;
import com.zy.ssm.entity.Post;
import com.zy.ssm.entity.Post_Flag;
import com.zy.ssm.entity.User;
import com.zy.ssm.service.PostService;
import com.zy.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@Controller("postController")
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping(value = "/insert_post")
    @ResponseBody
    public AllFlag inert_post(String pic,String uname,String ptitle, String pcontext,String ptype,String ptime, HttpSession session){
        int flag=postService.insert(new Post(0,pic,uname,ptitle,pcontext,ptype,ptime));
        System.out.println("2222");
        if(flag!=0){
        return new AllFlag(1,"成功");
        }else return new AllFlag(0,"失败");
    }


    @RequestMapping(value = "/find_post")
    @ResponseBody
    public Post_Flag find_post(String ptitle,HttpSession session){
        Post post=postService.select(ptitle);
        if(post!=null){
            return new Post_Flag(post.getPic(),post.getUname(),post.getPtitle(),post.getPcontext(),post.getPtype(),post.getPtime(),1,"成功");
        }else return new Post_Flag(post.getPic(),post.getUname(),post.getPtitle(),post.getPcontext(),post.getPtype(),post.getPtime(),0,"失败");

    }
    @RequestMapping(value = "/find_postById")
    @ResponseBody
    public List<Post> find_postById(int id,int end_id,HttpSession session){
        List<Post> list=postService.selectId(id,end_id);
        if(list.size()!=0){
            return list;
        }else return null;

    }
    @RequestMapping(value = "/updateByName")
    @ResponseBody
    public AllFlag updateByName(String ptitle,String pcontext,HttpSession session){
       int flag= postService.update(ptitle,pcontext);
        if(flag!=0){
            return new AllFlag(1,"成功");
        }else return new AllFlag(0,"失败");

    }
}

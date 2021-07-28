package com.zy.ssm.controller;

import com.zy.ssm.entity.AllFlag;
import com.zy.ssm.entity.User;
import com.zy.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
@CrossOrigin(origins = "*")
@Controller("userController")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "111";
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public AllFlag login(String uname, String upwd, HttpSession session){
        User user=userService.login(uname,upwd);
        System.out.println("2222");
        if(user!=null){
        return new AllFlag(1,"成功");
        }else return new AllFlag(0,"失败");
    }


    @RequestMapping(value = "/register")
    @ResponseBody
    public AllFlag register(String uname, String upwd, String mail ,HttpSession session){

        int flag=userService.insert(new User(uname,upwd,mail));
        System.out.println(flag);
        System.out.println(flag);
        if(flag!=0){
            return new AllFlag(1,"成功");
        }else return new AllFlag(0,"失败");
    }
}

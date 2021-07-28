package com.zy.ssm.global;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements HandlerInterceptor {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            String path = request.getServletPath();
            System.out.println("dsfsdfsdf");
            if(path.toLowerCase().indexOf("login")!=-1){
                return  true;
            }else{
                HttpSession session = request.getSession();
                Object obj=session.getAttribute("USER");
                if(obj!=null)
                    return true;
            }

            return false;

        }
}

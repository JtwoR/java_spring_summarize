package com.wt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class RegController extends AbstractController {
    
    public RegController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        // 获取页面的内容
        String name = request.getParameter("user_name");
        System.out.println("user_name is : " + name);
        
        // 转发
        ModelAndView modelAndView = new ModelAndView("showInfo");
        // 转发时进行提取值
        modelAndView.addObject("msg", name);
        
        // 重定向
//        ModelAndView modelAndView = new ModelAndView("redirect:/showInfo.jsp");
        // 重定向时进行提取值
//        HttpSession session = request.getSession();
//        session.setAttribute("session_msg", name);

        return modelAndView;
        
    }
    
}

package com.wt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user") // 设置一个虚拟目录
//例如要访问reg.htm路径应该为user/reg.htm
public class RegController {
    
    // user为对应的请求名即：参数名
    // modelMap为封装数据的对象
    @RequestMapping("reg.htm")
    public String show(String userName, ModelMap modelMap){
        modelMap.addAttribute("user_Info", userName);
        
        return "info";
    }
    
}

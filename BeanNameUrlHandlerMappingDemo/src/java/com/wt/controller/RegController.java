/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author NIIT
 */
public class RegController extends AbstractController {
    
    public RegController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        String info = request.getParameter("userName");
        
        ModelAndView modelAndView = new ModelAndView("show");
        
        modelAndView.addObject("userInfo", info);
        
        return modelAndView;
        
    }
    
}

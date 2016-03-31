package com.wt.biz;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {
    
    
    public String getNumber(int type){
    
        int number = (int) ((Math.random() * 9) * 100000);
        
        String flag = "";
        
        switch(type){
            case 1:
                flag = "tea";
                break;
            case 2:
                flag = "stu";
                break;
            default:
                break;
        }
        
        return flag + number;
        
    }
    
    public List findByName(String name){
        
        List list = new ArrayList();
        
        if(name.equals("wt")){
            for (int i = 0; i < 3; i++) {
                list.add(i);
            }
        }
        else{
            for (int i = 0; i < 5; i++) {
                list.add(i);
            }
        }   
        
        return list;
    }
    
}

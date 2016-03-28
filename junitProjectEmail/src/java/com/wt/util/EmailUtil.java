package com.wt.util;

import java.util.regex.Pattern;

public class EmailUtil {
    
    public boolean checkEmail(String email){
        
        System.out.println("--------- " + email);
        
        String eamilReg = "[a-z-A-Z0-9]{1,}@[a-z-A-Z0-9]{1,}\\.(com|cn)";
        
        boolean flag = Pattern.matches(eamilReg, email);
        
        System.out.println("--------- " + flag);
        
        return flag;
    }
    
}

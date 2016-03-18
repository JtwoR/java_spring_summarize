package com.wt.mamagers;

public class UserManagers {
    
    private String userName; // #{user.userName}
    
    public String save(){ // #{user.save}
        System.out.println("--------- " + userName);
        
        return "main";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
}

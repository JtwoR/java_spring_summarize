/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wt.biz;

import com.wt.entity.UserInfo;
import java.util.List;

/**
 *
 * @author NIIT
 */
public interface UserInfoBiz {
    public boolean doSave(UserInfo userInfo);
    
    public List<UserInfo> doSelect(UserInfo userInfo);
}

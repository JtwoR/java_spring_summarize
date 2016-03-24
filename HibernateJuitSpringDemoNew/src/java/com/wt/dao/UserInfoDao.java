
package com.wt.dao;

import com.wt.entity.UserInfo;
import java.util.List;

/**
 *
 * @author NIIT
 */
public interface UserInfoDao {
    public void save(UserInfo userInfo);
    
    public List<UserInfo> findAll();
    
}

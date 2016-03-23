/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.wt.entity.StuInfo;
import java.io.FileInputStream;
import java.sql.Blob;
import org.hibernate.Hibernate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */

// 这个部分的测试主要是针对Java中Blob字段的测试
public class BlobJUnitTest extends StuInfoJUnitTest{
    
    @Test
    public void testPhotoSave(){
        try {
            
            FileInputStream in = new FileInputStream("D:\\testImg.jpg");
            Blob photo = Hibernate.getLobCreator(session).createBlob(in, in.available());
            StuInfo stuInfo = new StuInfo();

            stuInfo.setS_name("testTwo");
            stuInfo.setS_sex("testGirl");
            
            stuInfo.setS_photo(photo);
            
            // 将新建的stu进行保存操作
            session.save(stuInfo);
            
        } catch (Exception e) {
            System.out.println("想要获取的图片不存在");
        }
        
    }
    
}

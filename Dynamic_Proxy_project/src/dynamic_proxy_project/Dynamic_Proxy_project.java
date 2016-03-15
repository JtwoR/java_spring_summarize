package dynamic_proxy_project;

import com.wt.one.OneTeach;
import com.wt.one.imp.OneTeachercheng;
import com.wt.proxy.TeacherProxy;
import com.wt.three.ThreeTeach;
import com.wt.three.imp.ThreeTeacherCui;

public class Dynamic_Proxy_project {
    
    public static void main(String[] args) {
        OneTeach oneTeach = (OneTeach) new TeacherProxy().instanceProxy(new OneTeachercheng());
        
        oneTeach.baseLanguage();
        
//        ThreeTeach threeTeach = (ThreeTeach) new TeacherProxy().instanceProxy(new ThreeTeacherCui());

        // 以下是以泛型的形式进行传入，即不用进行对象的强制转换
        ThreeTeach threeTeach = new TeacherProxy().instanceProxy(new ThreeTeacherCui());
        
        threeTeach.framLanguage();
    }
    
}

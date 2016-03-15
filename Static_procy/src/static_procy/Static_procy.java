package static_procy;

import com.wt.ITeach;
import com.wt.imp.TeacherCheng;
import com.wt.imp.TeacherTT;

public class Static_procy {
    
    public static void main(String[] args) {
        ITeach tt = new TeacherTT();
        tt.teaching();
        System.out.println("-------过了几天-------");
        
        // 以下为代理
        TeacherCheng cheng = new TeacherCheng(new TeacherTT());
        cheng.teaching();
    }
    
}

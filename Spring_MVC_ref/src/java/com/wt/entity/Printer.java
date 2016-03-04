package com.wt.entity;

import com.wt.inter.IPaper;
import com.wt.inter.InkBox;

public class Printer {
 
    // 面向接口编程，不是一个具体的类
    private InkBox inkBox = null;
    private IPaper paper = null;
    
    // 打印字符
    public void print(String str){
        System.out.println("使用 " + inkBox.getColor(255, 0, 0) + "颜色打印！ \n");
        
        // 逐个打印字符
        for (int i = 0; i < str.length(); i++) {
            paper.putInChar(str.charAt(i));
        }
        
        System.out.println(paper.getContent());
    }

//    public InkBox getInkBox() {
//        return inkBox;
//    }

    public void setInkBox(InkBox inkBox) {
        this.inkBox = inkBox;
    }

//    public IPaper getPaper() {
//        return paper;
//    }

    public void setPaper(IPaper paper) {
        this.paper = paper;
    }
    
}

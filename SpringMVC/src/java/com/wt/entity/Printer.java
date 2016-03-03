package com.wt.entity;

import com.wt.inter.IPaper;
import com.wt.inter.InkBox;

public class Printer {
    
    private InkBox inkBox = null;
    private IPaper iPaper = null;
    
    // 打印字符
    public void print(String str){
        System.out.println("com.wt.entity.Printer.print() \n使用 " 
                + inkBox.getColor(255, 0, 0) + "颜色答应！ \n");
    }

    public InkBox getInkBox() {
        return inkBox;
    }

    public void setInkBox(InkBox inkBox) {
        this.inkBox = inkBox;
    }

    public IPaper getiPaper() {
        return iPaper;
    }

    public void setiPaper(IPaper iPaper) {
        this.iPaper = iPaper;
    }
 
}

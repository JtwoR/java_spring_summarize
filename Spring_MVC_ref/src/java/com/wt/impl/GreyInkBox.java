package com.wt.impl;

import com.wt.inter.InkBox;
import java.awt.Color;

public class GreyInkBox implements InkBox{

    @Override
    public String getColor(int r, int g, int b) {
        int c = (r + g + b) / 3;
        Color color = new Color(c, c, c);
        
        // 字符串截取，转换成RGB
        return "#" + Integer.toHexString(color.getRGB()).substring(2);
    }
    
}

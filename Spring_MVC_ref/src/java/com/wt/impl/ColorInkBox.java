package com.wt.impl;

import com.wt.inter.InkBox;
import java.awt.Color;

public class ColorInkBox implements InkBox{

    @Override
    public String getColor(int r, int g, int b) {
        Color color = new Color(r, g, b);
        
        // 字符串截取，转换成RGB
        return "#" + Integer.toHexString(color.getRGB()).substring(2);
    }
    
}

package com.wt.inter;

public interface IPaper {
    // a4纸  每一行打印10个字符
    public static final String newlint = "\r\n";
    
    // 输出一个字符到纸张
    public void putInChar(char c);
    
    // 得到输出到纸张的内容
    public String getContent();
    
}

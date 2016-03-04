package com.wt.impl;

import com.wt.inter.IPaper;

public class TestPaper implements IPaper{
    
    // 每行输出的字符数
    private int charPerLine;
    
    // 一共有多少页
    private int LinePerPage;
    
    // 一共的内容
    private String content = "";
    
    // charPerLine
    private int posX = 0;

    // LinePerPage
    private int posY = 0;
    
    // 当前页 初始值为 1 
    private int currPage = 1;
    
    @Override
    public void putInChar(char c) {
        content += c;
        posX++;
        
        // 判断什么时候执行换行
        if(posX == charPerLine){
            // 执行换行
            content += IPaper.newline;
            posX = 0;
            posY++;
        }   
        // 判断何时翻页
        if(posY == LinePerPage){
            // 执行翻页
            content += "-------------第 " + currPage + " 页------------------";
            content += IPaper.newline + IPaper.newline;
            posY = 0;
            currPage++;
            
        }
    }      

    @Override
    public String getContent() {
        String result = this.content;
        // 添加本页空行，并显示本行
        
        // 当不为空时，进行打印
        if(!(posX == 0 && posY == 0)){
            int count = LinePerPage - posY;
            
            for (int i = 0; i < count; i++) {
                result += IPaper.newline;
            }
            
            result += "第 " + currPage + " 页";
        }
        
        return result;
    }
    
    // setter
    public void setCharPerLine(int charPerLine) {
        this.charPerLine = charPerLine;
    }

    public void setLinePerPage(int LinePerPage) {
        this.LinePerPage = LinePerPage;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }
    
    
    
}

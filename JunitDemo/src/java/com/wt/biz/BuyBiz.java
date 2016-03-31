package com.wt.biz;

public class BuyBiz {
    
    public int getTotal(int price){
        
        int total = 0;
        int r = 0;
        
        switch(price){
            case 200:
                r = 18;
                break;
            case 500:
                r = 58;
                break;
            default:
                r = 0;
                break;
        }   
        
        total = price + r;
        
        return total;
    }
    
}

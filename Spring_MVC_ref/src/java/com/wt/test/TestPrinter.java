package com.wt.test;

import com.wt.entity.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrinter {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/beans.xml");
        
        Printer printer = (Printer) context.getBean("printer");
        
        String content = "小说阅读网成立于2004年5月，成立之初，"
                        + "就以其独特的风格和丰富的内容受到广大文学小说爱好者"
                        + "的推崇，靠广大会员自发的推荐等，目前日访问量近6千万，"
                        + "每天在线用户200万，原创作品达20w，小说阅读网全球流量"
                        + "排名历史最高171名。网站按内容分为\"女生版\"、\"男生"
                        + "版\"和\"校园版\"三个分站，主要提供海量言情类女性文学、"
                        + "青春校园及仙侠玄幻类男性文学作品。网站现分为男生版、女生"
                        + "版，校园版和游戏中心。";
        
        printer.print(content);
    }
    
}

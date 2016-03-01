package com.wt.test;

import com.wt.entity.Account;
import com.wt.entity.Customer;
import com.wt.entity.FundTranFer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanWring {
    
    public static void main(String[] args) {
    
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/beans.xml");
        
        Customer customer = (Customer) context.getBean("CustomerBean");
        System.out.println("-----------Customer-----------");
        System.out.println("The value are");
        System.out.println(customer.getFirstName());
        System.out.println(customer.getMiddleName());
        System.out.println(customer.getLastName());
        
        Account account = (Account) context.getBean("AccountBean");
        System.out.println("----------Account------------");
        System.out.println(account.getAccountCreationDate());
        System.out.println(account.getAccountNumber());
        
        FundTranFer fundTranFer = (FundTranFer) context.getBean("FundTransferTransactionBean");
        System.out.println("----------FundTranFer------------");
        System.out.println(fundTranFer.getAmount());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankService;

import bankDAO.BankDAO;
import bankHelper.BankHelper;
//import java.util.HashMap;
import java.util.Scanner;


public class BankService {
    int a=1000000000;
    BankDAO bd=new BankDAO();
    Scanner sc=new Scanner(System.in);
    BankHelper bh=new BankHelper();
  
  
   public void createAccount(BankHelper bh) {
      int acno=a+1;
      a++;
      bd.addToMap(a, bh);
    }
    
    public void balanceCheck(int a)
    {
        if(bd.getHMValues().containsKey(a))
        {
            System.out.println("Enter your PIN:");
           int p=sc.nextInt();
           bh= (BankHelper) bd.getHMValues().get(a);
       int pas;
        pas=bh.getPin();
       
       if(p!=pas){
            System.out.println("invalid PIN");
       }
       else {
          System.out.println("Hello "+bh.getName());
          System.out.println("Your Account balance is "+bh.getBalance());
        }
        }
        else{
            System.out.println("Enter correct account number!!!!");
        }
    }

    public void depositMoney(int a) {
       if(bd.getHMValues().containsKey(a))
       {
           System.out.println("Enter your PIN:");
           int p=sc.nextInt();
           bh= (BankHelper) bd.getHMValues().get(a);
           int pas;
           pas=bh.getPin();
       
           if(p!=pas){
           System.out.println("invalid PIN");
             }
           else
           {
              System.out.println("Hello "+bh.getName());
               System.out.println("Enter the deposit amount");
               long dam=sc.nextLong();
               long d=bh.getBalance();
               d=dam+d;
               bh.setBalance(d);
               System.out.println("Your Account balance is "+bh.getBalance());
               
           }
       }
       
       else{
            System.out.println("Enter correct account number!!!!");
       }
    }

    public void withdrawMoney(int a) {
         if(bd.getHMValues().containsKey(a))
         {
           System.out.println("Enter your PIN:");
           int p=sc.nextInt();
           bh= (BankHelper) bd.getHMValues().get(a);
           int pas;
           pas=bh.getPin();
       
           if(p!=pas){
           System.out.println("invalid PIN");
             }
           else
           {
              System.out.println("Hello "+bh.getName());
              System.out.println("Enter the amount you want to withdraw");
               long dam=sc.nextLong();
               long d=bh.getBalance();
               if(dam>d)
               {
                   System.out.println("Insufficient balance");
               }
               else{
               d=d-dam;
               bh.setBalance(d);
               System.out.println("you have withdrawn "+dam);
               System.out.println("Your Account balance is "+bh.getBalance());
               } 
           }
         }
         else{
            System.out.println("Enter correct account number!!!!");
       }
         
    }

    public void transferMoney(int a) {
        if(bd.getHMValues().containsKey(a))
        {
           System.out.println("Enter your PIN:");
           int p=sc.nextInt();
           bh= (BankHelper) bd.getHMValues().get(a);
           int pas;
           pas=bh.getPin();
            if(p!=pas){
           System.out.println("invalid PIN");
             }
            else{
              System.out.println("Hello "+bh.getName());
              System.out.println("Enter the amount you want to send");
              long sa=sc.nextLong();
              long sac=bh.getBalance();
              if(sa>sac)
               {
                   System.out.println("Insufficient balance");
               }
              else{
                  sac=sac-sa;
                   bh.setBalance(sac);
              }
              System.out.println("Enter the accountno to which you want to send money");
              int acno=sc.nextInt();
               if(bd.getHMValues().containsKey(acno)){
              bh= (BankHelper) bd.getHMValues().get(acno);
              long ta=bh.getBalance();
              ta=ta+sa;
              bh.setBalance(ta);
              System.out.println("Money sent successfully");
               }
               
               else{
                   System.out.println("Invalid account number");
               }
              System.out.println("Your account balance is "+bh.getBalance());
            }
            
        }
        else{
            System.out.println("Invalid account number");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankMain;

import bankHelper.BankHelper;
import bankService.BankService;
import java.util.Scanner;

public class BankAddDetails {
     BankHelper bh;
     BankService bs;
     //int a=1800060000;

     Scanner sc=new Scanner(System.in);
     public BankAddDetails()
     {
         bs=new BankService();
        
     }
     
     public void addUserDetails()
     {
         System.out.println("ENTER YOUR NAME:");
         String name=sc.next();
         System.out.println("ENTER YOUR DATE OF BIRTH IN DD/MM/YYYY");
         String date=sc.next();
         System.out.println("ENTER YOUR PHONE NUMBER");
         String pn=sc.next();
         System.out.println("ENTER YOUR SECURITY PIN(ONLY NUMBERS)");
         int ps=sc.nextInt();
        bh=new BankHelper (name,date,pn,ps,1000);
         bs.createAccount(bh); 
     }
     public void checkBalance()
     {
         System.out.println("Enter your ten didgit Account Number");
         int a=sc.nextInt();
         bs.balanceCheck(a);
     }

    public void addMoney() {
      System.out.println("Enter your ten didgit Account Number");
      int a=sc.nextInt();
      bs.depositMoney(a);
    }

    public void removeMoney() {
       System.out.println("Enter your ten didgit Account Number");
       int a=sc.nextInt();
       bs.withdrawMoney(a);
    }

    public void sendMoney() {
          System.out.println("Enter your ten didgit Account Number");
         int a=sc.nextInt();
         bs.transferMoney(a);
        
    }
}

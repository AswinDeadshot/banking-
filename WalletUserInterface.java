
package bankUI;

import bankMain.BankAddDetails;
import java.util.Scanner;

public class WalletUserInterface {
    
  
    
    public WalletUserInterface(){
   // bd=new BankAddDetails();
    }
    
    public static void main(String args[])
    {
        int c;
        Scanner sc=new Scanner(System.in);
          BankAddDetails bd=new BankAddDetails();
        while(true){
            System.out.println("Welcome to xyz bank wallet");
            System.out.println("Choose any of these options from one to seven");
            System.out.println("1.Create an Account");
            System.out.println("2.Check your Balance");
            System.out.println("3.Deposit Money");
            System.out.println("4.Withdraw Money");
            System.out.println("5.Transfer Money");
            System.out.println("6.View Transaction");
            System.out.println("7.Exit");
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                     bd.addUserDetails();
                    break;
                case 2:
                     bd.checkBalance();
                    break;
                case 3:
                     bd.addMoney();
                    break;
                case 4:
                     bd.removeMoney();
                    break;
                case 5:
                       bd.sendMoney();
                    break;
                case 6:
                     System.out.println("6. transaction view");
                    break;
                case 7:System.out.println("Thank you for using our services");
                           System.exit(0);
                    break;
                default: 
                    System.out.println("thank you");
                    break;
            }
        }
    }
}

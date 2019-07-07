/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankHelper;

/**
 *
 * @author Acer
 */
public class BankHelper {
      private String name;
    private String number;
    private String dob;
    private int pin;
    private long balance;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the pin
     */
    public int getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    /**
     * @return the balance
     */
    public long getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(long balance) {
        this.balance = balance;
    }
    public BankHelper()
    {
        
    }

    /**
     *
     * @param name
     * @param dob
     * @param number
     * @param pin
     * @param balance
     */
    public BankHelper(String name,String dob,String number,int pin,int balance)
    {
        this.name=name;
        this.dob=dob;
        this.number=number;
        this.pin=pin;
        this.balance=balance;
    }
    
    @Override
    public String toString()
    {
        return "Accont Created [Name="+name+", Date of Birth="+dob+", Phnone number"+number+", Pin="+pin+", Balance="+balance;
    }
    
}

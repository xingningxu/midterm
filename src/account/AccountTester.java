/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author sheetal
 */
public class AccountTester {
    
    public static void main(String[] args) {
        /*here assumed that 500 accounts can be created
        for the given bank*/
        Account ac[]=new Account[500];
        
        Account a=new Account(100);
        ac[0]=a;
        
        System.out.println("The balance is:"+a.getBalance());
        
        System.out.println("The InterestRate per month is"+a.getInterestRate());
        
        /*create the method to know the balance after applying 
         interest rate per month*/
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 * date: March 2nd
 * @author Sivagama
 */
public class Account {

    
        private double balance;
        private double interestRate=0.23;
        private String user;
 
     /**constructor that takes the initial balance
      * @param initialBalance 
      */
        public Account(double initialBalance,String givenUser)
        {
            if (validBalance(initialBalance)){
                balance=initialBalance;
                user=givenUser;
                System.out.println("Account created");}
            else
                System.out.println("Account not created");
            
            
            
            //Note that the initial balance must be greater than 50.       
        }
        /**
         * 
         * @param initialBalance
         * @return true if higher than 50 
         */
        public static boolean validBalance(double initialBalance){
            if (initialBalance > 50){
                
                return true;
            }
            else
                return false;
        }
        /**
         * 
         * @param time
         * @return double value that equals amount*interest rate*time 
         */
        public double calcBalanceFinal(int time){
            return balance + (balance*interestRate*time);
        }
     /**The method for depositing amount and 
      * updating balance*/
        public void credit(double amount)
        {
            balance=getBalance()+amount;
        }

     /**The method for debit(withdrawing amount) and 
      * updating balance */
        public void debit(double amount)
        {
            balance=getBalance()-amount;

        }
        
     /**The getter for the balance
     * @return the balance
     */
        public double getBalance() 
        {
        return balance;
        }

    /**The getter for InterestRate
     * @return the interestRate
     */
        public double getInterestRate() 
        {
            return interestRate;
        }

    /**user is the read only field
     * @return the user
     */
    public String getUser() {
        return user;
    }
    
    
}//class end

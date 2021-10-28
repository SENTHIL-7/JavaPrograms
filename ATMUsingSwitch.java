//problem

//For this exercise, create a simple program that will simulate an ATM transaction:
//
//1. Create a String variable called command, which can hold "Withdraw" or "Deposit" commands
//
//2. Create an int variable called balance, which holds 1000
//
//3. Create another int variable called amount, which holds 100
//
//   If the command value is "Withdraw," then subtract the amount from balance and print out:
//
//      "Your balance used to be 1000, and now is 900."
//
//   If, instead, the command value is "Deposit," then print out:
//
//        "Your balance used to be 1000, and now it is 1100."
//

public class ATMUsingSwitch {

	public static void main(String[] args) {
	      String command = "Deposit";
	      int balance = 1000;
	      int amount = 100;
	      switch(command) {
	        
	      case "Withdraw":
	    	 
	    	  System.out.println( "Your balance used to be " +balance +", and now is "+( balance-amount )+".");
	    	  break;
	      
	      case "Deposit":
   	 
  	          System.out.println( "Your balance used to be " +balance +", and now is "+( balance+amount )+".");
  	          break;
  	          
  	      default :
  	    	  System.out.println("invalid input");
	      }
    }

	

}

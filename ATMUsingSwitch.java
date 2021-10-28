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

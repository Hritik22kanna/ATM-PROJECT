package ATMproject;


import java.util.Scanner;

public class ATM {

	public static void main(String args[]) {
	    int balance =0, withdraw =0, deposite=0,	 pin=0; 
	     
	  
	   Scanner sc = new Scanner(System.in);
	   
	  
	      System.out.println("WEL-COME TO KANNA ATM");
		  System.out.println("PLEASE INSERT YOUR CARD");
		  System.out.println("Press 0 to enter pin:");
		  
		  
		  while(true) {

		      
			 int choice = sc.nextInt();
			 
		      switch(choice) {
		    
		      case 0: 
		    	     System.out.println("Please Enter your 4-digit pin:");
		    	     pin= sc.nextInt();
		    	     if(pin >= 1000 && pin <= 9999) {
		    		 System.out.println("Choose 1 for Check Balance");
		   		     System.out.println("Choose 2 for Deposit");
		   		     System.out.println("Choose 3 for Withdraw");
		   		     System.out.println("Choose 4 for Exit");
		   		     System.out.print("Choose the operation you want to perform:");
		   		     System.out.println("");
		   		     break;
		    	     }
		    	     else
		    	     {
						System.out.println("Invalid pin");
		    	     }
		             break;
					
		    
		    
		    case  1 : 
		    	    System.out.println("Your balance Amount is: "+balance);
		            System.out.println("******************************");
		    	    break;
		    	
		    case 2 : 
		    	   System.out.println("Enter your Amount to be Deposited: "+deposite);
		    	   deposite = sc.nextInt();
		    	   balance = balance + deposite;
		    	   System.out.println("Your Amount has been sucsessfully deposited: "+balance);
		    	   System.out.println("***************************************************");
		    	   break;    	
		    case 3 : 
		    	  System.out.println("Enter Amount to be withdrawn: "+withdraw);
		    	  withdraw = sc.nextInt();
		    	
		          if(balance > withdraw) {
		    		 balance = balance- withdraw;
		    		 System.out.println("Please collect your Amount: "+withdraw);
		    	   }else {
		    		 System.out.println("Insufficent balance");
		    	  }
		    	  if(balance > withdraw){
		    	     System.out.println("Your available balance: "+balance);
		    	     
		    	  }
		    	  System.out.println("******************************");
		    	  break;
		    		   
		     case 4 :
		    	   System.out.println("Thank You"); 
		    	   int exit = sc.nextInt();
		    	   System.out.println("******************************");
		    	   return;
		          }		 
		    	}
		      }
            }
		    
	  

	

	


import java.util.Scanner;
import java.lang.Math;
public class BankingApplication{
	public static  void main(String[]args){
	  
	BankAccount obj =new BankAccount( );
   obj.signIn();
  obj.showMenu();
  
	}
}
class BankAccount
{
	int balance;
	int previoustransaction;
	String customerid;
	String customername;

  void signIn(){
    Scanner Info=new Scanner(System.in);
    System.out.println("Enter Your name: ");
    customername=Info.next();
    System.out.println("Enter Your ID: ");
    customerid=Info.next();
    boolean customerid=true;
    boolean customername=true;
      if(customername==true&&customerid==true){
          System.out.println("Welcome");
}
    else{
      System.out.println("INVALID LOGIN ");
    }

  }

void deposit(int amount)
{
if (amount >0){
	balance=balance+amount;
	previoustransaction = amount;
}
}


void withdraw(int amount)
{
if (amount >0){
	balance=balance-amount;
	previoustransaction = -amount;
}
}


void getprevioustransaction()
{
if (previoustransaction >0){
	System.out.println("Deposited"+previoustransaction);
}
else if (previoustransaction <0)
{
	System.out.println("withdraw"+Math.abs(previoustransaction));
}
else
{
		System.out.println("No Transaction Occured");
}
}

void showMenu(){
	char option='\0';
	Scanner scanner =new Scanner(System.in);
	System.out.println("Welcome"+customername);
	System.out.println("Your ID is"+customerid);
	System.out.println("\n");
	


	System.out.println("A: Check Your Balance");
	System.out.println("B:Deposit");
	System.out.println("C:Withdraw");
	System.out.println("D:PreviousTransaction");
	System.out.println("E: Exit the system");


   do{
    
  System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
   
   	System.out.println("Enter Your option");

  System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
    
    option = scanner.next().charAt(0);
  	System.out.println("\n");
    

    switch(option){

    case 'A':
  System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
   

   System.out.println("Balance="+balance);

  System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
   
   System.out.println("\n");
   break;


   case 'B':
  System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
   

   System.out.println("Enter amount to deposit");

  System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
   
   int amount=scanner.nextInt();
   deposit(amount);
   System.out.println("\n");
   break;


 case 'C':
  System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
   

   System.out.println("Enter amount to Withdraw");
   int amount2=scanner.nextInt();
   withdraw(amount2);

  System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
   
   System.out.println("\n");
   break;



 case 'D':
  System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
   getprevioustransaction();
   System.out.println("\n");

  System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
   
   System.out.println("\n");
   break;


 case 'E':
  System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
  break;

  default:
     System.out.println("INVALID OPTION");
	     break;

	     }
	     }
	     while(option != 'E');
	      System.out.println("Thank You for visiting.....!!");
}
 

 }

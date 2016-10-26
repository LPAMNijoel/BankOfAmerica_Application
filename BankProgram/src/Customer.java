import java.*;
import java.awt.Choice;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Name of Banks.
 * 
 */

//enum nameOfBank 
//{
//	/**
//	 * nameOfBanks will be selected if the user decides to visit whichever bank.
//	 */
//	BankOfAmerica, WellsFargo, Chase 
//
//};


public class Customer 
{
	
	final static int BankOfAmerica = 1;
	final static int WellsFargo = 2;
	final static int chase = 3;
	
	private String CustomerName;
	private static int depositCash;
	private static int withdrawCash;

	// static to print the reciept for customer.
	public static String reciept;

	public int getDepositCashAmount() {
		/**
		 */
		return depositCash;
	}

	public int getWithdrawCashAmount() {
		return withdrawCash;
	}

	public void DepositCashAmount(int depositCash) {
		/**
		 */
		Customer.depositCash = depositCash;
	}

	public void WithdrawCashAmount(int withdrawCash) {
		Customer.withdrawCash = withdrawCash;
	}

	public String getCustomerName() {
		/**
		 * 
		 * @ string that returns the customer name.
		 */
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		/**
		 * 
		 * String that's passed in to set the customer name.
		 */
		CustomerName = customerName;
	}

	public static void main(String[] a) 
	{

		int choice;
		//String name;
		Scanner keyboardInput = new Scanner(System.in);
		String arrayofTellerNames[] ={"Nijoel","Bob","Ray","Sara","Alice"};
		
		
do {
	// user pin
			// int pinNumber;
		// going to write to a file soon. 	
	//Bufferedreader br = new BufferedReader(new InputStreamReader(System.in));
	
			//nameOfBank choicee;
			// might randomize it... second thought not going to random were going to let the user have their own pin.
			// Random randomPin = new Random();	
			//Scanner keyboardInput = new Scanner(System.in);
			// System.out.println("error main program running...");
			
			Random randomName = new Random();
			//randomName.nextInt(3);
			//System.out.println("Hello my name is:"+arrayofTellerNames[(randomName.nextInt(1%4))]);
			System.out.println("Welcome to the bank which bank are you going to today?\n Please select a bank!\n "
					+ "1:Bank Of America\n 2.Wells Fargo\n 3.Chase");
			
					// lets see prompt the user the select a choice.
					// after the choice is selected lets prompt to enter a pin
					// number...
		
			System.out.println("please select a choice...");		
				choice = keyboardInput.nextInt();
			
			//choicee = nameOfBank.valueOf(arg0)
			// we have to check if the input is a negitive number or if the input is
			// greater than three if neg
			// we prompt if inp <4 still prompt..
			

			while (choice <= 0 || choice > 3) 
			{
				System.err.println("error not right please enter again...");
				choice = keyboardInput.nextInt();
			}
			
			switch (choice) 
			{
			case BankOfAmerica:
		
				/**
				 * some code goes here for the bank of america bank for the customer...
				 */
				System.out.println("bank of america case...");
				
				// lets create a teller for this transaction
				Teller Teller_Obj = new Teller();
				// lets create a customer for this transaction.
				Customer customer1_Obj = new Customer();
	
				// we set the teller a random teller name.
				Teller_Obj.setTellerName(arrayofTellerNames[randomName.nextInt(5)]);
				// lets get the name of the teller thats going to interact with the customer 
				System.out.println("Hello my name is:"+Teller_Obj.getTellerName());
				
				
				// customer name?
				customer1_Obj.setCustomerName("Customer 1");
				System.out.println("Hello I am: "+customer1_Obj.getCustomerName());
				
				System.out.println("--------------------------------------------");
				
				// now we do the rest of the trans from here...
				System.out.println(" "+customer1_Obj.getCustomerName()+ "Would you like to withdraw or deposit today?");
				
				
				
				
				
				break;
			
			
			
			
			case WellsFargo:
				// 
				/**
				 * some code goes here for the wells fargo bank for the customer...
				 */
				System.out.println("Wells Fargo case...");
				break;
			case chase:
			
				/**
				 * some code goes here for the chase bank for the customer...
				 */
				
				System.out.println("Chase case...");
				break;
			}
	//keyboardInput.close();

} while ( choice <= 1 || choice<= 3 );
		
		keyboardInput.close();
	}

}

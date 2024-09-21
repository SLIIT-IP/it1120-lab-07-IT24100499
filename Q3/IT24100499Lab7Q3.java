import java.util.Scanner;

	public class IT24100499Lab7Q3{
		public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
	
		//declair the variables
			int i; //number of customers		

		for (i = 1;  i <= 5; i++){
			System.out.println("\nCustomer " + i);
			
		//getting the bill amount IT24100499Lab7Q3
			System.out.print("Enter the total bill Amount : ");
			double amount = scanner.nextDouble();

			System.out.print("Enter the mode of the payment  (C for cash, O for other) : ");
			char mode = scanner.next().charAt(0);
			
		if( mode == 'C' || mode == 'c'){
		
		//calculating the discount and the total amount	
			double discount = amount /100 *5;
			double totalamount = amount - discount;
			
		//print the discount and the total amount
			System.out.println("Discount is : " + discount);
			System.out.println("Amount to be paid "+totalamount);

		}else if ( mode == 'O' || mode == 'o'){
			System.out.println("No discount applicable");

		}else{
			System.out.println("Payment mode is not valid");	
			
		}
			
			
			
		}

	}
}
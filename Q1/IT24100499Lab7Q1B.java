import java.util.Scanner;

public class IT24100499Lab7Q1B{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

		//Declairing the variables
			int i;	//number of students
			int j;	//number of subjects
			double avarage;
			

		for ( i = 1; i<=3; i++ ){
			System.out.println("\nStudent " + i);
			System.out.print("Enter the marks :");
			
			double totalmarks = 0.0;
				for( j = 1; j<=4; j++){
					totalmarks += scanner.nextDouble();					
				}				

			//calculating and print the avarage and the Grade
				avarage = totalmarks/4;
				System.out.println("Avarage is :" + avarage);
				
			
			if (avarage <= 100 || avarage >= 75){
					System.out.println("overall Grade is : Distinction");

			}else if (avarage <= 75 || avarage >= 50 ){
					System.out.println("overall Grade is : Credit");				

			}else{
					System.out.println("overall Grade is : Fail");
			}
				
					

		} 
			
		
	}
}
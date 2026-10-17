import java.util.Scanner;
public class IT26102407Lab4Q2{
	
	public static void main (String[]args){
		
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		//Declaring variables
		double examMarks ,labMarks ,examPrecentage ,labPrecentage ,finalMarks;
		
		//Getting examMarks
		System.out.print("Please enter exam marks (out of 100): ");
		examMarks = input.nextDouble();
		
		//Validating examMarks
		if(examMarks < 0 || examMarks > 100)
		{
			System.out.print("Invalid input for exam marks. Terminating program.");
			return; 
		}
		
		//Getting labMarks
		System.out.print("Please enter lab submission marks (out of 100): ");
		labMarks = input.nextDouble();
		
		//Validating labMarks
		if(labMarks<0 || labMarks>100)
		{
			System.out.print("Invalid input for lab submission marks. Terminating program.");
			return;
		}
		
		//Getting examPrecentage and labPrecentage
		System.out.print("Please enter the precentage given for the exam: ");
		examPrecentage = input.nextDouble();
		
		System.out.print("Please enter the precentage given for lab submission: ");
		labPrecentage = input.nextDouble();
		
		//Validating examPrecentage and labPrecentage
		if(examPrecentage + labPrecentage != 100)
		{
			System.out.print("The precentage must add up to 100. Terminating program");
			return;
		}
		//Calculating the Final Marks
		finalMarks = (examMarks*examPrecentage/100) + (labMarks*labPrecentage/100);
		
		//Displaying the Final marks
		System.out.println("");
		System.out.println("Final Exam Mark is: " + finalMarks);
		
	}
	
}
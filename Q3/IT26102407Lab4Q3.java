import java.util.Scanner;
public class IT26102407Lab4Q3{
	
	public static void main(String[]args){
		
		//Creating Scanner
		Scanner input = new Scanner (System.in);
		
		//Declaring the variable
		int num;
		String output;
		
		//Getting number input
		System.out.print("Enter the number: ");
		num = input.nextInt();
		
		//Ternary operator
		output = (num > 0 )? "The number is: Positive" :
				 (num < 0)? "The number is: Negative" :
				 "The number is: Zero";
		
		//Printing the final answer
		System.out.println(output);
		
	}
	
}
import java.util.Scanner;
public class IT26102407Lab4Q1{
	
	public static void main(String[]args){
		
		//Creating Scanner
		Scanner input = new Scanner (System.in);
		
		//Declaring the variable
		int num;
		
		//Getting number input
		System.out.print("Enter the number: ");
		num = input.nextInt();
		
		if (num>0)
		{
			System.out.print("The number is: Positive");		
		}
		else if (num<0)
		{
			System.out.print("The number is: Negative");
		}
		else
		{
			System.out.print("The number is Zero");
		}
		
	}
	
}
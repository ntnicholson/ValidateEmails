package emailvalidation;
import java.util.Scanner;


public class ValidateEmails {

	public static void main(String[] args) 
	{
		Employee[] employeeEmails = new Employee[10];
		Scanner userInput = new Scanner(System.in);
		String emailInput = null;
		char choice;
		
		//Populate array with test emails
		Employee.PopulateEmailArray(employeeEmails);
		//Give user option to list emails in system
		//Get input from user
		System.out.println("Enter employee email for system to search:");
		
		do
		{
			SystemOptions(); //Display options to user
			choice = userInput.next().charAt(0);
			
			switch (choice) 
			{
				case '1': //Search for Employee Email
					emailInput = GetEmail(userInput);
					Employee.SearchEmailArray(emailInput, employeeEmails);
					break;
				case '2': //Print Employee Email Array
					Employee.PrintEmailArray(employeeEmails);
					break;
			}
			
		}while (choice != '5');
		
		userInput.close(); //Close scanner
		System.out.println("Goodbye"); //Tell user goodbye
		System.exit(0); //Shut down application	
		
	}
	public static void SystemOptions() // Give User options
	{
		System.out.println("");
		System.out.println("1. [ Search for Employee Email ]");
		System.out.println("2. [ Print List of Employee Emails ]");
		System.out.println("5: { Close Application }");
	}
	public static String GetEmail(Scanner userInput) 
	{
		String findEmail = null;
		boolean validAddress = false;
		
		System.out.print("Input The E-mail ID You Want to Find: ");
		
		do
		{
			
			if (userInput.hasNext()) 
			{
				findEmail = userInput.next().toLowerCase();
				validAddress = true; //valid number received
				
			}
			else
			{
				System.out.println("Invalid Input, please re-enter your e-mail id");
				userInput.nextLine();
				
			}
			
		} while (validAddress == false);
		
		return findEmail;
	}
}
/*
 * Project objective:
 * As a developer, write a program to search a string entered by a user from the
 * array of strings.
 * 
 * Background of the problem statement:
 * You have an array of email IDs of employees. As a programmer, write a program
 * to search the email ID entered by a user.
 * 
 * You must use the following:
 * 
 * Eclipse/IntelliJ: An IDE to code the application Java: A programming language
 * Git: To connect and push files from the local system to GitHub GitHub: To
 * store the application code and track its versions Core Java concepts:
 * Methods, collections, and strings
 * 
 * Following requirements should be met:
 * 
 * The versions of the code should be tracked on GitHub repositories The code
 * should be able to search the required string from the array of strings
 */
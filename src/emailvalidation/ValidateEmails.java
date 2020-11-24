package emailvalidation;
import java.util.Scanner;


public class ValidateEmails {

	public static void main(String[] args) 
	{
		Employee[] employeeEmails = new Employee[10];
		Scanner userInput = new Scanner(System.in);
		
		//Populate array with test emails
		Employee.PopulateEmailArray(employeeEmails);
		//Give user option to list emails in system
		//Get input from user
		System.out.println("Enter employee email for system to search:");
		//
			

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
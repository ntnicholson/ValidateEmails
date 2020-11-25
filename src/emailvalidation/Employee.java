package emailvalidation;
import java.util.Collections;

public class Employee implements Comparable<Employee>
{
	private String employeeEmail;

	public Employee(String employeeEmail) 
	{
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public static void PopulateEmailArray(Employee[] empArray) 
	{
		String[] testEmails = new String[] {"kmiller@optonline.net", "sethbrown@comcast.net"
				, "fwitness@me.com", "policies@yahoo.com", "marioph@yahoo.ca"
				, "jsbach@mac.com", "thurston@aol.com", "monkeydo@outlook.com"
				, "lbecchi@live.com", "nimaclea@me.com", "jelmer@sbcglobal.net"
				, "lukka@aol.com"}; //12 Random Test E-mails
		
		for (int x = 0; x < empArray.length; x++) 
		{
			empArray[x] = new Employee(testEmails[x]);
		}		
		System.out.println("Email Array Populated");
	}
	public static void PrintEmailArray(Employee[] empArray) 
	{
		int counter = 1;
		
		for (Employee e:empArray) 
		{
			System.out.println(counter + ". " + e.getEmployeeEmail());
			counter++;
			
		}		
	}
	public static void SearchEmailArray(String search, Employee[] empArray) 
	{
		int compare = 0;
		boolean matchFound = false;
		
		for(Employee e:empArray) 
		{
			compare = e.compareTo(search);
			
			if (compare == 0)
			{
				System.out.println("Match Found");
				matchFound = true;
				break;
			}		
		}
		if (matchFound == false) {
			System.out.println("Match Not Found");
		}
	}
	private int compareTo(String search) {
		
		return search.compareTo(this.employeeEmail);
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}


}

package emailvalidation;

public class Employee 
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

}

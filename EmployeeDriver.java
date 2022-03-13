import java.util.Scanner;
public class EmployeeDriver
{
	public static void main(String args[])
	
	{
		String dept="";
		String company="";
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstname=obj.nextLine();
		System.out.println("Enter the last name");
		String lastname=obj.nextLine();
		System.out.println("Enter the company name");
		company=obj.nextLine();
		System.out.println("Enter the number according to dept.");
		System.out.println("1. technical");
		System.out.println("2. admin");
		System.out.println("3. hr");
		System.out.println("4. legal");
		int dept_code=obj.nextInt();
		if(dept_code==1)
			dept="tech";
		else if(dept_code==2)
			dept="admin";
		else if(dept_code==3)
			dept="hr";
		else if(dept_code==4)
			dept="legal";
		
		Employee emp=new Employee(firstname,lastname);
		CredentialService cs=new CredentialService();
		cs.showCredentials(firstname, lastname, dept, company);
	}
}

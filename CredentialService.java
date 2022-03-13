
public class CredentialService
{
	public String generatePassword()
	{
		String a=String.valueOf((int)(Math.random()*10));
		String b=String.valueOf((int)(Math.random()*10));
		char c=(char)('a'+(int)((Math.random()*10)));
		String c1=Character.toString(c);
		char d=(char)('A'+(int)((Math.random()*20)));
		String d1=Character.toString(d);
		char e=(char)('!'+(int)((Math.random()*10)));
		String e1=Character.toString(e);
		char f=(char)('a'+(int)((Math.random()*10)));
		String f1=Character.toString(f);
		String password=a+b+c1+d1+e1+f1;
		return password;
	}
	public String generateEmailAddress(String first,String last,String dept,String company)
	{
		String email=first+last+"@"+dept+"."+company+".com";
		return email;
	}
	public void showCredentials(String first,String last,String dept,String company)
	{
		String id=generateEmailAddress(first,last,dept,company);
		String pw=generatePassword();
		System.out.println("Dear"+first+"your generated credentials are as follows:");
		System.out.println("Email---> "+id);
		System.out.println("Password--->"+pw);
	}
}
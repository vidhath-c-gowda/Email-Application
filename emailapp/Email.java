package emailapp;
import java.util.Scanner;

public class Email 
{
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	
	//Constructor to receive the firstname and the lastname
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName );
		
	// Call a method for the depratment
		this.department = setDepartment();
		System.out.println("Department: " +this.department);
		
	//Call a method that returns a random password\
		this.password = randomPassword( defaultPasswordLength );
		System.out.println("Your Password is: " +this.password);
	}
	
	//Ask for the department
	private String setDepartment() 		
	{
		System.out.println("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n4 for None\nEnter department Code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1)
		{
			return "sales";
		}
		else if (depChoice == 2)
		{
			return "dev";
		}
		else if (depChoice == 3)
		{
			return "acct";
		}
		else
		{
			return "";
		}
	}
	
	//Generate random password
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456779@!#$%";
		char[] password = new char[length];
		for ( int i = 0;i < length; i++)
		{
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			}
		return new String(password);
	}
	
	//Set mailbox capacity
	
	//Set alternate email\
	
	//Change the password
}


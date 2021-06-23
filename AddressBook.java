package addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook implements IAddressBook
{	
	//using scanner to take input from user
		Scanner detail = new Scanner(System.in);
		//using Arraylist to store the data 
		List<Person> personList = new ArrayList<Person>();
		
			
			//Add method to add all the data
			public void add() 
			{
			    System.out.println("Enter your first name");
			    String firstName = detail.nextLine();
			    System.out.println("Enter your last name");
			    String lastName = detail.nextLine();
			    System.out.println("Enter your address");
			    String address = detail.nextLine();
			    System.out.println("Enter your city");
			    String city = detail.nextLine();
			    System.out.println("Enter your state");
			    String state = detail.nextLine();
			    System.out.println("Enter your email");
			    String email = detail.nextLine();
			    System.out.println("Enter your zip code");
			    int zip = detail.nextInt();
			    System.out.println("Enter your phoneNo");
			    long phoneNo = detail.nextLong();
			    
			    //craeting person class object
			    Person person1 = new Person();
			    //storing person clas obj into arraylist
			    personList.add(person1);
			    System.out.println(" Added ");
		   }
			
	
		
		public static void main(String[] args) 
		{
			System.out.println("Welcome to Address Book Program");
			
			//object creation of Addressbook
			AddressBook addressBook = new AddressBook();
			//calling add method through object
			addressBook.add();
			
		}	
		
}

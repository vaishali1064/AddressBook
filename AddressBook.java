package addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook implements IAddressBook
{	
	//using scanner to take input from user
		static Scanner detail = new Scanner(System.in);
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
			    Person person1 = new Person(firstName, lastName, address, city, state, zip, phoneNo, email);
			    //storing person class obj into arraylist
			    personList.add(person1);
			    System.out.println("\nAdded ");
		   }
			
			//retrive data from arraylist
			 public void getData() 
			 {
			      for(int i = 0; i< personList.size(); i++) 
			      {
			           Person person = personList.get(i);
			    	   System.out.println("FirstName:"+person.getFirstName()+"\n"+"LastName:"+person.getLastName()+"\n"+"Adress:"+person.getAddress()+"\n"
						      +"City:"+person.getCity()+"\n"+"State:"+person.getState()+"\n"+"email"+person.getEmail()+"Phone-Number:"+person.getPhoneNo()+"\n"+"Pin-code:"+person.getZip());
			    	}
			 }
			//edit data
			public void edit(String firstName) 
			{
	             for (int i = 0; i < personList.size(); i++) 
	             {
	            	Person person = personList.get(i);

	            	System.out.println("Hi " + person.getFirstName() + " please enter your  new Address");
	                String address = detail.nextLine();
	                person.setAddress(address);

	                System.out.println("Hi " + person.getFirstName() + " please enter your  new city");
	                String city = detail.nextLine();
	                person.setCity(city);

	                System.out.println("Hi " + person.getFirstName() + " please enter your  new state");
	                String state = detail.nextLine();
	                person.setState(state);
	                
	                System.out.println("Hi " + person.getEmail() + "please enter your  new email");
	                String email = detail.nextLine();
	                person.setEmail(email);

	                System.out.println("Hi " + person.getFirstName() + " please enter your  new Zip Code");
	                int zip = detail.nextInt();
	                person.setZip(zip);

	                System.out.println("Hi " + person.getFirstName() + " please enter your  new Phone No");
	                int PhoneNo = detail.nextInt();
	                person.setPhoneNo(PhoneNo);

	                System.out.println("Hi " + person.getFirstName() + " you have sucessfully updated");
	             }
			}
			
			 public void delete(String name) 
			 {
		            for (int i = 0; i < personList.size(); i++) 
		            {
		            	if(personList.get(i).getFirstName().equals(name)) 
		            	{
		            		Person person = personList.get(i);
		            		personList.remove(person);
		            	}
		            }
		      }
			 public void addMultiplePerson() 
			 {
	        	 
	             System.out.println("Enter a person Name:");
	             String firstName = detail.nextLine();
	             for(int i = 0; i <  personList.size(); i++) 
	             {
	        	        Person person = personList.get(i);
	        	        if(personList.get(i).getFirstName().equals(firstName)) 
	        	        {
	        	        	System.out.println("Duplicate");
	        	        }	
	        	        else
	        	        {
	        	        	add();
	        	        }
	        	  
			}
		}
		
		public static void main(String[] args) 
		{
			System.out.println("\nWelcome to Address Book Program");
			
			//object creation of Addressbook
			AddressBook addressBook = new AddressBook();
			//calling add method through object
			addressBook.add();
			
			//display retrived data
			addressBook.getData();
			
			
			System.out.println("\nEnter the firstName:");
            String firstName = detail.nextLine();
 	       	addressBook.edit(firstName);
 	       	
 	       //delete data
 	       System.out.println("Enter the Name of the person do you wants to delete");
           String firstName1 = detail.nextLine();
           addressBook.delete(firstName1);
           
           addressBook.addMultiplePerson();
			
		}

}

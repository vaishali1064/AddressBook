package addressBook;

public class Person
{	
		//Declare Variable
		public String firstName;
		public String lastName;
		public String address;
		public String city;
		public String state;
		public int zip;
		public long phoneNo;
		public String email;
	
		
			public Person(String firstName, String lastName, String address, String city, String state, int zip,
				long phoneNo, String email) 
			{
						super();
						this.firstName = firstName;
						this.lastName = lastName;
						this.address = address;
						this.city = city;
						this.state = state;
						this.zip = zip;
						this.phoneNo = phoneNo;
						this.email = email;
		     }
			
			//generate getter and setter
		
			public String getFirstName() {
				return firstName;
			}
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
			public String getLastName() {
				return lastName;
			}
			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public String getState() {
				return state;
			}
			public void setState(String state) {
				this.state = state;
			}
			public int getZip() {
				return zip;
			}
			public void setZip(int zip) {
				this.zip = zip;
			}
			public long getPhoneNo() {
				return phoneNo;
			}
			public void setPhoneNo(long phoneNo) {
				this.phoneNo = phoneNo;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}

}


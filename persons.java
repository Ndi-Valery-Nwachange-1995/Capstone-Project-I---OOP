// Java program that consist of a persons class which contain an attribute, constructor, getter method, 
//setter method and a toString method.

public class persons {
	//attributes
	private String surname;
	private String name;
	private String contactnumber;
	private String email;
	private String physicaladdress;



	//constructor
	public persons(String surname, String name, String contactnumber, String email, String physicaladdress){
		this.surname = surname;
		this.name = name; 
		this.contactnumber = contactnumber;
		this.email = email;
		this.physicaladdress = physicaladdress;

	}

	//Accessory / getter methods	  
	public String getSurname(){
		return surname;
	}
	public String getContactnumber(){
		return contactnumber;
	}

	public String getName(){
		return name;
	}

	public String getEmail(){
		return email;
	}

	public String getPhysicaladdress(){
		return physicaladdress;
	}

	//Accessory / setter methods
	public void setsurname(String surname){
		this.surname = surname;
	}

	public void setname(String name){
		this.name = name;
	}

	public void setContactnumber(String contactnumber){
		this.contactnumber = contactnumber;
	}

	public void setPerEmail(String email){
		this.email = email;
	}

	public void setphysicaladdress(String physicaladdress){
		this.physicaladdress = physicaladdress;
	}

	//The toString method
	public String toString(){
		return "surname: "+surname +
				"\nName: "+ name +
				"\ncontact number: " + contactnumber +
				"\nEmail address: "+ email +
				"\nPysical address: "+ physicaladdress;

	}

}

// calling all the methods of ProjectForm and persons inside the project main.

// importing all java.utill function
import java.util.*;

class project {


	public static ProjectForm getBFInfor(){

		// getperInfor method of projectForm through the keyboard.  		
		@SuppressWarnings("resource")
		Scanner prjnumber = new Scanner(System.in);
		System.out.println("Please enter the number of the project: ");
		short projectnumber = prjnumber.nextShort();

		@SuppressWarnings("resource")
		Scanner prjname = new Scanner(System.in);
		System.out.println("Please enter the name of the project: ");
		String projectname = prjname.nextLine();
		//		    
		@SuppressWarnings("resource")
		Scanner builtype = new Scanner(System.in);
		System.out.println("Please enter the type of the building for the project:\n"
				+ "House\n"
				+ "Apartment\n"
				+ "Store");
		String buildingtype = builtype.nextLine();

		@SuppressWarnings("resource")
		Scanner address = new Scanner(System.in);
		System.out.println("Please enter the physical address of the project: ");
		String physicaladdress = address.nextLine();

		@SuppressWarnings("resource")
		Scanner erfnumber = new Scanner(System.in);
		System.out.println("Please enter the ERF number of the project: ");
		String ERFnumber = erfnumber.nextLine();		  

		@SuppressWarnings("resource")
		Scanner totalfee = new Scanner(System.in);
		System.out.println("Please enter the total fee beein charge of the project: ");
		double totalfeecharge = totalfee.nextDouble();

		@SuppressWarnings("resource")
		Scanner amount = new Scanner(System.in);
		System.out.println("Please enter the total amount paid to date of the project: ");
		double totalamountpaid = amount.nextDouble();		    

		@SuppressWarnings("resource")
		Scanner Deadline = new Scanner(System.in);
		System.out.println("Please enter the Deadline of the project YYYY/MM/DD: ");
		String projectdateline = Deadline.nextLine();
		System.out.println("\n");

		//persons objects created
		System.out.println("capturing the Contractor details.\n================================\n");
		persons contractor = getPerInfor();
		System.out.println("\n");

		System.out.println("Capturing the Costomer details. \n==============================");
		persons costomer = getPerInfor();
		System.out.println("\n");

		System.out.println("Capturing the Architect details. \n==============================");
		persons architect = getPerInfor(); 
		System.out.println("\n");

		// creating all the objects of ProjectForm
		return new ProjectForm(projectnumber, projectname, buildingtype, physicaladdress, 
				ERFnumber, totalfeecharge, totalamountpaid, projectdateline, contractor, costomer, architect);
	}	    
	// getperInfor method of persons which are constructor, costumer and architect
	// through the keyboard.
	public static persons getPerInfor(){
		@SuppressWarnings("resource")
		Scanner userSurname = new Scanner(System.in);
		System.out.println("Please enter the surname of the preson: ");
		String Surname = userSurname.nextLine();

		@SuppressWarnings("resource")
		Scanner userName = new Scanner(System.in);
		System.out.println("Please enter the name of the person: ");
		String Name = userName.nextLine();

		@SuppressWarnings("resource")
		Scanner contact = new Scanner(System.in);
		System.out.println("Please nter the contact number of the person: ");
		String contactnumber = contact.nextLine();

		@SuppressWarnings("resource")
		Scanner email = new Scanner(System.in);
		System.out.println("Please enter the email address of the person: ");
		String emailaddress = email.nextLine();

		@SuppressWarnings("resource")
		Scanner address = new Scanner(System.in);
		System.out.println("Please enter the physical address of the person: ");
		String pysaddress = address.nextLine();

		// creating all the objects of persons
		return new persons(Surname, Name, contactnumber, emailaddress, pysaddress);

	}   


	public static void main(String[] args) {

		// Initialize getBfInfor in to a variable called project
		ProjectForm project = getBFInfor();

		// printing out the content of project
		System.out.println(project);

		// creating a menu for the project
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("\n================ M E N U ================: \n"
				+ "\n Enter 1 to change the Deadline of the project:"
				+ "\n Enter 2 to change the total amount of the fee paid:"
				+ "\n Enter 3 to change the detials of the contractor:"
				+ "\n Enter 4 to finalise the project");

		// Initialize userinput.netInt() to update
		int update = userInput.nextInt();

		// if update is equal to 1	
		if (update == 1) {

			// getting input from the user
			System.out.println("Enter new Deadline: ");

			// assigning a variable called date
			@SuppressWarnings("resource")
			Scanner date = new Scanner(System.in);

			// initializing date.netLine to newDeadline which cast to String
			String newDeadline = date.nextLine();

			// setting newDeadline to project
			project.setprojectDeadline(newDeadline);	

			// printing project
			System.out.println(project);

		}

		//else if update is equal to 2
		else if (update == 2) {

			// getting input from the user
			System.out.println("Please enter the new amount fee paid");

			// assigning a variable called fee
			@SuppressWarnings("resource")
			Scanner fee = new Scanner(System.in);

			// initializing fee.netDouble to newAmount which cast to double
			double newAmount = fee.nextDouble();

			// setting newAmount to project
			project.setTotalAmount(newAmount);

			// printing project
			System.out.println(project);
		}

		// if update is equal to 4
		else if (update == 4) {

			// getting the method TotalFeecharge and initialize to totalfee
			double totalfee = project.getTotalFeeCharge();

			// getting the method TotalFeecharge and initialize to totalamount
			double totalpaid = project.getTotalAmount();

			// performing the differecnce of totalfee and totalpaid and initialize it to grandtotal 
			// which is cast to double
			double grandtotal = totalfee - totalpaid;

			// printing costomer reciept
			System.out.println("costomer reciept. \n=================");

			// printing the getcostomer method
			System.out.println(project.getCostomer());

			// print the sentence plus the get totalfeecharge method
			System.out.println("The total fee charge of the project is: "+ project.getTotalFeeCharge());

			// print the sentence plus the gettotalamount method
			System.out.println("The total amount being paid of the project is: "+ project.getTotalAmount());

			// print the content of grandtotal.
			System.out.println("The total balance to be paid is: "+ grandtotal);

		}	

		//else if update is equal to 3
		else if (update == 3) {

			// getting the contractor details through the keyboard
			System.out.println("Please enter new contractor details");

			// creating a new scanner menu for the contractor
			@SuppressWarnings("resource")
			Scanner contInput = new Scanner(System.in);
			System.out.println("\n================= M E N U =================: \n"
					+ "\n Enter 1 to change the contractor contact number:"
					+ "\n Enter 2 to change the contractor email address:"
					+ "\n Enter 3 to change the contractor physical address:");

			// Initialize userinput.netInt() to syscont
			int sysCont = userInput.nextInt();

			// if syscont is equal to 1
			if (sysCont == 1) {

				// getting new contact from the contractor
				System.out.println("Please enter new contact of the contractor");

				// assigning a variable called newcontact
				@SuppressWarnings({ "unused", "resource" })
				Scanner newContact = new Scanner(System.in);

				// initializing contInput.netLine to newContractordetails which cast to String
				String newContractordetails = contInput.nextLine();

				// project.getcontractor method which is contractor information and setcontractor 
				// number in bracket newContractordetails
				project.getContractor().setContactnumber(newContractordetails);

				// printing the content of project
				System.out.print(project);

			}

			// else if syscont is equal to 2
			else if (sysCont == 2) {

				// getting contractor email address
				System.out.println("Please enter new email address of the contractor");

				// assigning a variable called newemail
				@SuppressWarnings({ "unused", "resource" })
				Scanner newEmail = new Scanner(System.in);

				// initializing contInput.netLine to newContractordetails which cast to String
				String newContractordetails = contInput.nextLine();

				// project.getcontractor method which is contractor information and setcontractor 
				// email in bracket newContractordetails
				project.getContractor().setPerEmail(newContractordetails);

				// printing the content of project
				System.out.print(project);

			}

			// else if syscont is equal to 3
			else if (sysCont == 3) {

				// getting contractor physical address
				System.out.println("Please enter new physical address of the contractor");

				//  assigning a variable called neweaddress
				@SuppressWarnings({ "unused", "resource" })
				Scanner newAddress = new Scanner(System.in);

				// initializing contInput.netLine to newContractordetails which cast to String
				String newContractordetails = contInput.nextLine();

				// project.getcontractor method which is contractor information and setcontractor 
				// physical address in bracket newContractordetails
				project.getContractor().setphysicaladdress(newContractordetails);

				// printing the content of project
				System.out.println(project);
			}

		}
	}
}
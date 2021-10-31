// Java program that consist of a project class which contain an attribute, constructor, getter method, 
//setter method and a toString method.

public class ProjectForm {

	//Attributes
	int projectnumber;
	String projectname;
	String buildingtype;
	String physicaladdress;
	String erfnumber;
	double totalfeecharge;
	double totalamountpaid;
	String projectdeadline;

	//person objects
	persons contractor;
	persons costomer;
	persons architect;


	//constructor
	public ProjectForm(int Projnumber, String projname, String builtype, String physaddress,
			String erfnumber, double totalfeecharge, double totalamountpaid, String projdeadline, persons cont, persons cost, persons archit){
		this.projectnumber = Projnumber;
		this.projectname = projname; 
		this.buildingtype = builtype;
		this.physicaladdress = physaddress;
		this.erfnumber = erfnumber;
		this.totalfeecharge = totalfeecharge;
		this.totalamountpaid = totalamountpaid;
		this.projectdeadline = projdeadline;
		this.contractor = cont;
		this.costomer = cost;
		this.architect = archit;

	}

	//Accessory / getter methods	
	public persons getContractor() {
		return contractor;
	}

	public persons getCostomer() {
		return costomer;
	}

	public persons getArchitect() {
		return architect;
	}

	public int getProjectNumber(){
		return projectnumber;
	}
	public String getProjectDateline(){
		return projectdeadline;
	}

	public double getTotalAmount() {
		return 	totalamountpaid;
	}

	public double getTotalFeeCharge() {
		return totalfeecharge;
	}

	//Accessory / setter methods	
	public void setProjectNumber(int projectnumber){
		this.projectnumber = projectnumber;
	}

	public void setProjectName(String projectname){
		this.projectname = projectname;
	}

	public void setTotalAmount(double totalamountpaid){
		this.totalamountpaid = totalamountpaid;
	}

	public void setTotalFeeCharge(double totalfeecharge) {
		this.totalfeecharge = totalfeecharge;
	}

	public void setprojectDeadline(String projectdeadline){
		this.projectdeadline = projectdeadline;
	}

	public void setcostomer(persons costomer) {
		this.costomer = costomer;
	}

	//The toString method
	public String toString(){
		return "Project Number: "+ projectnumber +
				"\nProject Name: "+ projectname +
				"\nType of building: " + buildingtype +
				"\nPhysical Address: "+ physicaladdress +
				"\nERF Number: "+ erfnumber +
				"\nTotal Fee Charge "+ totalfeecharge +
				"\nTotal Amount: "+ totalamountpaid +
				"\nProject Dateline: "+ projectdeadline +
				"\n\nContractor details\n==================\n\n"+ contractor +
				"\n\nCostomer details\n================\n\n"+ costomer +
				"\n\nArchitect details\n=================\n\n"+ architect;


	}

}
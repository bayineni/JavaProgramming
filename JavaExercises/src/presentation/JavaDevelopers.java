package presentation;

public class JavaDevelopers extends VeridicSolutions {
	public JavaDevelopers(String firstName, String lastName){
		this.role = "Java Developer";
		this.firstName = firstName;
		this.lastName = lastName;
	
	}
	
	private boolean statusOfCoreJava;
	public boolean isStatusOfCoreJava() {
		return statusOfCoreJava;
	}

	public void setStatusOfCoreJava(boolean statusOfCoreJava) {
		this.statusOfCoreJava = statusOfCoreJava;
	}

	boolean statusOfSpringBoot;
	boolean statusOfFrontEnd;
	
	//methods
	public void startTraining() {
		System.out.print("Start the Java training ");
	}
	
	public void statusOfTraining() {
		if (this.statusOfFrontEnd == true)
			
			System.out.print(this.firstName + " " + "has completed the front end concepts and ready for marketing");
				
		else if (this.statusOfSpringBoot == true) 
			System.out.print(this.firstName + " " + "has completed springBoot ");
	
		else if (this.statusOfCoreJava == true)
			System.out.print(this.firstName + " " + "has completed Core Java");
	}
	
	public void startMarketing() {
		if (this.statusOfFrontEnd == false) {
			System.out.print("The Employee haven't completed the training yet");
			
		}
		else System.out.print("Start the Marketing");
	}
}

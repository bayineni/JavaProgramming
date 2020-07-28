package BasicExamples;

public class DevopsEngineer extends VeridicSolutions {
	
	boolean statusOfJenkins;
	boolean statusOfAnsible;
	boolean statusOfSplunk;
	
		
	public DevopsEngineer(String firstName, String lastName) {
		this.role = "Devops Engineer";
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	
	public void startTraining() {
		System.out.print("Start the Devops training ");
	}
	
	public void statusOfTraining() {
		
		
		if (this.statusOfSplunk == true)
			
			System.out.print(this.firstName + " " + "has completed the front end concepts and ready for marketing");
				
		else if (this.statusOfAnsible == true) 
			System.out.print(this.firstName + " " + "has completed springBoot ");
	
		else if (this.statusOfJenkins == true)
			System.out.print(this.firstName + " " + "has completed Core Java");
	}
	
	public void startMarketing() {
		if (this.statusOfSplunk == false) {
			System.out.print("The Employee haven't completed the training yet");
			
		}
		else System.out.print("Start the Marketing");
	

}
}

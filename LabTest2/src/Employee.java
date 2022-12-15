
public class Employee extends Member {
    private String specialization;

    // Constructor
    
    public Employee(String name, int age, String phoneNumber,
                    String address, double salary, String specialization) {
        
    	// accessing data from member class
    	
    	super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
    
    public void printSpecialization(){
   	 System.out.println("Specialization is "+ specialization);
    }
}

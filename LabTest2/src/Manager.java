public class Manager extends Member{
    private String department;

    // Constructor
    
    public Manager(String name, int age, String phoneNumber,
                    String address, double salary, String department) {
        
    	// accessing data from member class
    	
    	super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
    
     public void printDepartment(){
    	 System.out.println("Department is"+ department);
     }
}
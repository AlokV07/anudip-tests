
public class Main{
    public static void main(String[] args) {
        
    	// Object of Employee Class
    	
    	Employee employee = new Employee("Kalua", 23, "9865327421", "New Delhi",659540.56, "IT");
        
    	// Object of Manager Class
    	
    	Manager manager = new Manager("Pappu", 24, "6352419874", "Mumbai", 759425.84, "IT");
    
    	// Print the Salary of Employee and Manager 
    	employee.showDetails();
    	employee.printSpecialization();
    	employee.printSalary();
    	manager.showDetails();
    	manager.printDepartment();
        manager.printSalary();
        
    }
}
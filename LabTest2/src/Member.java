public class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;
    
    // Constructor

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    
    // Print Salary

    public void printSalary() {
        System.out.println("Salary " + salary);
    }
    
    public void showDetails() {
    	System.out.println("Name is "+name);
    	System.out.println("Age is "+age);
    	System.out.println("Phone number is "+phoneNumber);
    	System.out.println("address is "+address);
    }
}

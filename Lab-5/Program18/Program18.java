class Employee{
    private int employeeID;
    private String name;
    Employee(int id, String n){
        employeeID = id;
        name = n;
    }
    void display(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
    }
}

class Teacher extends Employee{
    private int teacherID;
    Teacher(int eID, int tID, String n){
        super(eID, n);
        teacherID = tID;
    }
    void display(){
        System.out.println("Teacher ID: " + teacherID);
        super.display();
    }
}

class Staff extends Employee{
    private int staffID;
    Staff(int eID, int sID, String n){
        super(eID, n);
        staffID = sID;
    }
    void display(){
        System.out.println("Staff ID: " + staffID);
        super.display();
    }   
}

public class Program18 {
    public static void main(String[] args) {
        Staff s = new Staff(1, 2, "Subinay Panda");
        Teacher t = new Teacher(2, 2, "Partha Shankar Nayak");
        
        s.display();
        System.out.println();
        t.display();
    }
}


public class Student extends Teacher{
    String studentName;
    int studentID;
    Student(String name, int id){
        super("", -1);
        studentName = name;
        studentID = id;
    }
    
    public void display(){
        System.out.println("-------------------");
        System.out.println("Student Details: ");
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        super.display();
    }
}


public class Teacher extends College{
    String teacherName;
    int teacherID;

    Teacher(String name, int id){
        super("Brainware University", 1);
        teacherID = id;
        teacherName = name;
    }

    public void display(){
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Teacher ID: " + teacherID);
        super.display();
    }
}

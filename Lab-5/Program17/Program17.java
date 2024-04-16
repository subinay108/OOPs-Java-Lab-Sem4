// WAP in Java to implement Mulitlevel Inheritence (College -> Teacher -> Student)

public class Program17 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        // String collegeName = ui.input("Enter college name: ");
        // int collegeID = Integer.parseInt(ui.input("Enter college ID: "));
        // int n = Integer.parseInt(ui.input("Enter no. of course List: "));
        // for(int i = 0; i < n; i++){

        // }
        String teacherName = ui.input("Enter teacher name: ");
        int teacherID = Integer.parseInt(ui.input("Enter teacher id: ")) ;

        Student s1 = new Student("Subinay Panda", 12);
        s1.teacherName = teacherName;
        s1.teacherID = teacherID;

        s1.display();
        
    }
}

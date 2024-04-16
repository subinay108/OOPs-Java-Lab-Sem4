// import java.util.Vector;

public class College {
    String collegeName;
    int collegeID;
    College(String name, int id){
        collegeName = name;
        collegeID = id;
    }
    // Vector<String> courseList = new Vector<String>();
    public void display(){
        System.out.println("College Name: " + collegeName);
        System.out.println("College Id: " + collegeID);
        // System.out.println("Course List: ");
        // for(String course: courseList){
        //     System.out.print(course);
        // }   
        System.out.println();
    }
    public void addCourse(String course){
        // courseList.add(course);
    }
}

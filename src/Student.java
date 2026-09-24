public class Student extends BSU_Member{
    double gpa;

    Course [] enrolled_courses;
    Student(){
        this.gpa = 0;
        this.enrolled_courses = new Course [6];
        this.status = "Student";
    }
    // Lab work: create a getter method for enrolled_courses attribute
    public Course[] get_Enrolled_Courses(){
        return this.enrolled_courses;
    }

    @Override
    public void display_Info(){
        System.out.println(" Inside student ------Status: " + status);
    }
}

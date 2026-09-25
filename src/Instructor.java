public class Instructor extends BSU_Member{
    String department ;

    Instructor(){
        this.department = "CS";
        this.status = "Faculty";
    }

    Instructor(String department, String status) {
        this.department = department;
        this.status = status;
    }

    // Task: Create a display method that will print the department and status
    @Override
    public void display_Info(){
        System.out.println("Inside instructor------Department: " + this.department + "Status: " + this.status);
    }

}

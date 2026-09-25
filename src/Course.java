public class Course {
    String name;
    int course_number;
    int credit;
    private String classroom;

    Course(){
        name = "";
        course_number = 0;
        credit = 0;

    }
    Course(int course_number, int credit, String name){
        this.course_number = course_number;
        this.credit = credit;

        this.name = name;

    }

    // setters and getters are similar to methods
    // Method signature: Access_modifier Return_type Method_name (Param_type Para_namme){}

    public void Set_Classroom (String classroom){

        this.classroom = classroom;
    }
    public String get_Classroom(){

        return this.classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse_number() {
        return course_number;
    }

    public void setCourse_number(int course_number) {
        this.course_number = course_number;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    // Method for displaying attribute values
    public void display_course_information(){
        System.out.println("Course name: " + this.name + " Course number " + this.course_number);
    }

}

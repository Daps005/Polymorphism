//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
https://github.com/Daps005/Polymorphism

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.display_course_information();
        COSC113 setion1 = new COSC113();

        setion1.display_course_information();

        // Polymorphism
        Course cosc214 = new Course();
        Course section2 = new COSC113();
        // The relationship is: IS-A relationship between course and COSC 113

        cosc214.display_course_information();
        section2.display_course_information();

        //Student object
        Student Arturo = new Student();
        Course math141 = new Course();
        Course frse = new Course();
        Course cosc107 = new Course();
        Course eng102 = new Course();
        Course soc101 = new Course();

        Arturo.enrolled_courses[0] = math141;


        BSU_Member []  members = new BSU_Member[10];
        BSU_Member b1, b2;
        // Creating an object of type Student and storing the reference in a BSU_Member type variable
        b1 = new Student();
        b2 = new Instructor();

        members[0] = b1;
        members[1] = b2;
        members[2] = new Student();
        members[3] = new Instructor();
        members[4] = new BSU_Member();
        members[5] = new Student();
        members[6] = new Instructor();
        members[7] = new BSU_Member();
        members[8] = new Student();
        members[9] = new Instructor();


        for(int j = 0; j<10; j++){
            members[j].display_Info();
        }




    }
}
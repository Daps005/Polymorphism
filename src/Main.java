//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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



    }
}
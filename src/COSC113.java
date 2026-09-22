// Parent class: Course
// Child /sub/Derived class: COSC 113
 public class COSC113 extends Course{
    // public, default, protected attributes are inherited
    // Not inherited,
    // Parent class constructors are not inherited, but can be invoked/called
    // Methods: public, default, protected methods are inherited
 // Package: java files under same folder are considered to be in same package

 String syllabus;
 String coding_language;
 Instructor i1;
 Student[] students;

 COSC113(){
  this.syllabus =  "Java";
  this.coding_language = "Java";
  this.i1= null;
  this.students = null;
  this.course_number = 113;
  this.credit = 4;
  this.name = "COSC 113";

 }
 COSC113(int course_number, int credit, String name){
  // super() will invoke the parent class's default constructor - course()
  // super();
  super(course_number, credit, name);
  this.syllabus =  "Java";
  this.coding_language = "Java";
  this.i1= null;
  this.students = null;

 }
 // Setters and Getters - Lab Work

 // Method Overriding : Defining a method with the same method signature from the parent class
 @Override
 public void display_course_information(){
  // Lab Work - use super. ATTRIBUTE_NAME inside a print statement
  super.display_course_information();
  System.out.println("Syllabus" + this.syllabus + "Language:" + this.coding_language + "Instrutor:" + this.i1 + "Students" + this.students);
 }


}


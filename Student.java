// Define class Student with suitable data members create two objects using
//two different constructors of the class.
public class Student {

        String name;
        String course;
        int age;
        int YearOfStudy;

    public static void main( String[]args) {

        //constructor for object1
      Student student1 = new Student();
       //First object
        student1.name = "Mkonzo Shirlean";
        student1.course = "Computer Science";
        student1.age = 20;
        student1.YearOfStudy = 3;

        //constructor for the second object
      Student student2 = new Student();

        //Second object
        student2.name = "Elimina Asiya";
        student2.course = "ACMP";
        student2.age = 21;
        student2.YearOfStudy = 3;

        //Displaying the results for object1
        System.out.println(student1.name);
        System.out.println(student1.age + "years");
        System.out.println(student1.YearOfStudy);

        //Displaying the results for object 2
        System.out.println(student2.name);
        System.out.println(student2.age + "years");
        System.out.println(student2.YearOfStudy);


    }
}

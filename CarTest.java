public class CarTest {
    public static void main (String args[]){
        Car myCar = new Car(); // constructor for the first car
        //First Object
        myCar.numberplate = "UAE 485E";
        myCar.speed = 47.0;
        myCar.maxSpeed = 180;
        myCar.modelYear = 2010;
        myCar.carMake = "Toyota";

        Car myCar1 = new Car();//constructor for the second car

        //Second object
        myCar1.numberplate = "KDZ 400E";
        myCar1.speed = 40.0;
        myCar1.maxSpeed = 100;


        //Display the details of the FIRST CAR
        System.out.println(myCar.numberplate);
        System.out.println("is moving at" + myCar.speed);
        System.out.println("kilometres per hour");
        System.out.println(myCar.modelYear);
        System.out.println(myCar.carMake);

        //Overriding the details of maxSpeed
        myCar.accelerate(); //method
        System.out.println(myCar.numberplate);
        System.out.println("is moving at" + myCar.speed);
        System.out.println("kilometres per hour");

        //Display the details of the second car
        System.out.println(myCar1.numberplate);
        System.out.println("is moving at" + myCar.speed);
        System.out.println("kilometres per hour");

        //displaying the details after subtracting 5 from the initial speed
        myCar.brake();//method
        System.out.println(myCar.numberplate);
        System.out.println("is moving at" + myCar.speed);
        System.out.println("kilometres per hour");

        // 2nd call to brake
        myCar.brake();
        System.out.println(myCar.numberplate);
        System.out.println("is moving at " + myCar.speed);
        System.out.println("kilometres per hour");

        // 3rd call to brake
        myCar.brake();
        System.out.println(myCar.numberplate);
        System.out.println("is moving at " + myCar.speed);
        System.out.println("kilometres per hour");


    }
}

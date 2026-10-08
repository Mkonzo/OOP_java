
public class Inheritance {
    // Vehicle (superclass)
    protected String brand = "Ford";

    public void honk() {   //vehicle method
        System.out.println("Tuut, tuut!");
    }

    public static void main(String[] args) {
        // Create an instance of the subclass
        Car myCar = new Car();

        // Call the honk method inherited from the superclass
        myCar.honk();

        // Display brand (inherited) and modelName (from Car)
        System.out.println(myCar.brand + " " + myCar.getModelName());
    }
}

// Car is the subclass
class Car extends Inheritance {
    private String modelName = "Mustang";

    public String getModelName() {
        return modelName;
    }
}
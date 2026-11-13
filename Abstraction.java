public class Abstraction {
   /* public abstract void animalSound();
    public void sleep(){
        System.out.printlin("zzzz");
    }
    An object cannot be created from this class
    */

    abstract class Animal {
        public abstract void animalSound();   // abstract method: no body, ends with ;

        public void sleep() {                 // normal method
            System.out.println("Zzzz");
        }
    }

    class Pig extends Animal {
        @Override
        public void animalSound() {           // body provided here
            System.out.println("The pig says: wee wee");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Pig myPig = new Pig();
            myPig.animalSound();
            myPig.sleep();

            // Animal a = new Animal();       // would give an error: cannot create an object of an abstract class
        }
    }
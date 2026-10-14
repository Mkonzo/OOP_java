public class Polymorphism {  //class Animal
    public void animalSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Polymorphism{
    public void animalSound(){
        System.out.println("The dog says:bow bow");
    }
}
class Pig extends Polymorphism{
    public void animalSound(){
        System.out.println("The pig says:wee wee");
    }
}
class Main{
    public static void main(String[] args){
        Polymorphism myPolymorphism = new Polymorphism(); //Create animal object
        Polymorphism myPig = new Pig(); //Create pig object
        Polymorphism myDog = new Dog(); //Create dog object

        myPolymorphism.animalSound();
        myPig.animalSound();
        myDog.animalSound();


    }
}
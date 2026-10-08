public class Encapsulation{
    //public class Person{
        private String name;//Restricted access
        private int age;

        //getter
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        //setter
        public void setName(String newName){
            this.name = newName;
        }
        public void setAge(int newAge){
            this.age = newAge;
        }
    public static void main(String[] args) {
        // Create an object (instance) of the Encapsulation class
        Encapsulation p = new Encapsulation();

        p.setName("Mkonzo");// Use the setter to store a value in the private 'name' field

        p.setAge(21);// Use the setter to store a value in the private 'age'

        // Use the getters to read the values back and print them
        System.out.println(p.getName() + " is " + p.getAge());
    }

}



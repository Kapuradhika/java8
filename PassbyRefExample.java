class Dog {
    String name; 
    public Dog (String name){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class PassbyRefExample {
    public static void nameDog(Dog someDog) {
        someDog.setName("Max");
        System.out.println(someDog.name);
        someDog = new Dog("Fifi");
        System.out.println(someDog.name);
        someDog.setName("Rowlf");        
        System.out.println(someDog.name);
    }

    public static void main(String[] args) {
        Dog aDog = new Dog("Rover"); // creating the "Max" dog at this point, aDog points to the "Max" dog
        System.out.println(aDog.name);
        nameDog(aDog); // aDog still points to the "Max" dog
        System.out.println(aDog.name);
    }
}
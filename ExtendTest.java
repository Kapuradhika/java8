class Base {
    String message = "in base class";
    void printMessage() {
        System.out.println(message);
    }
}

class Child extends Base {
    String message = "in child class";
    void printMessage() {
        System.out.println(message);
    }
}

public class ExtendTest {
    public static void main (String args[]){
        Base base1 = new Base();
        Child child1 = new Child();
        Base base2 = new Child();
        // will compile but will give runtime error
        // Child child2 = (Child) new Base(); 

        base1.printMessage();
        child1.printMessage();
        base2.printMessage();
        
    }
}




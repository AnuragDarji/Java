class Base{
    void printName(){
        System.out.println("Base class");
    }
}
class Child extends Base{
    @Override
    void printName(){
        System.out.println("Child Class");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Base b = new Base();
        b.printName();
        Child c = new Child();
        c.printName();
    }
}

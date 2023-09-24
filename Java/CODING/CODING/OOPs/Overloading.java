class Foo{
    void print(String s){
        System.out.println(s);
    }
    void print(String s, int count){
        while(count > 0){
            System.out.println(s);
            count--;
        }
    }
}

public class Overloading {
    public static void main(String[] args) {
        Foo obj = new Foo();
        // obj.print("Anurag");
        obj.print("Anurag",2);
    }
}

import java.util.*; 
public class Hello{
    public static void main(String[] args){ 
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter your name: ");  
        String name= sc.nextLine();
        System.out.println("Hello "+name);
    }
}

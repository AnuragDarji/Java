import java.util.*;

class Student{
    // 1.
    // String name = "Anurag";
    // int marks = 75;
    
    // public void show_detail(){
    //     System.out.println("name of student is "+name);
    //     System.out.println("marks scored by the student are "+marks);
    // }
    
    // 2.
    // Scanner sc = new Scanner(System.in);
    
    // String name = "";
    // int marks = 0;
    
    // public void get_detail(){
    //     System.out.println("Enter your name: ");
    //     name = sc.nextLine();
    //     System.out.println("Enter your marks: ");
    //     marks = sc.nextInt();
    // }
    
    // public void show_detail(){
    //     System.out.println("name of student is: "+name);
    //     System.out.println("marks scored by the student are: "+marks);
    // }

    //3.
    Scanner sc = new Scanner(System.in);
    
    String name = "";
    int marks = 0;
    
    public Student(String n, int m){
        name = n;
        marks = m;
    } //constructor has no datatype 
    
    public void show_detail(){
        System.out.println("name of student is: "+name);
        System.out.println("marks scored by the student are: "+marks);
    }
}

class TestProject {
    public static void main(String[] args) {
        // Student obj = new Student();
        // obj.get_detail();
        // obj.show_detail();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String my_name = sc.nextLine();
        System.out.print("Enter your marks: ");
        int my_marks = sc.nextInt();

        Student obj = new Student(my_name, my_marks);
        obj.show_detail();
    }
}
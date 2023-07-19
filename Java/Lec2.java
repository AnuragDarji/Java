import java.util.*;

class Lec2{
    public static void main(String[] args) {
        // //Output
        // System.out.println("Hello world");

        // // pattern
        // System.out.println("*\n**\n***\n****\n*****");

        // // variable & Data Types.
        // int a = 20;
        // int b = 30;
        // String name = "Anurag";
        // int sum = a+b;
        // System.out.println("your name is: "+name);
        // System.out.println("Sum is: "+sum);

        // Scanner obj = new Scanner(System.in);
        // // System.out.print("Enter name: ");
        // String name = obj.next(); // only 1 token.
        // String name1 = obj.nextLine();
        // // nextInt()
        // // nextFloat()
        // System.out.println(name);
        // System.out.println(name1);

        // Sum of numbers.
        /* 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        */

        // Loop and Condition

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();

        // if(age>18)
        //     System.out.println("Adult");
        // else
        //     System.out.println("Not Adult");

        // Even or Odd
        /*
        System.out.print("Enter number: ");
        int x = sc.nextInt();

        if(x%2==0)
            System.out.println(x+" is Even number.");
        else
            System.out.println(x+" is Odd number.");
        */

        // Sum of Positive numbers..
        /*
        int sum = 0;

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while(num>=0){
            sum += num;

            System.out.print("Enter number: ");
            num = sc.nextInt();
        }

        System.out.println("Sum= "+sum);
        */

        // Switch example..........

        // System.out.print("Enter button: ");
        // int button = sc.nextInt();

        /*
        if(button==1){
            System.out.println("Hello");
        }
        else if(button == 2){
            System.out.println("Namaste");
        }
        else if(button == 3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid Button");
        }
        */

        // switch(button){
        //     case 1: System.out.println("Hello");
        //     break;

        //     case 2: System.out.println("Namaste");
        //     break;

        //     case 3: System.out.println("Bonjour");
        //     break;

        //     default: System.out.println("Invalid Button"); 
        // }

        //===== For Loop =====
        // for(initialisation; condition; updation)

        // for(int counter=0; counter<3; counter++){
        //     // counter++ => counter = counter+1
        //     System.out.println("Hello World");
        // }


        // Print first 10 numbers..
        // for(int i=0;i<11;i++){
        //     System.out.println(i);
        // }

        // int i = 0;
        // while(i<11){
        //     System.out.println(i);
        //     i = i+1; //i++;
        // }

        // int i=0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }
        // while(i<11);

        // int i=12;
        // while(i<11){
        //     System.out.println("Hello");
        // }

        // do{
        //    System.out.println("Hello"); 
        // }while(i<11);

        // sum of n 
        // System.out.print("Enter num: ");
        // int n = sc.nextInt();

        // int sum = 0;
        // for(int i=1;i<=n;i++){
        //     sum=sum+i;
        // }
        // System.out.println("result is: "+sum);

    }
}
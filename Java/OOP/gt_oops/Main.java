import java.util.Scanner;

// class Vehicle{
//     int cost = 350;
//     int mileage = 40;

//     public void show_vehicle_detail(){
//         System.out.println("I am a vehicle");
//         System.out.println("The cost of the vehicle is "+cost);
//         System.out.println("The mileage of the vehicle is "+mileage);
//     }
// }

// class Car extends Vehicle{
//     String color = "blue";
//     int tyres = 4;

//     public void show_car_detils(){
//         System.out.println("I am a car.");
//         System.out.println("The color of the car is "+color);
//         System.out.println("The number of tyres are "+tyres);
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Car obj = new Car();
//         obj.show_car_detils();
//     }
// }

//============== inheritance with constructor =============
// class Vehicle{
//     int cost = 350;
//     int mileage = 40;

//     public Vehicle(int c, int m){
//         cost = c;
//         mileage = m;
//     }

//     public void show_vehicle_detail(){
//         System.out.println("I am a vehicle");
//         System.out.println("The cost of the vehicle is "+cost);
//         System.out.println("The mileage of the vehicle is "+mileage);
//     }
// }

// class Car extends Vehicle{
//     String color = "blue";
//     int tyres = 4;

//     public Car(int c, int m, String col, int ty){
//          super(c, m);
        
//          color = col;
//          tyres = ty;
//     }

//     public void show_car_detils(){
//         System.out.println("I am a car.");
//         System.out.println("The color of the car is "+color);
//         System.out.println("The number of tyres are "+tyres);
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter cost of vehicle: ");
//         int vehicle_cost = sc.nextInt();
//         System.out.print("Enter mileage of vehicle: ");
//         int vehicle_mileage = sc.nextInt();
//         System.out.print("Enter color of car: ");
//         String car_color = sc.next();
//         System.out.print("Enter number of tyres in car: ");
//         int car_tyres = sc.nextInt();

//         Car obj = new Car(vehicle_cost, vehicle_mileage, car_color, car_tyres);
//         obj.show_car_detils();
//         obj.show_vehicle_detail();
//     }
// }

// ============ Multi-level inheritence =============
// class Parent {
//     String name = "";

//     public Parent(String s){
//         name = s;
//     }

//     public void show_name(){
//         System.out.println("The name is: "+name);
//     }
// }

// class Child extends Parent{
//     int age;

//     public Child(String s,int a){
//         super(s);
//         age = a;
//     }

//     public void show_age(){
//         System.out.println("The age is: "+age);
//     }
// }

// class GrandChild extends Child {
//     String gender = "";

//     public GrandChild(String s, int a, String g){
//         super(s, a);
//         gender = g;
//     }

//     public void show_gender(){
//         System.out.println("The gender is: "+gender);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter name: ");
//         String my_name = sc.next();
//         System.out.print("Enter age: ");
//         int my_age = sc.nextInt();
//         System.out.print("Enter gender: ");
//         String my_gender = sc.next();

//         GrandChild obj = new GrandChild(my_name,my_age,my_gender);
//         obj.show_age();
//         obj.show_gender();
//         obj.show_name();
//     }
// }

// ============= Abstract class ============

// abstract class Animal{
//     public abstract void animalSound();
// }

// class Cat extends Animal{
//     // @Override
//     public void animalSound(){
//         System.out.println("Meow");
//     }
// }

// class Dog extends Animal{
//     // @Override
//     public void animalSound(){
//         System.out.println("Bow Bow");
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Cat c = new Cat();
//         c.animalSound();

//         Dog d = new Dog();
//         d.animalSound();
//     }
// }

// ============ interface in java ============
// Note: in abstract class - having abstract methods or normal methods.
// Note: interface is completely abstract class 

// interface Phone{
//     public void cost();
//     public void color();
//     public void betteryLife();
// }

// class Iphone implements Phone{
//     public void cost(){
//         System.out.println("Cost of iphone is 600$");
//     }
//     public void color(){
//         System.out.println("Color of iphone is Blue");
//     }
//     public void betteryLife(){
//         System.out.println("Bettery life of iphone is 15 hours");
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Iphone ip = new Iphone();
//         ip.betteryLife();
//         ip.color();
//         ip.cost();
//     }
// }

// =========== Extend and implement ============

class Person{
    String name = "";
    int age = 0;

    public Person(String s, int a){
        name = s;
        age = a;
    }

    public void show_person_details(){
        System.out.println("The name of the person is "+name);
        System.out.println("The age of the person is "+age);
    }
}

interface Father {
    public void task();
}

class Man extends Person implements Father{
    int salary=0;
    public Man(String s,int a, int sa){
        super(s, a);
        salary = sa;
    }

    public void task(){
        System.out.println("Earn money");
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String my_name = sc.next();
        System.out.print("Enter age: ");
        int my_age = sc.nextInt();
        System.out.print("Enter salary: ");
        int my_salary = sc.nextInt();

        Man m = new Man(my_name,my_age,my_salary);
        m.task();
        m.show_person_details(); 
    }
}

//     int age =15 ;
//     void data(){
//         System.out.println(this);

//     }
//     public static void main(String[] args) {
//         Hello obj=new Hello();
//         obj.data();
//         System.out.println(obj.age);
//     }
// }

// class Student{
//     int age ;
//     Student(int age){
//         this.age=age ;
//     }
//     void print(){
//         System.out.println(age);
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         Student obj=new Student(16);
//         obj.print();
//     }
// }

// //  
// // class Vehicle{
// //     void run(){
// //         System.out.println("runn krta hai ");
// //     }
// // }
// // class Bike extends Vehicle{
// //     void run(){
// //         System.out.println("ye bhi chalti haii");
// //         super.run();
// //     }
// // }
// //     class Main{
// // //     public static void main(String[] args) {
// // //         Vehicle obj=new Bike();
// // //         obj.run();
// // //     }
// // // }   

// // class parent{
// //     void sum(int a){
// //         System.out.println(a);
// //     }
// //     void sum(int a,int b){
// //         System.out.println(a+b);
// //     }
// // }
// // class Hello{
// //     public static void main(String[] args) {
// //         parent obj=new parent();
// //         obj.sum(87);
// //         obj.sum(87,98);
// //     }

// // }

// abstract  class payment{
//     abstract void pay(int a);
//     void succes(){
//         System.out.println("payment done");
//     }
// }
// class upipayment extends payment{
//     void pay(int a){
//         System.out.println("pay vi upi" +a);
//     }
// }  
// class NetBanking extends payment{
//     void pay(int b){
//         System.out.println("pay via netbanking" +b);

//     }
// }
// class Hello{
//     public static void main(String[] args) {
//         payment obj=new upipayment();
//         obj.pay(21000);
//         obj.succes();
//         payment obj1=new NetBanking();
//         obj1.pay(51000);
//         obj1.succes();
//     }
// }


abstract class Shape{
    abstract void area(int a);
}
class Circle extends Shape{
    void area(int a){
        System.out.println("area of circle is "+(3.14*a*a));
    }
}
class Rectangle extends Shape{
    void area(int a){
        System.out.println("area of rectangle is "+(a*a));
    }
}
class Hello{
    public static void main(String[] args){
        Shape obj=new Circle();
        obj.area(10);
        Shape obj1=new Rectangle();
        obj1.area(10);
    }
}
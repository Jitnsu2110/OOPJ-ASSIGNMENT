class Vehicle1{
void drive(){
System.out.println(" ");
}
}
class Car extends Vehicle1{
void drive(){
System.out.println("Repairing a Car");
}
}
public class A9Q1{
public static void main(String args[]){
Vehicle1 v=new Car();
v.drive();
}
}

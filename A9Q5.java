class Vehicle2{
String make;
String model;
int year;
String fuelType;
Vehicle2(String make,String model,int year,String fuelType){
this.make=make;
this.model=model;
this.year=year;
this.fuelType=fuelType;
}
void fuelEfficiency(){
System.out.println("Fuel Efficiency:15km/l");
}
void distanceTravelled(){
System.out.println("Distance travelled :5000 km");
}
void maximumSpeed(){
System.out.println("Maximum speed :120km/h");
}
}
class Truck extends Vehicle2{
Truck(String make,String model,int year,String fuelType){
super(make,model,year,fuelType);
}
void fuelEfficiency(){
System.out.println("Truck Fuel Efficiency: 8 km/l");
}
void distanceTravelled(){
System.out.println("Truck Distance travelled : 8000 km");
}
void maximumSpeed(){
System.out.println("Truck Maximum speed :100km/h");
}
}
class Car extends Vehicle2{
Car(String make,String model,int year,String fuelType){
super(make,model,year,fuelType);
}
void fuelEfficiency(){
System.out.println("Car Fuel Efficiency: 18 km/l");
}
void distanceTravelled(){
System.out.println("Car Distance travelled : 5000 km");
}
void maximumSpeed(){
System.out.println("Car Maximum speed :180km/h");
}
}
class Motorcycle extends Vehicle2{
Motorcycle(String make,String model,int year,String fuelType){
super(make,model,year,fuelType);
}
void fuelEfficiency(){
System.out.println("Motorcycle Fuel Efficiency: 45 km/l");
}
void distanceTravelled(){
System.out.println("Motorcycle Distance travelled : 3000 km");
}
void maximumSpeed(){
System.out.println("Motorcycle Maximum speed :150km/h");
}
}
class A9Q5{
public static void main(String args[]){
Truck t = new Truck("Tata","Prima",2022,"Diesel");
Car c = new Car("Toyota","Fortuner",2023,"Petrol");
Motorcycle m = new Motorcycle("Honda","Shine",2024,"Petrol");
System.out.println("Truck");
System.out.println(t.make +" " +t.model);
System.out.println("Year : "+t.year);
System.out.println("Fuel Type : "+t.fuelType);
t.fuelEfficiency();
t.distanceTravelled();
t.maximumSpeed();
System.out.println("Car");
System.out.println(c.make +" " +c.model);
System.out.println("Year : "+c.year);
System.out.println("Fuel Type : "+c.fuelType);
c.fuelEfficiency();
c.distanceTravelled();
c.maximumSpeed();
System.out.println("Motorcycle");
System.out.println(m.make +" " +m.model);
System.out.println("Year : "+m.year);
System.out.println("Fuel Type : "+m.fuelType);
m.fuelEfficiency();
m.distanceTravelled();
m.maximumSpeed();
}
}









class Circle1{
double radius;
Circle1(double r){
radius = r;
}
void area(){
double pi=3.14;
double a = pi*radius*radius;
System.out.println("Area of circle : "+a);
}
void circumference(){
double pi=3.14;
double p = 2*pi*radius;
System.out.println("Circumference of Circle :"+p);
}
public static void main(String args[]){
Circle1 c = new Circle1(2.5);
c.area();
c.circumference();
}
}

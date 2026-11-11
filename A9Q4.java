class Shape{
void getPerimeter(){
System.out.println(" ");
}
void getArea(){
System.out.println(" ");
}
}
class Circle extends Shape{
double r=5.0;
void getPerimeter(){
System.out.println("The perimeter of the circle is:"+2*3.141*r);
}
void getArea(){
System.out.println("The area of the circle is:"+3.141*r*r);
}
}
class A9Q4{
public static void main(String args[]){
Shape s;
s=new Circle();
s.getPerimeter();
s.getArea();
}
}
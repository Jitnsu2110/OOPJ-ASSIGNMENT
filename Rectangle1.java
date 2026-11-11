class Rectangle1{
int width;
int height;
void area(int w,int h){
width = w;
height = h;
int a = width*height;
System.out.println("Area of Rectangle: "+a);
}
void perimeter(int w,int h){
width = w;
height = h;
int p= 2*(width+height);
System.out.println("Perimeter of Rectangle:"+p);
}
public static void main(String args[]){
Rectangle1 r = new Rectangle1();
r.area(5,6);
r.perimeter(4,10);
}
}

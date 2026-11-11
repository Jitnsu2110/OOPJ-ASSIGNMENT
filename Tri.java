import java.lang.*;
class Tri
{
public static void main(String args[])
{
int a=5;
int b=4;
int c=3;
double s=(a+b+c)/2.0;
double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("The area of the triangle is:"+area);
}
}
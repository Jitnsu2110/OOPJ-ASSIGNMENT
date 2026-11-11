import java.lang.*;
class Swap1{
public static void main(String args[])
{
int a=5;
int b=3;
a=a^b;
b=a^b;
a=a^b;
System.out.println("After Swapping:");
System.out.println("a="+a);
System.out.println("b="+b);
}
}
import java.lang.*;
class Digit{
public static void main(String args[]){
int num=123;
int a=num/100;
int b=(num/10)%10;
int c=num%10;
int sum=a+b+c;
System.out.println("The sum is:"+sum);
}
}
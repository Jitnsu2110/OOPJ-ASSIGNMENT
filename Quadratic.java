import java.util.Scanner;
class Quadratic{
public static void main(String args[]){
double a,b,c,d;
double s1,s2,s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
a=sc.nextDouble();
System.out.println("Enter the second number:");
b=sc.nextDouble();
System.out.println("Enter the third number:");
c=sc.nextDouble();
d=Math.sqrt(b*b-4*a*c);
s1=(-b-d)/(2*a);
s2=(-b+d)/(2*a);
s=-b/(2*a);
if(d>0){
System.out.println("s1:"+s1);
System.out.println("s2"+s2);
}
else if(d==0){
System.out.println("s:"+s);
}
else{
System.out.println("The root doesnot exist");
}
sc.close();
}
}

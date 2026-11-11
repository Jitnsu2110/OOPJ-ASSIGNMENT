import java.util.Scanner;
class Decimal{
public static void main(String args[]){
double num1,num2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
num1=sc.nextDouble();
System.out.println("Enter the second number:");
num2=sc.nextDouble();
int n1=(int)(num1*1000);
int n2=(int)(num2*1000);
if(n1==n2){
System.out.println("They are the same up to three decimal places:");
}
else{
System.out.println("They are not same up to three decimal places:");
}
sc.close();
}
}

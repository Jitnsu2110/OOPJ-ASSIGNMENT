import java.util.Scanner;
class A3Q4{
public static void main(String args[]){
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
num=sc.nextInt();
if(num>0){
System.out.println("The number is positive:");
}
else if(num<0){
System.out.println("The number is negative:");
}
else{
System.out.println("The number is zero:");
}
sc.close();
}
}
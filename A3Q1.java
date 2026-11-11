import java.util.Scanner;
class A3Q1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st subject mark");
double s1=sc.nextInt();
System.out.println("Enter 2nd subject mark");
double s2=sc.nextInt();

System.out.println("Enter 3rd subject mark");
double s3=sc.nextInt();
System.out.println("Enter 4th subject mark");
double s4=sc.nextInt();
System.out.println("Enter 5th subject mark");
double s5=sc.nextInt();
double total=s1+s2+s3+s4+s5;
double percentage=(total/500.0)*100.0;
System.out.println(total);
System.out.println(percentage);
}
}


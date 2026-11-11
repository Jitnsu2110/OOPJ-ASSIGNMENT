import java.util.Scanner;
class A3Q2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the B.S.");
double bs=sc.nextInt();
double HRA=(bs*10.0)/100.0;
double DA=(bs*60.0)/100.0;
double GS=(bs+HRA+DA);
System.out.println(HRA);
System.out.println(DA);
System.out.println(GS);
sc.close();
}
}

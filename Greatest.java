import java.util.Scanner;
class Greatest{
public static void main(String args[]){
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
a=sc.nextInt();
System.out.println("Enter the second number:");
b=sc.nextInt();
System.out.println("Enter the third number:");
c=sc.nextInt();
if(a>b && a>c){
System.out.println("A is greatest");
}
else if(b>c && b>a){
System.out.println("B is greatest");
}
else{
System.out.println("C is greatest");
}
sc.close();
}
}



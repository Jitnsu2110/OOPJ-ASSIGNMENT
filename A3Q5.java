import java.util.Scanner;
class A3Q5{
public static void main(String args[]){
double cp,sp,p,l,pp,lp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the cp:");
cp=sc.nextDouble();
System.out.println("Enter the sp:");
sp=sc.nextDouble();
if(sp>cp){
System.out.println("The product sell in profit");
p=sp-cp;
pp=(p*100)/cp;
System.out.println("The profit is:"+p);
System.out.println("The total pp is:"+pp);
}
else{
System.out.println("The product sell in loss");
l=sp-cp;
lp=(l*100)/cp;
System.out.println("The loss is"+l);
System.out.println("The total lp is:"+lp);
}
sc.close();
}
}

import java.util.Scanner;
class A3Q3{
public static void main(String args[]){
float pr,cr,tc,amount;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the previous reading");
pr=sc.nextFloat();
System.out.println("Enter the current reading");
cr=sc.nextFloat();
tc=cr-pr;
if(tc<=100){
amount=tc*3;
}
else if(tc<=500){
amount=(100*3)+((tc-100)*4);
}
else{
amount=(100*3)+(400*4)+((tc-500)*6);
}
System.out.println("The used units are:"+tc);
System.out.println("The total amount need to pay is:"+amount);
sc.close();
}
}



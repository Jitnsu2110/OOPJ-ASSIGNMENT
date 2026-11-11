import java.util.Scanner;
class A6Q2
  {
public static void main(String args[])
{
int sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements: ");
int n = sc.nextInt();
int a[]=new int[n];
System.out.print("Enter" + n + "elements");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}


for(int i=0;i<n;i++)
{
sum=sum+a[i];
}
int avg = sum/n;
System.out.println("The average of array element is :"+avg);
}
}

import java.util.Scanner;
class A5Q4{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("Enter a number of elements:");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter" + n + "elements");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("Enter the element to search:");
int key=sc.nextInt();
int low=0;
int high=n-1;
int found=0;
while(low<=high){
int mid=(low+high)/2;
if(a[mid]==key){
System.out.println("Element found in the position");
found=1;
break;
}
else if(a[mid]<key){
low=mid+1;
}
else{
high=mid-1;
}
}
if(found==0){
System.out.println("Element not found");
}
}
}

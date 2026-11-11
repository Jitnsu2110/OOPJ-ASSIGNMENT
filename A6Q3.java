import java.util.Scanner;
class A6Q3
  {
public static void main(String args[])
{
int [] arr = {25,14,56,15,36,56,77,18,29,49};
int Max = arr[0];
int Min = arr [0];
for(int i=1;i<arr.length;i++){
if (arr[i]>Max){
Max = arr[i];
}
if(arr[i]<Min){
Min = arr[i];
}
}
System.out.println("Maximum value for the above array : " +Max);
System.out.println("Minimum value for the above array : " +Min);
}
}
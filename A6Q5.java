import java.util.Scanner;
class A6Q5
  {
public static void main(String args[])
{
String [] arr1 = {"Python","Java","C++","SQL"};
String [] arr2 = {"MySQL","SQL","Oracle","Java"};
System.out.println("Common elements are : [");
for(int i=0;i<arr2.length;i++){
for(int j=0;j<arr1.length;j++){
if(arr2[i].equals(arr1[j])){
System.out.println(arr2[i]);
if(i==0)
System.out.print(" , ");
}
}
}
System.out.println("]");
}
}


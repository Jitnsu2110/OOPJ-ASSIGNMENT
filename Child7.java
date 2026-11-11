interface Parent1{
int a=5;
}
interface Parent2{
int b=6;
}
class Child7 implements Parent1,Parent2{
void display(){
System.out.println(a+" "+b);
}
public static void main(String args[]){
Child7 c=new Child7();
c.display();
}
}

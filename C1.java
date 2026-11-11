class A{
int a;
}
class B extends A{
int b;
void input(){
a=5;
b=6;
}
void display(){
System.out.println(a+""+b);
}
}
class C1 extends B{
void input1(){
a=7;
b=8;
}
void display1(){
System.out.println(a+""+b);
}
public static void main(String args[]){
B b=new B();
b.input();
b.display();
C1 c=new C1();
c.input1();
c.display();
}
}

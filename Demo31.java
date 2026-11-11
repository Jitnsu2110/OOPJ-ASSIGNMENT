class Demo31{
int rollno;
String name;
String sem;
public Demo31(int rollno,String name){
this.rollno=rollno;
this.name=name;
}
public Demo31(String s){
this.sem=s;
}
public Demo31(int p,String q,String s){
this.rollno=p;
this.name=q;
this.sem=s;
}
void display(){
System.out.println(rollno+"\t"+name);
}
void display1(int p,String n){
this.rollno=p;
this.name=n;
System.out.println(rollno+"\t"+name);
}
void display2(int p,String q,String s){
this.rollno=p;
this.name=q;
this.sem=s;
System.out.println(rollno+"\t"+name+"\t"+sem);
}
public static void main(String args[]){
Demo31 ob=new Demo31(123,"Ram");
ob.display();
Demo31 ob1=new Demo31(123,"Ram");
ob1.display();
Demo31 ob2=new Demo31(123,"Ram","3rd");
ob2.display2(123,"Ram","3rd");
}
}

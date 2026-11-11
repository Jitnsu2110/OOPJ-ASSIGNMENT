class Demo32{
int rollno;
String name;
static String university="GIET";
public Demo32(int p,String q){
rollno=p;
name=q;
}
void display(){
System.out.println(rollno+"\t"+name+"\t"+university);
}
public static void main(String args[]){
Demo32 ob=new Demo32(123,"Radhe");
ob.display();
Demo32 ob1 = new Demo32(321,"Krishna");
ob1.display();
}
}

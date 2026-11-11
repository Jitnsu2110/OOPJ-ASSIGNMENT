class Employee1{
String name;
double salary;
int hiredate;
int yearOfService(int date){
int currentYear=2026;
hiredate=currentYear-date;
return hiredate;
}
void display(){
System.out.println("Name:"+name);
System.out.println("Salary:"+salary);
System.out.println("Year Of Service:"+hiredate);
}
public static void main(String args[]){
Employee1 e= new Employee1();
e.name="Subham";
e.salary=45000;
e.yearOfService(2021);
System.out.println("Employee Details:");
e.display();
}
}

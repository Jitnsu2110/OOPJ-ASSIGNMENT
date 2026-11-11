class Person{
String firstname;
String lastname;
Person(String firstname,String lastname){
this.firstname=firstname;
this.lastname=lastname;
}
String getFirstName(){
return firstname;
}
String getLastName(){
return lastname;
}
}
class Employee extends Person{
String employeeid;
String  employeejobtitle;
Employee(String firstname,String lastname,String employeeid,String employeejobtitle){
super(firstname,lastname);
this.employeeid=employeeid;
this.employeejobtitle=employeejobtitle;
}
String getEmployeeId(){
return employeeid;
}
String getLastName(){
return super.getLastName()+"("+employeejobtitle+")";
}
}
class A9Q3{
public static void main(String args[]){
Employee e=new Employee("Subham","Dashmohapatra","EMP79","DataAnalyst");
System.out.println("Firstname:"+e.getFirstName());
System.out.println("Lastname:"+e.getLastName());
System.out.println("Employee ID:"+e.getEmployeeId());
}
}


class BankAccount{
double balance;
BankAccount(double balance){
this.balance=balance;
}
void deposit(double amount){
balance=balance+amount;
System.out.println("Deposited:"+amount);
System.out.println("Balance:"+balance);
}
void withdraw(double amount){
if(amount<=balance){
balance=balance-amount;
System.out.println("Withdraw:"+amount);
System.out.println("Balance:"+balance);
}
else{
System.out.println("Insufficeint balance");
}
}
}
class SavingsAccount extends BankAccount{
SavingsAccount(double balance){
super(balance);
}
void withdraw(double amount){
if(balance-amount>=100){
balance=balance-amount;
System.out.println("Withdraw:"+amount);
System.out.println("Balance:"+balance);
}
else{
System.out.println("Withdrawal not allowed");
System.out.println("Minimum balance of 100 must be maintained");
}
}
}
class A9Q2{
public static void main(String args[]){
SavingsAccount s=new SavingsAccount(500);
s.deposit(200);
s.withdraw(300);
s.withdraw(250);
}
}


class Employee {
    String name;
    String job;
    double salary;

    Employee(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

  
    double calculate(int workingDays) {
        double dailySalary = salary / 30;
        return dailySalary * workingDays;
    }

    void updateSalary(int workingDays) {
        salary = calculate(workingDays);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Job: " + job);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Rosan", "Developer", 30000);

        System.out.println("Before Updating Salary:");
        e1.display();

        e1.updateSalary(25);

        System.out.println("\nAfter Updating Salary:");
        e1.display();
    }
}
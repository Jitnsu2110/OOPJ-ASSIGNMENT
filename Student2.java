import java.util.Scanner;

class Student2 {
    String name;
    int rollno;
    String course;
    void selectCourse() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a Course:");
        System.out.println("1. CSE");
        System.out.println("2. AI & ML");
        System.out.println("3. ECE");
        System.out.println("4. Mechanical");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                course = "CSE";
                break;
            case 2:
                course = "AI & ML";
                break;
            case 3:
                course = "ECE";
                break;
            case 4:
                course = "Mechanical";
                break;
            default:
                course = "Invalid Course";
        }
    }
    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Course Selected: " + course);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student2 s = new Student2();

        System.out.print("Enter Student Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        s.rollno = sc.nextInt();

        s.selectCourse();
        s.display();
    }
}
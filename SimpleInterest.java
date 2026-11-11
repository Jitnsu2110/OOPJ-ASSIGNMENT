class SimpleInterest {
    void calculateSI(double principal, double time) {
        double rate = 5;
        double si = (principal * rate * time) / 100;

        System.out.println("Principal = " + principal);
        System.out.println("Rate = " + rate);
        System.out.println("Time = " + time);
        System.out.println("Simple Interest = " + si);
    }
    void calculateSI(double rate, int time) {
        double principal = 10000;
        double si = (principal * rate * time) / 100;

        System.out.println("Principal = " + principal);
        System.out.println("Rate = " + rate);
        System.out.println("Time = " + time);
        System.out.println("Simple Interest = " + si);
    }

    public static void main(String[] args) {

        SimpleInterest obj = new SimpleInterest();

        // Principal and Time provided
        obj.calculateSI(10000, 2.0);

        System.out.println();

        // Rate and Time provided
        obj.calculateSI(8.0, 3);
    }
}
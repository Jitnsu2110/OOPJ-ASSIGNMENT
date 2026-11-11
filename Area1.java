class Area1{
    static void rectangleArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
    void squareArea(int side) {
        int area = side * side;
        System.out.println("Area of Square = " + area);
    }

    public static void main(String[] args) {
        rectangleArea(8, 5);
        Area1 obj = new Area1();
        obj.squareArea(7);
    }
}
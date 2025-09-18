
public class Shape {
    public void draw() {
        System.out.println("Drawing a Shape");
    }

    public double area() {
        return 0; // default
    }

        public static void main(String[] args) {
            // Polymorphism with Shape
            Shape s1 = new Circle(5);
            Shape s2 = new Rectangle(4, 6);

            s1.draw();
            System.out.println("Area of Circle: " + s1.area());

            s2.draw();
            System.out.println("Area of Rectangle: " + s2.area());

            System.out.println("-------------------");

            // Method Overloading
            CalculatorOverload calc = new CalculatorOverload();
            System.out.println("Sum of 2 ints: " + calc.add(10, 20));
            System.out.println("Sum of 3 ints: " + calc.add(10, 20, 30));
            System.out.println("Sum of 2 doubles: " + calc.add(5.5, 4.5));
        }


}



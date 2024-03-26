public class Area {
    void area(int side) {
        int ar = side * side;
        System.out.println("Area of square: " + ar);
    }

    void area(int l, int b) {
        int ar = l * b;
        System.out.println("Are of rectangle: " + ar);
    }

    void area(int a, int b, int c) {
        int s = (a + b + c) / 2;
        double ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle: " + ar);
    }
}

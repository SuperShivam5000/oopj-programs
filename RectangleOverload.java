public class RectangleOverload {
    int l, b;

    public RectangleOverload() {
        l = 0;
        b = 0;
    }

    public RectangleOverload(int x, int y) {
        l = x;
        b = y;
    }

    void area() {
        int ar = l * b;
        System.out.println("Area: " + ar);
    }
}
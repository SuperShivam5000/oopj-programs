public class Rectangle {
    int l, b, area, perimeter;

    void read(int len, int br) {
        l = len;
        b = br;
    }

    void calculate() {
        area = l * b;
        perimeter = 2 * (l + b);
    }

    void display() {
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
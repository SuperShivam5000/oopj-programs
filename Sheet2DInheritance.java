public class Sheet2DInheritance {
    int l, b;

    public Sheet2DInheritance(int x, int y) {
        l = x;
        b = y;
    }

    public static void main(String[] args) {
        Sheet2DInheritance s1 = new Sheet2DInheritance(10, 10);
        s1.calculate();
    }

    void calculate() {
        int price = l * b * 40;
        System.out.println("Price: " + price);
    }
}
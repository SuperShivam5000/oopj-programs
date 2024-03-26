public class Box3DInheritance extends Sheet2DInheritance {
    int h;

    public Box3DInheritance(int x, int y, int z) {
        super(x, y);
        h = z;
    }

    public static void main(String[] args) {
        Box3DInheritance b1 = new Box3DInheritance(10, 10, 10);
        b1.calculate();
    }

    void calculate() {
        int price = l * b * h * 60;
        System.out.println("Price: " + price);
    }
}
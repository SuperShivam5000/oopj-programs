public class Subtract {
    public static void main(String[] args) {
        Subtract s1 = new Subtract();
        s1.subtract(10, 5);
        s1.subtract(10, 2, 4);
    }

    void subtract(int a, int b) {
        int c = a - b;
        System.out.println("Difference: " + c);
    }

    void subtract(int a, int b, int c) {
        int d = a - (b + c);
        System.out.println("Difference: " + d);
    }
}
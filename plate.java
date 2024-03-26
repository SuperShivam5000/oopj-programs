public class plate {
    int l, w;

    public plate(int x, int y) {
        l = x;
        w = y;
    }

    void display() {
        System.out.println("Length: " + l);
        System.out.println("Width: " + w);
    }

    public static void main(String[] args) {
        plate p1 = new plate(5, 6);
        p1.display();
    }
}

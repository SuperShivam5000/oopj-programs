public class woodbox extends boxplate {
    int t;

    public woodbox(int w, int x, int y, int z) {
        super(w, x, y);
        t = z;
    }

    void display() {
        System.out.println("Length: " + l);
        System.out.println("Width: " + w);
        System.out.println("Height: " + h);
        System.out.println("Thickness: " + t);
    }

    public static void main(String[] args) {
        woodbox b1 = new woodbox(10, 9, 8, 7);
        b1.display();
    }
}

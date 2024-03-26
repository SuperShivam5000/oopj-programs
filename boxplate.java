public class boxplate extends plate {
    int h;

    public boxplate(int x, int y, int z) {
        super(x, y);
        z = h;
    }

    void display() {
        System.out.println("Length: " + l);
        System.out.println("Width: " + w);
        System.out.println("Height: " + h);
    }

    public static void main(String[] args) {
        boxplate b1 = new boxplate(10, 9, 8);
        b1.display();
    }
}

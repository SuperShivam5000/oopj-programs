public class Banana extends Apple {
    void show() {
        super.show();
        System.out.println("Banana");
    }

    public static void main(String[] args) {
        Banana b1 = new Banana();
        b1.show();
    }
}

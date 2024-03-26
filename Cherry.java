public class Cherry extends Apple {
    void show() {
        super.show();
        System.out.println("Cherry");
    }

    public static void main(String[] args) {
        Cherry c1 = new Cherry();
        c1.show();
    }
}

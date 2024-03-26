public class Box {
    int l, w, h;

    public Box(int a, int b, int c) {
        l = a;
        w = b;
        h = c;
    }

    void volume() {
        int vol = l * w * h;
        System.out.println("Volume: " + vol);
    }
}
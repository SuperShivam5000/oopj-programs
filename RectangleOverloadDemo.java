public class RectangleOverloadDemo {
    public static void main(String[] args) {
        RectangleOverload rect1 = new RectangleOverload();
        rect1.area();
        RectangleOverload rect2 = new RectangleOverload(10, 5);
        rect2.area();
    }
}
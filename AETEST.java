public class AETEST {
    public static void main(String[] args) {
        try {
            int x = 5 / 0; // This line will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught!");
        } finally {
            System.out.println("Finally Block is executed");
        }
    }
}

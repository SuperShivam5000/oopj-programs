public class NegativeNumberException extends Exception {
    public NegativeNumberException(String message){
        super(message);
    }

    void processInput(int n) throws NegativeNumberException {
        if(n < 0)
            throw new NegativeNumberException("Input cannot be negative");
    }

    public static void main(String[] args) {
        try {
            int x = -2;
            NegativeNumberException exception = new NegativeNumberException("Custom Message");
            exception.processInput(x);
            System.out.println((double)x);
        }
        catch(NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
public class MinException extends Exception{
    public MinException(String message) {
        super(message);
    }
    void throwsMinException(int m) throws MinException {
        if(m>60 || m<0) throw new MinException("Min Exception!!!");
    }
}

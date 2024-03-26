public class SecException extends Exception {
    public SecException(String message){
        super(message);
    }
    void throwSecException(int s) throws SecException{
        if(s>60 || s<0) throw new SecException("Sec Exception!!!");
    }
}

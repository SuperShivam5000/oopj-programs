public class HrsException extends Exception{
    HrsException(String message){
        super(message);
    }
    void throwHrsException (int h) throws HrsException{
        if(h>24 || h<0){
            throw new HrsException("Hrs Exception!!!");
        }
    }
}

public class CheckArgument extends Exception {
    public CheckArgument(String message){
        super(message);
    }
    void throwCheckArgument(String[] args) throws CheckArgument{
        if(args.length<4) throw new CheckArgument("Check Argument!!!");
    }
}

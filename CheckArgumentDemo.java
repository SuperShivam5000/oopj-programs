public class CheckArgumentDemo {

    public static void main(String[] args) {
        CheckArgument argument = new CheckArgument("Check Argument!!!");
        try {
            argument.throwCheckArgument(args);
        } catch(CheckArgument e) {
            System.out.println(e);
        }
    }
}
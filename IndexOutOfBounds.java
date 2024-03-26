public class IndexOutOfBounds {
    public static void main(String[] args){
        try{
            int arr[] = new int[5];
            arr[6]=15;
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Exception Caught! "  + a);
        }
    }
}

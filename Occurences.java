import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        int i, j;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no. of numbers: ");
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            arr[i] = obj.nextInt();
        }
        obj.close();
        int c = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    c++;
                }
            }
            System.out.println("Number of occurences of " + arr[i] + " is " + c);
            c = 0;
        }
    }
}

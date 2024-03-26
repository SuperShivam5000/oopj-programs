import java.util.*;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = obj.nextInt();
        Student s[] = new Student[n];
        int i;
        for (i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.print("Enter Name: ");
            s[i].name = obj.next();
            System.out.print("Enter Roll: ");
            s[i].roll = obj.nextInt();
            System.out.print("Enter CGPA: ");
            s[i].cgpa = obj.nextDouble();
        }
        String lowestname = s[0].name;
        double lowest = s[0].cgpa;
        for (i = 0; i < n; i++) {
            System.out.println("Name: " + s[i].name + " Roll No. " + s[i].roll + " CGPA: " + s[i].cgpa);
            if (s[i].cgpa < lowest) {
                lowestname = s[i].name;
            }
        }
        System.out.println("Lowest CGPA: " + lowestname);
        obj.close();
    }
}

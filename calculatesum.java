import java.util.Scanner;

public class FindAverageUsingScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = scan.nextInt();
        int added = num1 + num2 + num3;
        added = added/3;
        System.out.print(added);
    }
}

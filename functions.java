import java.util.*;

public class functions {
    public static void calculateFacto(int n) {
        int factorial = 1;
        if (n < 1) {
            System.out.println("Please enter a valid number..");
            return;
        }
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;

        }
        System.out.print("Factorial of " + n + " is: " + factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();

        calculateFacto(n);
    }
}

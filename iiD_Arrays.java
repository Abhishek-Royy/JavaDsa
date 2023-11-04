import java.util.*;

public class iiD_Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = sc.nextInt();

        System.out.print("Cols: ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter rows & cols elem: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}


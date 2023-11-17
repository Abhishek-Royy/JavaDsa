public class recursionClass1 {
    public static void calculateSum(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.print("Sum is: "+sum);
            return;
        }
        sum = sum + i;
        calculateSum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        calculateSum(1, 5, 0);
    }
}
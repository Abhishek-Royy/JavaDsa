public class recursionClass1 {
    public static int calcLogn(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        // n is even
        if (n % 2 == 0) {
            int xpown = calcLogn(x, n / 2) * calcLogn(x, n / 2);
            return xpown;
        } else { // n is odd
            int xpownw = calcLogn(x, n / 2) * calcLogn(x, n / 2) * x;
            return xpownw;
        }
    }

    public static void main(String[] args) {
        int ans = calcLogn(2, 5);
        System.out.println("Ans is:" + ans);

    }
}
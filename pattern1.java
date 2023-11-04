import java.util.*;
public class pattern1 {
    public static void main(String[] args) {

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the last limit: ");
        int n=sc.nextInt();

        int a=0, b=1;

        System.out.println(a+ " ");

        if(n>=1){
            for (int i=2;i<=n;i++){
                System.out.println(b+ " ");
                int temp=b;
                b=a+b;
                a=temp;
            }
            System.out.println("Fibonacci Series sum is: "+a);
        }
    }
}

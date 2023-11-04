import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array length: ");
        int len = sc.nextInt();

        int arr[]=new int[len];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter each elem: ");
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter X value: ");
        int x=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.print("The match index value is: "+i);
                break;
            }
        }
    }

}

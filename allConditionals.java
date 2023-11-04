import java.util.*;

public class allConditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
         * System.out.print("Please enter your Age: ");
         * int age=sc.nextInt();
         * 
         * if(age>=18){
         * System.out.println("He is an Adult..!");
         * }
         * else if(age>=14 && age<18){
         * System.out.println("He is an Mature..!");
         * }
         * else{
         * System.out.println("He is a Children..!");
         * }
         */

        /*
         * System.out.print("Please enter a number: ");
         * int num = sc.nextInt();
         * 
         * if (num % 2 == 0) {
         * System.out.printf("%d is a even Number..!", num);
         * } else {
         * System.out.printf("%d is a Odd number", num);
         * }
         */

        /*
         * System.out.print("Enter the a value: ");
         * int a=sc.nextInt();
         * System.out.print("Enter the b value: ");
         * int b=sc.nextInt();
         * 
         * if(a==b){
         * System.out.println("The Bothe Number are Equal..!");
         * }
         * else if(a>b){
         * System.out.println(a+" is greater than "+b);
         * }
         * else if(a<b){
         * System.out.println(b+" is greater than "+a);
         * }
         * else{
         * System.out.println("Please enter a valid number..!");
         * }
         */

        System.out.print("Please Enter your choice: ");
        int btn = sc.nextInt();

        switch (btn) {
            case 1:
                System.out.println("Hello Guys");
                break;
            case 2:
                System.out.println("Namaste Bharat");
                break;
            case 3:
                System.out.println("mo timilai maya garxu");
                break;
            default:
                System.out.println("Invalid Input..!");
        }
    }

}

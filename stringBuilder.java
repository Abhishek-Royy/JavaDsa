import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {

        /*
         * STRING BUILDER ALL METHOD
         * // Declare StringBuilder
         * StringBuilder sb = new StringBuilder("Abhi");
         * System.out.println(sb);
         * 
         * We can also print any particular charecter from a particular string
         * System.out.println(sb.charAt(1));
         * 
         * // Set char at Index..
         * sb.setCharAt(1, 's') ;
         * System.out.println(sb);
         * 
         * // We can insert charecter at any index , as our wish
         * sb.insert(1, 'k');
         * System.out.println(sb);
         * 
         * // We can delete any char or substring by using starting index or ending
         * index.
         * sb.delete(1, 2);
         * System.out.println(sb);
         * 
         * // We can Append any substring or char
         * sb.append("s");
         * sb.append("h");
         * sb.append("e");
         * sb.append("k");
         * System.out.println(sb);
         * 
         * //We can print length of a string
         * System.out.println(sb.length());
         */


      // REVERSE ANY STRING BUILDER
    StringBuilder sb=new StringBuilder("java");
    for(int i=0;i<sb.length()/2;i++){
        int front=i;
        int back=sb.length()-1-i;

        char fontChar=sb.charAt(front);
        char backChar=sb.charAt(back);

        sb.setCharAt(front, backChar);
        sb.setCharAt(back, fontChar);
    }
    System.out.println(sb);


        }

}

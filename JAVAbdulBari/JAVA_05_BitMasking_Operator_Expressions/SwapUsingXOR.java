
// package JAVAbdulBari.JAVA_05_BitMasking_Operator_Expressions;
import java.util.*;

public class SwapUsingXOR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 50;

        // int temp = a;
        // a = b;
        // b = temp;

        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;

        // a = a + b;
        // b = a - b;
        // a = a - b;

        a = a + b - (b = a);

        System.out.println("a = " + a + " " + "b = " + b);

    }

}

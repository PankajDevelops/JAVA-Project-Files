package JAVAbdulBari.JAVA_05_BitMasking_Operator_Expressions;

import java.util.Scanner;
import java.math.*;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.useRadix(2);

        int n = sc.nextInt();
        
        System.out.println(n);

        // int n = 101;
        // double ans=0;
        // int i=0;

        // while(n!=0){

        // int digit = n%10;
        // if(digit==1){
        // ans = ans + (Math.pow(2,i));
        // }

        // n=n/10;
        // i++;
        // }

        // int ans2 = (int)ans;
        // System.out.println(ans2);

    }

}

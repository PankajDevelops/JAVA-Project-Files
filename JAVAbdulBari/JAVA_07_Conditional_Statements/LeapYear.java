import java.util.*;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year;

        year = sc.nextInt();

        // if(n%4 ==0 && n%400 == 0){
        // System.out.println("Leap Year");
        // }
        // else{
        // System.out.println("Not a Leap Year");
        // }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Its a Leap Year");

                } else
                    System.out.println("Not a Leap Year");

            } else {
                System.out.println("Its a Leap Year");

            }

        } else {
            System.out.println("Not a Leap Year");
        }

    }

}

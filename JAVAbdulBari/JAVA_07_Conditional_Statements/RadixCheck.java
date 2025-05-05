import java.util.*;
public class RadixCheck {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any type of Number to check: ");

    String str = sc.nextLine();

    Boolean bin = str.matches("[01]+");

    Boolean oct = str.matches("[0-7]+");

    Boolean hex = str.matches("[0-9 A-F]+");

    if(bin==true){
        System.out.println("Binary Number");
    }
    else if(oct==true){
        System.out.println("Octal Number");
    }
    else if(hex==true){
        System.out.println("Hexadecimal Number");
    }
    else{
        System.out.println("Decimal Number");
    }
    
         }
}
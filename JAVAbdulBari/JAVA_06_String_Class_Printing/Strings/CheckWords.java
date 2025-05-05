package JAVAbdulBari.JAVA_06_String_Class_Printing.Strings;
import java.util.*;
public class CheckWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.next();

        if(str1.contains(str2)){

            System.out.println(str2+" "+"Present");

        }

        else{

            System.out.println(str2+" "+"Not Present");
        
        }
        
        
    }
}
    


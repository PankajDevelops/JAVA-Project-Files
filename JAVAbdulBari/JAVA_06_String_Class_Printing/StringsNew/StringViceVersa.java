import java.util.*;
public class StringViceVersa {

    public static void main(String[] args) {
        
        String str = "P@anKaJ";
        String s = "";

        int n = str.length();

        for(int i=0; i<n; i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                String b = String.valueOf(str.charAt(i)).toUpperCase();
                s+=b;
            }

            else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                String b = String.valueOf(str.charAt(i)).toLowerCase();
                s+=b;
            }

            else if(str.charAt(i)==' '){
                s+=" ";
            }
        }

        System.out.println(s);

    }
    
}

package JAVAbdulBari.JAVA_06_String_Class_Printing.Strings;

import java.lang.*;

public class MyStringBuilder {

    public static void main(String[] args) {
        

        StringBuilder sb = new StringBuilder("");

        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch+" ");
        }


System.out.println(sb);
System.out.println(sb.length());

    }
    
}

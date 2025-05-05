import java.util.*;

public class uperTolowerAlternate {

    public static void main(String[] args) {

        String str = "AbCdE FGhj";

        StringBuilder sb = new StringBuilder(str);

        for(int i =0; i<str.length(); i++){
            boolean flag = true;

            char ch = str.charAt(i);

            int asci = (int)ch;

            if(ch==' ') continue;

            if(asci>=97) flag = false;
            if(flag==true){
                asci+=32;
                char dh = (char)asci;
                sb.setCharAt(i,dh);
            }

            else{
                asci-=32;
                char dh = (char)asci;
                sb.setCharAt(i,dh);
            }
        }

System.out.println(sb);
        
    }
    
}

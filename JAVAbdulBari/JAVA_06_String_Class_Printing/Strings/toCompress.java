package JAVAbdulBari.JAVA_06_String_Class_Printing.Strings;
public class toCompress {

    public static String toCompress(String str){

        StringBuilder sb =new StringBuilder("");

        for(int i=0; i<str.length();i++){

            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
               
        return sb.toString();

    }

    public static void main(String[] args) {

        String str=("aaabbcccdd");

        System.out.println(toCompress(str));
        
    }
}
 


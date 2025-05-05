package JAVAbdulBari.JAVA_06_String_Class_Printing.Strings;

public class CheckPalindrome {

    public static boolean isPlaindrome(String str){

    int n= str.length();

    for(int i=0; i<n/2; i++){

        if(str.charAt(i)==str.charAt(n-1-i)){
            return false;
        }
    }
    
    return true;
}
    public static void main(String[] args){

        String str="noon";
       
        System.out.println(isPlaindrome(str));    

    }
}



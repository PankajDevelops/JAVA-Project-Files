package JAVAbdulBari.JAVA_06_String_Class_Printing.Strings;

public class LargestString {




    public static void main(String[] args){

       String str[]={"apple","banana","orange"};
        
        String large=str[0];
        
        for(int i=1;i<str.length;i++){
            
            if(large.compareTo(str[i])<0){
                large=str[i];
            }
        }
        
        System.out.print(large);

    }
}

    


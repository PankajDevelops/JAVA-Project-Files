package JAVAbdulBari.JAVA_06_String_Class_Printing.Strings;
public class ShortestPath {


    public static float shortDistance(String str){

    int n= str.length();
    int X=0,Y=0;

    for(int i=0; i<n-1; i++){

        if(str.charAt(i)=='N'){
            Y++;
            
        }
        else if(str.charAt(i)=='S'){
            Y--;
        }
        else if(str.charAt(i)=='W'){
            X--;
        }
       else if(str.charAt(i)=='E'){
            X++;
        }

    }
    int X1=X*X;
    int Y1=Y*Y;

    return (float)Math.sqrt(X1+Y1);

}
    public static void main(String[] args){

        String str="WNEEENESENNN";
       
        System.out.println(shortDistance(str));
        

    }
}

    


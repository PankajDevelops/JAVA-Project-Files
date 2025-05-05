public class MethodsIntroduction {

    /*static*/ int max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        
        int a=10;
        int b=20;
        int c;

        MethodsIntroduction mi=new MethodsIntroduction();
        System.out.println(mi.max(a,b));

        // c=max(a,b);
        // System.out.println(c);

    }
    
}

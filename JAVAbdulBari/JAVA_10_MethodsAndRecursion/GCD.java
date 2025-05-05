public class GCD {

    static int checkGCD(int x, int y){

        if(x==0){
            return y;
        }
        if(y==0){
            return x;
        }

        while(x!=y){

            if(x>y){
            x=x-y;
        }
        else{
            y=y-x;
            
         }
        }


        return y;
    }
    
    public static void main(String[] args) {
        
        int x=35;
        int y=56;

        int gcd = checkGCD(x, y);

        System.out.println(gcd);
    }
}

public class Factorial {

    public static int fact(int n){


        if(n==0){
            return 1;
        }
        
        // int fnm1=fact(n-1);
        int fn = n* fact(n-1);
        return fn;
    }
        public static int sum(int n){


        if(n==1){
            return 1;
        }
        
        // int fnm1=fact(n-1);
        int sn = n+ sum(n-1);
        return sn;
    }
    

    public static void main(String[] args) {
        
int num=5;
int sum=5;

System.out.println(fact(num));
System.out.println(sum(num));

    }
    
}

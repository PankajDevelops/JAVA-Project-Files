public class Fibonaaci {

    public static int fib(int n){

        int fib1=0;
        int fib2=1;
        int temp=0;

        if(n==0 || n==1){
            return n;
        }
            // temp=fib1+fib2;
            temp=fib(n-1)+fib(n-2);

        

        return temp;
    }

    public static void main(String[] args) {
        
int n=6;

System.out.println(fib(n));


    }
    
}

public class CountDigits {

    public static void main(String[] args) {
        
        int n =256;
        int count =0;
        
        while(n>0)
        {
            int r = n%10;
            n=n/10;
            count = count+1;
        }
        System.out.print(count);
        
        
        
    }
    
}
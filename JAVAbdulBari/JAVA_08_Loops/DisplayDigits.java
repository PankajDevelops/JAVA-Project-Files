public class DisplayDigits {
    public static void main(String[] args) {
        

        int n =256;
        
        
        while(n>0)
        {
            int r = n%10;
            n=n/10;
            
            System.out.println(r);
        }

    }
    
}

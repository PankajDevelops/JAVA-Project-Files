public class RevesreOfNumber {

        public static void main(String[] args) {
            
            int n = 273;
            
            int rev =0;
            int r;
            while(n>0){
                r=n%10;
                rev = (rev*10)+r;
                n=n/10;
            }
            System.out.print(rev);
            
        }
        
        
    }
    


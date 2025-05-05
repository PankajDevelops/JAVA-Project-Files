public class CheckArmstrong {

    public static void main(String[] args) {
        
        int n = 153;
        int sum = 0;
        int m=n;
        
        while(n>0)
        {
            int r = n%10;
            sum = sum+(r*r*r);
            n=n/10;
            
        }

        if(m==sum){
        System.out.println("Armstrong");
        
        }
        
        else{
        System.out.println("Not Armstrong");
        
        }
        
        
        
    }
    
}
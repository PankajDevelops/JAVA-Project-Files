import java.lang.Math;
public class CheckPalindromeNumber {

    public static void main(String[] args) {
        
        int n=123;
        int digit;
        int ans=0;

        int p=ans;

        while(n>0){
    
            digit = n%10;
            ans = (ans*10)+digit;           
            n=n/10;
            
        }

        System.out.println(ans);

        // if(n==p)
        // {
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not Palindrome");
        // }
    }
    
}

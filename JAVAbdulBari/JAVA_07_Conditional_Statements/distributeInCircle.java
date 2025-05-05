public class distributeInCircle {

    public static void main(String[] args) {
        
        int a = 8; //no. of chocolates
        int b = 5; // no. of places or students
        int c = 2; // starting point

        int ans = (a + c - 1) % b;

        if(ans == 0){
            System.out.println(b);
        }

        System.out.println(ans);

    }
    
}

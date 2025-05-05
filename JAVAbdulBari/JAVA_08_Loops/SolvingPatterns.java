public class SolvingPatterns {
    public static void main(String[] args) {
            
        // for(int i=1;i<=5;i++){
            
        //     for(int j=1;j<=5;j++){

           
        //         if(i+j>5)
        //                    System.out.print("*");
        //                else
        //                    System.out.print(" ");
                
        //     }
            
        //     System.out.println("");
            
        // }

        // int n=5;
        // for(int row=1; row<=n; row++){
        //     for(int col=1 ;col<=n-row+1;col++){

        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }

        int n=4;

        for(int row=1; row<=n; row++){
            
            for(int col=1; col<=row; col++){
                System.out.print(" ");}

            for(int space=4; space>=row; space--){
                
                    System.out.print("*");
                
            }
            
        
            
        System.out.println();    
        }
               
               
        }
    }      
    


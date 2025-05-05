public class TwoDimArray {

    public static void main(String[] args) {
        
        int arr[][] = new int [3][3];

        int brr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int crr[][];

        crr = new int[3][3];

       /*  for(int i=0; i<brr.length; i++ ){
            for(int j=0; j<brr[0].length; j++){
                System.out.print(brr[i][j]+" ");
            }

            System.out.println("");
        }

        */

        int A[][];

        A=new int [3][];

        A[0]=new int [3];
        A[1]=new int [7];
        A[2]=new int [4];

        for(int x[]:A){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }

        
  
    }
    
}

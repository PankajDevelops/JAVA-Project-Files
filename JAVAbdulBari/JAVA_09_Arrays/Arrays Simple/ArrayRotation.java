public class ArrayRotation {
    public static void main(String[] args) {
        

// /* #left rotation*/

//         int A[]={1,2,3,4,5,6,7,8,9};

//         for (int x:A){
//             System.out.print(x+" ");
            
//         }
//         System.out.println("");
//         int temp=A[0];

//         for(int i=1; i<A.length; i++){

//             A[i-1]=A[i];

//         }

//         A[A.length-1]=temp;

//         for (int x:A){
//             System.out.print(x+" ");
            
            
//         }
//         System.out.println(""); 

// 	    #right rotation

int A[]={1,2,3,4,5,6,7,8,9};

for (int x:A){
     System.out.print(x+" ");
     
 }
 System.out.println("");

 int temp=A[A.length-1];

 for(int i=A.length-1; i>0; i--){

     A[i]=A[i-1];
     
 }

 A[0]=temp;

 for(int x:A){
     
     System.out.print(x+" ");
 }
 System.out.println("");
		
	}
}


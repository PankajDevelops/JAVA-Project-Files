import java.util.*;
import java.Math.*;
public class ArraySum{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*1. Find the sum of all elements;
         int A[]={5,3,6,7,8};

         int sum=0;

         for(int i=0; i<A.length;i++){

             sum = sum+A[i]; 
         }

         System.out.println(sum);

         2. Searching an element.

        System.out.println("Enter the elements to search: ");


        int A[]={5,3,6,7,8};
        int res = sc.nextInt();


        for(int i=0; i<A.length;i++){

            if(A[i]==res){
            
            System.out.println(res);
            System.exit(0);
         }
         }
         System.out.println("Not Found");
        }

        3. Finding Maximum Element.

        int A[]={5,3,6,7,8};

         int max=A[0];

         for(int i=0; i<A.length;i++){

             if(A[i]>max){

                max=A[i];

              }
              // max=Math.min(max,arr[i]);
            }
                System.out.println(max); */

    // 4. Second largest element in an array;

         int A[]={5,3,6,4,8,7};

         int max1=A[0];

         int max2=A[0];

         for(int i=0; i<A.length;i++){

             if(A[i]>max1){

                max2=max1;
                max1=A[i];
                
              }
              else if(A[i]>max2){
                max2=A[i];

              }
            }

            System.out.println(max2);


    }
}
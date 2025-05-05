public class DelationInArray {
    public static void main (String[] args){

       int arr[]= new int[10];

       arr[0]=2;
       arr[1]=4;
       arr[2]=6;
       arr[3]=8;
       arr[4]=10;
       arr[5]=12;
       arr[6]=14;

       int n=7;

       for(int i=0; i<n; i++){

        System.out.print(arr[i]+" ");
       }
System.out.println("");

int temp=2;

for(int i=temp; i<n; i++){
    
        arr[i]=arr[i+1]; 
   
    
}
--n;

       for(int i=0; i<n; i++){

        System.out.print(arr[i]+" ");
       }


       
}

    }


    
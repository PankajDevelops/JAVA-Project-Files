import java.math.*;
class MinMaxNew {
    
    public static int Maxi(int arr[], int n){
        int min = Integer.MIN_VALUE;
        for(int i=0; i<5; i++){
            if(arr[i]>min){
                min=arr[i];
            }
        } 
        return min;
    }
    
     public static int Mini(int arr[], int n){
        int max = arr[0];
        for(int i=0; i<5; i++){
            // if(arr[i]<max){
            //     max=arr[i];
            // }
            
            max=Math.min(max,arr[i]);
        } 
        return max;
    }
    
    public static void main(String[] args) {
        
        int arr[]={2,4,6,8,10};
        
        int Max=Maxi(arr,5);
        System.out.println(Max);
        
        int Min=Mini(arr,5);
        System.out.println(Min);
        
    }
}
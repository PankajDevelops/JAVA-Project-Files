import java.util.*;
class ReverseNew {
    
    static void swap(int arr[], int i, int j){
        
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
//   static void Rev(int arr[], int n){
      
      
//       int start=0;
//       int end=n-1;
//       while(start<=end){
//           swap(arr,start,end);
//           start++;
//         end--;
//       }    
// } 
  
  static void Rev(int arr[], int n){
      
      
      int start=0;
      int end=n-1;
      while(start<=end){
          int temp = arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          start++;
        end--;
      }
      
  }


  
  static void print(int arr[], int n){
      for(int i=0; i<n; i++){
          System.out.print(arr[i]+" ");
      }
  }
    
    public static void main(String[] args) {
        
        int arr[]={2,4,6,8,10};
        
        print(arr,5);
        System.out.println(" ");
        Rev(arr,5);
        print(arr,5);
        
    }
}

class LinearSearch {
    
  static Boolean LinearSearch(int arr[], int n, int key){
      
      for(int i=0; i<n; i++){
          if(arr[i]==key){
              return true;
          }
      }
      return false;
  }
    
    public static void main(String[] args) {
        
        int arr[]={2,4,6,8,10};
        
        Boolean bool = LinearSearch(arr,5,4);
        
        if(bool){
            System.out.print("Found");
        }
        else{
           System.out.print("Not Found"); 
        }
        
    }
}
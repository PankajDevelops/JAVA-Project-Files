public class maxElemArray {

    static int maxElement(int arr[], int size){

        int min=0;
        for(int i=0; i<size; i++){

            if(arr[i]>min){
                min=arr[i];
            }

        }
        return min;
    }
    
    public static void main(String[] args) {
        
        int arr[]={5,6,7,81,9,3,2,1};

        int max=maxElement(arr, 8);

        System.out.println(max);

    }
}

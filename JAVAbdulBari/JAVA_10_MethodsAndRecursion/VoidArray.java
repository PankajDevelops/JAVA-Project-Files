public class VoidArray {

    static void update(int A[]){
        A[0]=25;
    }

    static void updateArr(int arr[], int value, int index){
        arr[index]=value;
    }

    public static void main(String[] args) {
        
        // int A[]={1,2,3,4,5,6,7,8,9};

        // update(A);

        // System.out.println(A[0]);

        int arr[]={1,2,3,4,5,6,7};

        updateArr(arr,56,3);

        for(int x:arr){
            System.out.println(x);
        }
        
    }
    
}

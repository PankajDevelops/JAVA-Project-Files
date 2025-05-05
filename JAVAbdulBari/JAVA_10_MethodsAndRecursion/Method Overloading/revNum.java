

public class revNum {

static int revNum(int x){

    int ans=0,r;
    while(x!=0){
        r=x%10;
        ans=ans*10+r;
        x=x/10;
    }

    return ans;   
}

static void revNum(int arr[],int size){

    int left=0;
    int right=size-1;
    while(left<right){
        
            int temp;
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        
    }

}

    public static void main(String[] args) {

        int num=756;

        int rev=revNum(num);

        System.out.println(rev);

        int arr[]={1,2,3,4,5,6,7};

        revNum(arr, 7);

        for(int x:arr){
            System.out.print(x+" ");
        }
        
    }
    
}

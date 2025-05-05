public class CopyAnArray {
    
    public static void main (String[] args){


        int arr[]= new int [8];

        arr[0]=3;
        arr[1]=6;
        arr[2]=9;
        arr[3]=12;
        arr[4]=15;
        arr[5]=18;
        arr[6]=21;
        arr[7]=24;

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println(""+"Sample Array");

        int brr[]= new int [8];

        for(int i=0; i<brr.length; i++){
            brr[i]=arr[i];
        }

        for(int i=0; i<brr.length; i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println(""+"Copied Array");

        int crr[]= new int [8];

        for(int i=brr.length-1, j=0 ; i>=0; i--,j++){
            
                crr[i]=brr[j];
            
        }

        for(int i=0; i<=crr.length-1; i++){
            System.out.print(crr[i]+" ");
        }
System.out.println(""+"Reversed Copied Array");


    }
}

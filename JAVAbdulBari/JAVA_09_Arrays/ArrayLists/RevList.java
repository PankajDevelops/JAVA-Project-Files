
import java.util.ArrayList;

public class RevList {

    
    public static void main(String[] args) {

       
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(3);

        int n= list.size();

        for(int i=0; i<n; i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();

        for(int i=n-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();


        //Max element
        int max =Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(list.get(i)>max){
                max = list.get(i);
            }     
        }
        System.out.println(max);

    }
    
}

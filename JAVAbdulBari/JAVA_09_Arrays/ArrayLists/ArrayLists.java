package ArrayLists;
import java.util.ArrayList;
class ArrayLists {
         
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();

        list.add(1);//o(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
/* 
list.add(1,9);//o(n)

        int element = list.get(4); //GetElemnt
        System.out.println(element);

        list.remove(3); //Del an element
        System.out.println(list);
    
        //set
        list.set(2,45);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        */

        System.out.println(list.size());

        for(int i=0; i<list.size();i++){

       System.out.print(list.get(i)+" ");

        }
            System.out.println();
    }

}
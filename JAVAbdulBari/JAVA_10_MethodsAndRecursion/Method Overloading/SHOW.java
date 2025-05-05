
public class SHOW {

    static void show(int ...x){

        for(int a:x){
            System.out.println(a);
        }
    }

    static void showList(int start, String ...S){

        for(int i=0; i<S.length; i++){
            System.out.println(start+" "+S[i]);
            start++;
        }


    }

    // public static void main(String[] args) 
    public static void main(String ...args){

        
        show();
        show(1,2,3);
        show(new int[]{3,5,6,7,8,9});

        showList(1,"Pankaj","Ramit","Sagar","Piyush","Himanshu");
    }
    
}

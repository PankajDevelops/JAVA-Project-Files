public class RecursionIntro {  

static void fun1(int n){

    if(n>0){

        System.out.print(n+" ");
        fun1(n-1);    

    }
}

static void fun2(int n){

    if(n>0){

        fun2(n-1); 
        System.out.print(n+" ");
           

    }
}
    public static void main(String[] args) {
        
       int n1=10;
       int n2=10;

       fun1(n1);
       System.out.println("");
       fun2(n2);
    
    }
}

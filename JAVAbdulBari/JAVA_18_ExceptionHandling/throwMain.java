package JAVAbdulBari.JAVA_18_ExceptionHandling;

public class throwMain{

    public static void main(String[] args) {
        
        int age = 16;

        if(age<18){
            throw new RuntimeException("Sorry you can't vote");
        }

        else{
            System.out.println("You can VOTE !!! ");
        }

    }
    
}

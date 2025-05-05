import java.util.*;
public class MenuDrivenProgram {

    public static void main(String[] args) {
                   
                Scanner sc = new Scanner(System.in);
                System.out.println("Menu" +"\n" +"1.ADD"+"\n"+"2.SUB"+"\n"+"3.MUL"+"\n"+"4.DIV");

                System.out.println("Enter any two numbers to perform above operation: ");
                
                int a;
                a = sc.nextInt();
                int b;
                b = sc.nextInt();

                System.out.println("Enter any above operation in words e.g."+"ADD"+": ");

                String str;
                str = sc.next();         
                
                        switch(str){
                
                            case "ADD" : System.out.println("OUTPUT= "+(a+b));
                            break;
                            case "SUB" : System.out.println("OUTPUT= "+(a-b));
                            break;
                            case "MUL" : System.out.println("OUTPUT= "+(a*b));
                            break;
                            case "DIV" : System.out.println("OUTPUT= "+(a/b));
                            break;
        
                            default : System.out.println("Invalid Option");

                        }     
                    }
                    
                }
                

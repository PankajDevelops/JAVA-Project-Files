public class DomainNameWithSwitchCase {

    public static void main(String[] args) {
           
        
                String str = "http://www.google.com";
                
                String str1 = str.substring(0,str.indexOf(":"));
                
                
        
                switch(str1){
        
                    case "http" : System.out.println("Hypertext Transfer Protocol");
                    break;
                    case "https" : System.out.println("Hypertext Transfer Protocol Secured");
                    break;
                    case "ftp" : System.out.println("File Transfer Protocol");
                    break;

                    default : System.out.println("Invalid Protocol");
                }

                String str2 = str.substring(str.lastIndexOf(".")+1);

                switch(str2)
                {
                
                    case "com" : System.out.println("Commercial");
                    break;
                    case "org": System.out.println("Organisation");
                    break;
                    case "net": System.out.println("Network");
                    break;

                    default : System.out.println("Invalid Domain");
                }

        
                   
        
                
            }
            
        }
        
    

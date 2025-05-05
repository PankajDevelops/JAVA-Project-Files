public class FindProtocols {

    public static void main(String[] args) {
        
    

    String str = "http://www.google.com";

    String str1 = str.substring(0,str.indexOf(":"));

    if(str1.equals("http")){
        System.out.println("It is Hypertext Transfer Protocol");
    }
    else if(str1.equals("https")){
        System.out.println("It is Hypertext Transfer Protocol SECURED");
    }
    else if(str1.equals("ftp")){
        System.out.println("It is FileTransfer Protocol");
    }

    String str2 = str.substring(str.lastIndexOf("."));

    if(str2.equals(".com")){
        System.out.println("It is Commercial Website");
    }
    else if(str2.equals(".org")){
        System.out.println("It is an Organistaion");
    }
    else if(str2.equals(".net")){
        System.out.println("It is a Networking Website");
    }


      }  
}

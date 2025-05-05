
class APSeries {
    public static void main(String[] args) {
        
        int a=1;
        int d=5;
        int n=8;
        
        int i =0;
        int term =a;
        while(i<n){
            System.out.print(term+",");
            term=term+d;
            i++;
        }
        
    }
}


class GPSeries {
    public static void main(String[] args) {
        
        int a=1;
        int r=5;
        int n=8;
        
        int i=0;
        int term =a;
        while(i<n){
            System.out.print(term+",");
            term=term*r;
            i++;
        }
        
    }
}


class Fabonacci {
    public static void main(String[] args) {
        
        int a=0;
        int b=1;
        
        int n=10;
        System.out.print(a+","+b+",");
        for(int i=0;i<n-2;i++){
            int c =a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
        
        
    }
}
import java.lang. Math.*;

public class calArea {

    // static int calArea(int x, int y){

    //     return x*y;
    // }

    static double calArea(double x){

        return (3.14)*(x*x);
    } 

    public static void main(String[] args) {

        // int length=10;
        // int breath=20;

        // int area=calArea(length, breath);
        // System.out.println(area);
        
        double radius=25;
        double area2=calArea(radius);
        System.out.println(area2);
    }
    
}

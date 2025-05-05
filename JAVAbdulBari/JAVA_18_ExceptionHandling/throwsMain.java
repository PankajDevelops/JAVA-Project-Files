package JAVAbdulBari.JAVA_18_ExceptionHandling;

public class throwsMain {

    public static void div(int a, int b) throws ArithmeticException {
        System.out.println("result: " + a / b);
    }

    public static void main(String[] args) {

        div(10, 0);

    }

}

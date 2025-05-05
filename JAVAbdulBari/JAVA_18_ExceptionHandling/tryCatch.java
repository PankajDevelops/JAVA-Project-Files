// package JAVAbdulBari.JAVA_18_ExceptionHandling;

public class tryCatch {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int arr[] = { 1, 2, 3, 4, 5 };

        try {
            arr[6] = 10 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

}

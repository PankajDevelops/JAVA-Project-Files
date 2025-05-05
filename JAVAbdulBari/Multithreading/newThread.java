package JAVAbdulBari.Multithreading;
// package Multithreading;

class thread02 extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {

            System.out.println("Value of i is " + i + " ");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            ;
        }
    }
}

public class newThread {

    public static void main(String[] args) {

        thread02 t1 = new thread02();

        t1.start();

    }

}

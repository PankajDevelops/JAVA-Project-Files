package JAVAbdulBari.Multithreading;
// package Multithreading;

class MyThread implements Runnable {

    public void run() {
        for (int i = 1; i <= 10; i++) {

            System.out.println("Value of i is " + i + " ");

            try {
                Thread.sleep(1000);
            } 
            catch (Exception e) {
            };
        }
    }
}

public class multithreadingBasics {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        Thread M1 = new Thread(t1);

        M1.start();

    }

}

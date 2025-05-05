package JAVAbdulBari.Multithreading;
//started multithreading

public class mainThread {

    public static void main(String[] args) {

        System.out.println("Sum is: " + (4 + 9));

        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());

        t1.setName("customMain");
        System.out.println(t1.getName());

        System.out.println(t1.getId());

        try {
            t1.sleep(5000);
        } catch (Exception e) {

        }


        System.out.println("Process Completed !!!");
        

    }

}

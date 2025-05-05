
@FunctionalInterface
interface MyLamda {
    public void dispaly();
}

// class My implements MyLamda {
// @Override
// public void dispaly() {
// System.out.println("Hello Display");
// }
// }

public class Main {

    public static void main(String[] args) {

        // MyLamda m1 = new MyLamda() {
        // public void dispaly() {
        // System.out.println("Hello Display");
        // }
        // };

        MyLamda m1 = () -> {
            System.out.println("Hello Display");
        };

        m1.dispaly();

    }

}

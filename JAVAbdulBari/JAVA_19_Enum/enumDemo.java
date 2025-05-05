package JAVAbdulBari.JAVA_19_Enum;
// package JAVAbdulBari.JAVA_19_22;

enum Dept {
    IT, CS, ECE, CIVIL
}

public class enumDemo {

    public static void main(String[] args) {

        Dept d1 = Dept.CS;

        System.out.println(Dept.valueOf("IT"));

    }

}

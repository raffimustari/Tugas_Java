package tugas2;
import java.util.Scanner;

public class ganjilgenap {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("masukan angka");

        int no = x.nextInt();


        if (no % 2 == 0) {
            System.out.println(no + "  bilangan genap");
        } else {
            System.out.println(no + " bilangan ganjil");

            x.close();
        }
    }
}
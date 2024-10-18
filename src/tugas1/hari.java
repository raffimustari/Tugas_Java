package tugas1;
import java.util.Scanner;

public class hari {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("masukan hari ini");
        String h = i.nextLine();
        h = h.toLowerCase();

        if (h.equals("100000") || h.equals("750000")) {
            System.out.println("diskon 50000");
        } else {
            System.out.println("tidak diskon");
        }
        i.close();

    }
}

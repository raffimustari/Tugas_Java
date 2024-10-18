package tugas1;
import java.util.Scanner;

public class kubus {
    public static void main(String[] args) {
        Scanner kubis = new Scanner(System.in);


        System.out.print("Masukan sisi Kubus");
        double s1 = kubis.nextDouble();

        // double s2 =   s1 * s1;

        double s2 = s1 * s1 *s1;


        // System.out.print("Luas Permukaan kubus" + s2);
        System.out.print("volume kubus" + s2);

        kubis.close();
    }
    
}

package tugas1;
import java.util.Scanner;

public class persegi {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("masukan panjang");
        double pj = p.nextDouble();

        System.out.print("masukan lebar");
        double lb = p.nextDouble();

        double ls = pj * lb;

        System.out.print("Luas Persegi panjang =" + ls);

        p.close();
        

    }
}

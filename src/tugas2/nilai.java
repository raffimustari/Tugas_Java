package tugas2;
import java.util.Scanner;
/**
 * nilai
 */
public class nilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai   siswa: ");
        int nilai = input.nextInt();

        String predikat;

        if (nilai > 85) {
            predikat = "A";
        } else if (nilai > 75) {
            predikat = "B";
        } else if (nilai > 65) {
            predikat = "C";
        } else if (nilai > 55) {
            predikat = "D";
        } else {
            predikat = "E";
        }

        System.out.println("Predikat: " + predikat);
        input.close();
}
}
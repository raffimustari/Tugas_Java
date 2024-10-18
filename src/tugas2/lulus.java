package tugas2;
import java.util.Scanner;

public class lulus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai siswa: ");
        int nilai = input.nextInt();

        if (nilai >= 75) {
            System.out.println("Siswa dinyatakan LULUS");
        } else {
            System.out.println("Siswa dinyatakan TIDAK LULUS");
        }
        input.close();
    }
}
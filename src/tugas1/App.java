package tugas1;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner usia = new Scanner(System.in);

        System.err.print("masukan tahun sekarang");
        int c = usia.nextInt();
        
        System.err.print("masukan tahun lahir");
        int d = usia.nextInt();

        int umur = c - d;

        System.out.println("aku" + umur + "tahun sekarang" );
        usia.close();
    }
}

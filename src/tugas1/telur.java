package tugas1;
import java.util.Scanner;

public class telur {
    public static void main(String[] args) {
       Scanner masukan = new Scanner(System.in);

       double kg = 28000;

       System.out.print("jumlah telur (kg):");
       double jt = masukan.nextDouble();

       double th = jt*kg;

       System.out.println("uang pembayaran");
       double up = masukan.nextDouble();

       double uk =  up-th;

       System.out.println("");

       System.out.println("Jumlah Telur: " + jt + " kg");
       System.out.println("Total Pembelian: Rp " + th);
       System.out.println("kembalian: Rp " + uk);

        masukan.close();

    }
    
}

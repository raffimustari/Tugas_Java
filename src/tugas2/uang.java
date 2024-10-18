package tugas2;

import java.util.Scanner;

public class uang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang (dalam rupiah): ");
        int jumlahUang = scanner.nextInt();

        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};

        System.out.println("Pecahan uang:");
        for (int i = 0; i < pecahan.length; i++) {
            int jumlahLembar = jumlahUang / pecahan[i];
            if (jumlahLembar > 0) {
                System.out.println(jumlahLembar + " lembar " + pecahan[i]);
            }
            jumlahUang %= pecahan[i];
            scanner.close();
        }
    }
}
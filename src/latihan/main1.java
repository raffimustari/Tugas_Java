package latihan;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class main1 {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> daftarTugas = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Daftar Tugas");
        System.out.println("____________________________________");

        while (true) {
            System.out.print("Masukkan tugas (atau ketik ! untuk lihat): ");
            String perintah = input.nextLine();

            if (perintah.equalsIgnoreCase("!")) {
                lihatDaftarTugas();
            } else {
                Date tanggal = new Date();
                daftarTugas.add(tanggal + " - " + perintah);
                System.out.println("Tugas berhasil ditambahkan.");
            }
        }
    }

    static void lihatDaftarTugas() {
        if (daftarTugas.isEmpty()) {
            System.out.println("Daftar tugas masih kosong.");
        } else {
            for (int i = 0; i < daftarTugas.size(); i++) {
                System.out.println((i + 1) + ". " + daftarTugas.get(i));
            }
        }
    }
}
package tugas6;

import java.util.ArrayList;
import java.util.Scanner;

public class lulusArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // untuk memasukan data mahasiswa
        System.out.print("Masukkan jumlah data: ");
        int numData = scanner.nextInt();

        // membuat ArrayLists untuk nama dan nilai
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<Integer> nilai = new ArrayList<>();

        // Input data mengunakan looping
        for (int i = 0; i < numData; i++) {
            System.out.println("Mahasiswa Ke: " + (i + 1));
            System.out.print("Nama: ");
            nama.add(scanner.next()); // Menyimpan nama mahasiswa
            System.out.print("Nilai: ");
            nilai.add(scanner.nextInt()); // Menyimpan nilai mahasiswa
        }
        
        // Tampilkan header data
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("No\tNama\tNilai\tStatus");

        // variabel totalnilai dan jumlah lulus
        int totalnilai = 0;
        int siswalulus = 0;

          // Memproses dan menampilkan data setiap mahasiswa
        for (int i = 0; i < nama.size(); i++) {
             // Menampilkan nomor urut, nama, nilai mahasiswa
            System.out.print((i + 1) + "\t" + nama.get(i) + "\t" + nilai.get(i) + "\t");

             // Mengecek status kelulusan
            if (nilai.get(i) >= 60) {
                System.out.println("Lulus");
                siswalulus++;  // menambah jika mahasiswa lulus
            } else {
                System.out.println("Tidak Lulus");
            }
            totalnilai += nilai.get(i); // Menambahkan nilai ke total nilai
        }

        // nutup scanner
        scanner.close();

        // Menghitung rata-rata nilai total nilai 
        double ratanilai = (double) totalnilai / nama.size();

        // menampilkan hasil akhir 
        System.out.println("\nJumlah: " + totalnilai);
        System.out.println("Nilai Rata-rata: " + ratanilai);
        System.out.println("Jumlah Lulus: " + siswalulus);
    }
}
package tugas4;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Masukan jumlah mahasiswa: ");
        int jumlahmahasiswa = input.nextInt();
        
        String[] mahasiswa = new String[jumlahmahasiswa];
        double[] nilai = new double[jumlahmahasiswa];
        
        
        for (int i = 0; i < jumlahmahasiswa; i++) {
            System.out.print("Masukan nama mahasiswa ke-" + (i + 1) + ": ");
            mahasiswa[i] = input.next();
            
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
        }
        
        double totalnilai = 0;
        System.out.println("\nData mahasiswa yang diinput:");
        for (int i = 0; i < jumlahmahasiswa; i++) {
            System.out.println("Nama: " + mahasiswa[i] + ", Nilai: " + nilai[i]);
            totalnilai += nilai[i];  // Menambahkan nilai ke total
        }
        
      
        double rata2 = totalnilai / jumlahmahasiswa;
        System.out.println("\nRata-rata nilai mahasiswa: " + rata2);
        
        input.close();
    }
}

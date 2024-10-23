package tugas5;
import java.util.Scanner;

public class lulus {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int numData = m.nextInt();

        String[] names = new String[numData];
        int[] Nilai = new int[numData];

        for (int i = 0; i < numData; i++) {
            System.out.println("Mahasiswa Ke: " + (i + 1));
            System.out.print("Nama: ");
            names[i] = m.next();
            System.out.print("Nilai: ");
            Nilai[i] = m.nextInt();
        }

        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("No\tNama\tNilai\tStatus");

        int totalnilai = 0;
        int lulus = 0;

        for (int i = 0; i < numData; i++) {
            System.out.print(i + 1 + "\t" + names[i] + "\t" + Nilai[i] + "\t");

            if (Nilai[i] >= 60) {
                System.out.println("Lulus");
                lulus++;
            } else {
                System.out.println("Tidak Lulus");
            }

            totalnilai += Nilai[i];
        }
        m.close();

        double averageGrade = (double) totalnilai / numData;

        System.out.println("\nJumlah: " + totalnilai);
        System.out.println("Nilai Rata-rata: " + averageGrade);
    }
}
package tugas1;
import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
        
        Scanner h = new Scanner(System.in);

        System.out.println("====DISKON=====");
        System.out.print("masukan harga :");
        double total = h.nextDouble(); 
        String amember ;
        double hasil;
        double diskon1 = 10.0/100;
        double diskon2 = 20.0/100;
        double diskon3 = 30.0/100;
        amember = h.next().toLowerCase(); 

        // if (total >= 100000 && total <150000 ){

        //     //  hasil = total - (0.1*total );
        //     System.out.println("Selamat anda dapat diskon 10%");
        // } else {
        //     hasil = total;
          
        // }
        // else if (total >= 200000) && (total < 300000) {
        //     hasil = total - (0.3*total);

        // }
        // if (total >= 100000) {
        //     hasil = diskon1*hasil;
        //     System.out.println("selamat anda dapet diskon 30%");
        // } else if (total => 150000) {
        //     hasil = diskon2*hasil;
        // } {
        //     hasil = total;
        // }
        if (total >= 100000 && total < 150000) {
            hasil = total - (diskon1 * total);
            if (amember.equals("y") || amember.equals("ya")) {
                hasil = total - (15.0 / 100 * hasil);
            }
            // System.out.println("total belanja " + total);
            System.out.println("Selamat anda dapat diskon 10%");
        } else if (total >= 150000 && total < 200000) {
            hasil = total - (diskon2 * total);
            if (amember.equals("y") || amember.equals("ya")) {
                hasil = total - (15.0 / 100 * hasil);
            }
            System.out.println("Selamat anda dapat diskon 20%");
        } else if (total >= 250000 && total < 300000) {
            hasil = total - (diskon3 * total);
            if (amember.equals("y") || amember.equals("ya")) {
                hasil = total - (15.0 / 100 * hasil);
            }
            System.out.println("Selamat anda dapat diskon 30%");
        } else {
            // Jika tidak ada kondisi yang memenuhi, berikan nilai default untuk hasil
            hasil = total; // Atau nilai lain yang sesuai
        }
        
        System.out.println("harga : " + hasil);
        h.close();
    }
}


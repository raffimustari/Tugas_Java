package tugas2;
public class jeruk {
    public static void main(String[] args) {
        int jumlahBuah = 23;
        int hargaPerBuah = 5000;
        int totalHarga = 0;

      
        totalHarga = jumlahBuah * hargaPerBuah;

      
        if (jumlahBuah > 10) {
            int diskon = totalHarga / 10; 
            totalHarga -= diskon;
            System.out.println("Anda mendapatkan diskon sebesar Rp" + diskon);
        }

        System.out.println("Total harga: Rp" + totalHarga);
    }
}
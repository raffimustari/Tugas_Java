package tugas3;

public class naikturun {
        public static void main(String[] args) {
            int angka = 1;
            int baris = 4;
            int kolom = 5;
    
            for (int i = 1; i <= baris; i++) {
                for (int j = 1; j <= kolom; j++) {
                    if (i % 2 == 0) {
                        System.out.print((baris * kolom) - angka + 1 + (j - 1) * 2 + " ");
                        angka++;
                    } else {
                        System.out.print(angka + " ");
                        angka++;
                    }
                }
                System.out.println();
            }
        }
    }


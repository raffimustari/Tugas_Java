package tugas3;

public class urutan {

        public static void main(String[] args) {
            int angka = 1;
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 5; j++) {
                    if (angka == 6 || angka == 12 || angka == 17) {
                        angka += 2; // Lewati angka 6, 12, dan 17
                    }
                    System.out.print(angka + " ");
                    angka++;
                }
                System.out.println();
            }
        }
    }


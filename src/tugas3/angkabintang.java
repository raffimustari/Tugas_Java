package tugas3;

public class angkabintang {
    
        public static void main(String[] args) {
            int baris = 5;
    
            for (int i = 1; i <= baris; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print(j - 1 + " ");
                    }
                }
                System.out.println();
            }
        }
    }


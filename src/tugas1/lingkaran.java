package tugas1;
import java.util.Scanner;


public class lingkaran {
    public static void main(String[] args) { 
        Scanner mtk = new Scanner(System.in);
        

        System.out.println("masukan luas lingkaran");
        double luas = mtk.nextDouble();

        double keliling = 2 * 22/7 * luas ; 

        System.out.println("keliling lingkaran =" + keliling);

        mtk.close();
    }
}

package tugas1;
import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        
        System.out.print("masukan celcius");
        double cl = sh.nextDouble();

        double fh = (cl * 9/5) + 32;

        System.out.println("suhu di farenhit: " + fh);

        sh.close();
    }
    
}

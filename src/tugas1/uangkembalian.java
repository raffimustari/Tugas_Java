package tugas1;
import java.util.Scanner;

public class uangkembalian {

    public static void main(String[] args) {
        Scanner uang = new Scanner(System.in);

        System.err.println("masukan kg");
        int Ac = uang.nextInt();

        System.err.println("masukan uang kembalian");
        double Bd = uang.nextDouble();

        double kembalian = Ac - Bd ;
    
        System.out.print("total kembalian" + kembalian );
        uang.close();
        
    }
}
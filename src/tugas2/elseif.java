package tugas2;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner mrk = new Scanner(System.in);
        String merk, sepatu;
        System.out.println("masukan merek");
        merk = mrk.nextLine().toLowerCase();

        if (merk.equals("1")) {
            sepatu = "adidas";
        } else if (merk.equals("2")) {
            sepatu = "nike";
        } else if (merk.equals("3")) {
            sepatu = "nike";
        }
        mrk.close();
    }
}

package tugas2;

import java.util.Scanner;

public class swicth {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String merek, sepatu;
        System.out.println("Masukan merek");
        merek = Sc.nextLine().toLowerCase();

        switch (merek) {
            case "1":
            merek = "adidas";
            break;
            case "2":
            merek = "nike";
            break;
            case "3":
            merek = "hoka";
            break;
            case "4":
            merek = "puma";
            break;
        }
        Sc.close();
    }
}

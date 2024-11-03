package tugas7;

// menambahkan libary LinkedList
import java.util.LinkedList;

public class linklist {
 
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // elemen di akhir
         list.add(1); 
        // menambahkan elemen di awal
         list.add(2);
        // menambahkan elemen di tengah
         list.add(1,3);
         // Mengecek apakah LinkedList memiliki elemen terserbut
         System.out.println(list.contains(3));
        //  menampilkan elemen di akhir
       // Menampilkan elemen pertama
       System.out.println(list.getFirst());
       // Menampilkan elemen terakhir
       System.out.println(list.getLast());
        // Mengecek apa kosong
       System.out.println(list.isEmpty());
        // menghapus elemen pertama dan mengembalikan elemen yang dihapus
       System.out.println(list.poll());
       // Menghapus elemen terakhir dan mengembalikannya
       System.out.println(list.pollLast());
        // nambah elemen di awal dan akhir, menggunakan addFirst() dan addLast()
       list.addFirst(5);
       list.addLast(10);
        // Menghapus elemen pertama dengan remove() dan mengembalikannya
        System.out.println(list.remove());
        // Menghapus elemen terakhir dengan removeLast() dan mengembalikannya
        System.out.println(list.removeLast());
        // Mengecek jumlah elemen yang ada di List
        System.out.println(list.size());
        // Menghapus semua elemen di list
        list.clear();
        System.out.println( list.isEmpty());




    }

}

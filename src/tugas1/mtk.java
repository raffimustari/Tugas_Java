package tugas1;
public class mtk {
    int pengurangan;
    void hitung(){
        pengurangan = 10-9;
        System.out.println("Hasil =" + pengurangan );
    }
    public static void main(String[] args) {
        mtk objek= new mtk();
        objek.hitung();
    }
}

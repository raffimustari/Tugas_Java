package tugas4;

 class mahasiswa{
        String nama;
        String nim;
        String nilai;           
    
    public mahasiswa(String nama, String nim, String nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

        public class arrayobject {
        public static void main(String[] args) {
            mahasiswa mhs[] = new mahasiswa[2];
            mhs[0] = new mahasiswa("dani", "123456","80");
            mhs[1] = new mahasiswa("ilham", "678901","90");
        
            System.out.println("NIM/T/NAMA/T/NILAI");
            System.out.println("================================================================");

            for(mahasiswa s : mhs) {
                System.out.println(s.nim+"\t"+s.nama+"\t"+s.nilai);
        }
        }


    }
}
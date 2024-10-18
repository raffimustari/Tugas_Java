package tugas4;
// S S S O
// S S O O
// S O O O
// O O O O
public class loopingsos {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                if (j <3 - i) {
                    System.out.println("s");
                    
                } else {
                    System.out.println("o");
                }
            }


    }
}
}
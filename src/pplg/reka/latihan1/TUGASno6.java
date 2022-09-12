package pplg.reka.latihan1;

public class TUGASno6 {
    public static void main(String[] args) {
        System.out.println(LoopDeret(1, 100, 1));
    }

    static int LoopDeret(int angkaAwal, int angkaAkhir, int b) {
        int i = angkaAwal;
        int hasil = i;

        while (i < angkaAkhir) {
            hasil = hasil + (i + b);
            i = i + b;
        }

        return hasil;
    }
}

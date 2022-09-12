package pplg.reka;
import java.lang.Exception;

public class TryCatch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            for (int i = 0; i <= 10; i++) {
                numbers[i] = i;
                System.out.println(numbers[i]);
            }
        } catch(Exception e) {
            System.out.println("Index ke 10 dari numbers[] tidak ada");
        }
    }
}

package example;

public class Loop2 {
    public static void main(String[] args) {
        for (int i = 1000; i >= 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
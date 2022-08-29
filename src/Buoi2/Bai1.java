package Buoi2;

public class Bai1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0 && i <= 9) {
                System.out.println("* * * * * * =================================");
            } else if (i % 2 == 0 && i <= 9) {
                System.out.println(" * * * * *  =================================");
            } else {
                System.out.println("=============================================");
            }
        }
    }
}

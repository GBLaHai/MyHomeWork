package Buoi2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so tu nhien: ");
        int n = scanner.nextInt();
        if(n >= 0) {
            int soDu, tong = 0;
            while (n > 0) {
                soDu = n%10;
                n = n/10;
                tong = tong + soDu;
            }
            System.out.println("Tong cac chu so la: " + tong);
        } else {
            System.out.println("So tu nhien >= 0.");
        }
    }
}

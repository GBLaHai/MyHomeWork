package Buoi2;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so tu nhien n = ");
        int n = scanner.nextInt();
        while (true) {
            if(n >= 1 && n <= 9) {
                break;
            } else {
                System.out.println("Nhap so tu nhien tu 1 - 9. Vui long nhap lai!");
                n = scanner.nextInt();
            }
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}

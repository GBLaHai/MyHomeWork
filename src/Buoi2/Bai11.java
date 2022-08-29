package Buoi2;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so tu nhien n = ");
        int n = scanner.nextInt();

        double log2 = Math.log10(n) / Math.log10(2);
        if(log2 == Math.floor(log2)) {
            double ketQua = Math.floor(log2) - 1;
            System.out.println("Ket qua la: " + (int) ketQua);
        } else {
            System.out.println("Ket qua la: " + (int) Math.floor(log2));
        }
    }
}

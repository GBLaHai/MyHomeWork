package Buoi2;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot so tu nhien: ");
        int soTuNhien = scanner.nextInt();

        System.out.print("Uoc so cua " + soTuNhien + " la: ");
        for(int i = 1; i <= soTuNhien; i++) {
            if(soTuNhien%i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

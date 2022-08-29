package Buoi2;

import java.util.Scanner;

public class Bai2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he nhi phan = ");
        int soNhiPhan = scanner.nextInt();
        if(soNhiPhan > 0) {
            int[] mangSo = new int[1000];

            int i = 0;
            while (soNhiPhan > 0) {
                mangSo[i] = soNhiPhan % 10;
                soNhiPhan = soNhiPhan / 10;
                i++;
            }
            if (kiemTraSoNhiPhan(mangSo) == true) {
                long ketQua = 0;
                for (int j = i - 1; j >= 0; j--) {
                    ketQua = (long) (ketQua + (mangSo[j] * Math.pow(2, j)));
                }
                System.out.println("Ket qua la: " + ketQua);
            } else {
                System.out.println("So nhi phan chi chua 0 va 1.");
            }
        } else {
            System.out.println("So nhi phan chi chua 0 va 1.");
        }
    }

    public static boolean kiemTraSoNhiPhan(int[] mangSo) {
        for(int i = 0; i < mangSo.length; i++) {
            if (mangSo[i] < 0 || mangSo[i] > 1) return false;
        }
        return true;
    }
}

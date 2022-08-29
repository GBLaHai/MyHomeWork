package Buoi2;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen thu nhat: ");
        int soNguyen1 = scanner.nextInt();
        while (true) {
            if (soNguyen1 >= 10 && soNguyen1 <= 99) {
                break;
            } else {
                System.out.println("So nguyen trong khoang 10 - 99. Vui long nhap lai!");
                soNguyen1 = scanner.nextInt();
            }
        }

        System.out.println("Nhap vao so nguyen thu hai: ");
        int soNguyen2 = scanner.nextInt();
        while (true) {
            if (soNguyen2 >= 10 && soNguyen2 <= 99) {
                break;
            } else {
                System.out.println("So nguyen trong khoang 10 - 99. Vui long nhap lai!");
                soNguyen2 = scanner.nextInt();
            }
        }

        String chuoiSo1 = String.valueOf(soNguyen1);
        String chuoiSo2 = String.valueOf(soNguyen2);

        if(chuoiSo2.contains(chuoiSo1.charAt(0)+"") || chuoiSo2.contains(chuoiSo1.charAt(1)+""))
            System.out.println("True");
        else System.out.println("False");
    }
}

package Buoi2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Nhap toa do diem A***");
        System.out.println("Nhap hoanh do diem A: ");
        int xA = scanner.nextInt();
        System.out.println("Nhap tung do diem A: ");
        int yA = scanner.nextInt();

        System.out.println("***Nhap toa do diem B***");
        System.out.println("Nhap hoanh do diem B: ");
        int xB = scanner.nextInt();
        System.out.println("Nhap tung do diem B: ");
        int yB = scanner.nextInt();

        int doDaiAB = (int) Math.sqrt(Math.pow((xB-xA), 2) + Math.pow((yB-yA), 2));

        System.out.println("Do dai doan thang AB la: " + doDaiAB);
    }
}

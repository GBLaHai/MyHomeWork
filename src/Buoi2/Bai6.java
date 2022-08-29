package Buoi2;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String chuoi = scanner.nextLine();

        int n = chuoi.length() - 1;
        for (int i = n; i >= 0; i--) {
            System.out.print(chuoi.charAt(i));
        }
    }
}

package Buoi2;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = scanner.nextInt();
        for(int i = 0; i <= n; i++) {
            if(kiemTraNguyenTo(i))
                System.out.print(i + " ");
        }
    }

    public static boolean kiemTraNguyenTo(int n) {
        if(n<=1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
}

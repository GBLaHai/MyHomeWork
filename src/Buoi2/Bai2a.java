package Buoi2;

import java.util.Scanner;

public class Bai2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tu nhien n = ");
        int n = scanner.nextInt();
        if(n > 0) {
            byte[] mangSo = new byte[1000];
            int i = 0;
            while (n > 0) {
                mangSo[i] = (byte) (n % 2);
                n = n / 2;
                i++;
            }
            System.out.print("Ket qua la: ");
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(mangSo[j]);
            }
        } else if (n == 0){
            System.out.println("Ket qua la: 0");
        } else {
            System.out.println("Nhap so tu nhien lon hon 0.");
        }
    }
}

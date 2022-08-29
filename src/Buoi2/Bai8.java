package Buoi2;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String chuoiBanDau = scanner.nextLine();

        String[] mangChu = chuoiBanDau.split("\\s");
        String ketQua = "";
        for (int i = 0; i < mangChu.length; i++) {
            if(mangChu[i].trim().length() > 0) {
                ketQua = ketQua + vietHoaChuDau(mangChu[i]) + " ";
            }
        }

        System.out.println("Ket qua la: " + ketQua);
    }

    public static String vietHoaChuDau(String chu) {
        String chuDau = chu.substring(0,1);
        String chuConLai = chu.substring(1, chu.length());
        chuDau = chuDau.toUpperCase();
        return chuDau + "" + chuConLai;
    }
}

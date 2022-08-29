package Buoi2;

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien anh X gui: ");
        double soTienGoc = scanner.nextDouble();
        System.out.println("Nhap so tien anh X muon co trong tuong lai: ");
        double soTienTrongTuongLai = scanner.nextDouble();

        float laiSuat = (float) 0.07;
        int soLanNhapGocMoiNam = 12;

        int soNam = (int) ((Math.log(soTienTrongTuongLai/soTienGoc)/Math.log(1+laiSuat/soLanNhapGocMoiNam))/soLanNhapGocMoiNam);

        System.out.println("So nam anh X cho doi la: " + soNam + " nam.");
    }
}

package Buoi3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SinhVien> danhSachSV = new ArrayList<>();
        System.out.println("Nhap vao so luong sinh vien muon nhap: ");
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < n; i++) {
            SinhVien sinhVien = new SinhVien();
            System.out.println("Nhap thong tin sinh vien thu " + (i+1));
            sinhVien.nhap();
            danhSachSV.add(sinhVien);
        }
        for (SinhVien sinhVien: danhSachSV) {
            sinhVien.xuat();
        }
    }
}

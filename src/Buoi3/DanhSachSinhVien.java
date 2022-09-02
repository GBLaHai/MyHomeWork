package Buoi3;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> dsSV = new ArrayList<>();

    public DanhSachSinhVien() {
        setDsSV(taoDuLieuGia());
    }

    private ArrayList<SinhVien> taoDuLieuGia() {
        ArrayList<SinhVien> dsTaoDuLieu = new ArrayList<>();
        SinhVien sv1 = new SinhVien("Nguyen Tuan Thanh", "mssv0011",5.5f, 7, 8);
        SinhVien sv2 = new SinhVien("Do Thi Bong", "mssv0012",9, 8.5f, 8);
        SinhVien sv3 = new SinhVien("Huynh Thanh Truc", "mssv0013",2.5f, 3, 5);
        SinhVien sv4 = new SinhVien("Le Quoc Tai", "mssv0014",9, 8.5f, 8);
        SinhVien sv5 = new SinhVien("Yen Thi Lan Anh", "mssv0015",2, 3, 2.5f);
        dsTaoDuLieu.add(sv1);
        dsTaoDuLieu.add(sv2);
        dsTaoDuLieu.add(sv3);
        dsTaoDuLieu.add(sv4);
        dsTaoDuLieu.add(sv5);
        return dsTaoDuLieu;
    }

    public void xuatDSSV() {
        System.out.println("\n========== DANH SACH SINH VIEN ==========");
        InCacTruongCuaBang();
        for(int i = 0; i < dsSV.size(); i++) {
            System.out.printf("%-5d | ", (i+1));
            dsSV.get(i).xuat();
        }
    }

    public void xuatDSSVCoDTBCaoNhat() {
        System.out.println("\n========== DANH SACH SINH VIEN CO DTB CAO NHAT ==========");
        SinhVien maxSV = dsSV.get(0);
        for(int i = 1; i < dsSV.size(); i++)
            if(dsSV.get(i).getDiemTB() > maxSV.getDiemTB())
                maxSV = dsSV.get(i);
        InCacTruongCuaBang();
        for(int i = 0; i < dsSV.size(); i++) {
            if(dsSV.get(i).getDiemTB() == maxSV.getDiemTB()) {
                System.out.printf("%-5d | ", (i+1));
                dsSV.get(i).xuat();
            }
        }
    }

    public void xuatDSSVYeu() {
        System.out.println("\n========== DANH SACH SINH VIEN XEP LOAI YEU ==========");
        InCacTruongCuaBang();
        for(int i = 0; i < dsSV.size(); i++) {
            if(dsSV.get(i).getXepLoai().equalsIgnoreCase("yeu")) {
                System.out.printf("%-5d | ", (i+1));
                dsSV.get(i).xuat();
            }
        }
    }

    public void xuatDSSVTheoTen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhap vao ten can tim: ");
        String tenCanTim = scanner.nextLine();
        InCacTruongCuaBang();
        for(int i = 0; i < dsSV.size(); i++) {
            if(dsSV.get(i).getTen().toLowerCase().contains(tenCanTim.toLowerCase())) {
                System.out.printf("%-5d | ", (i+1));
                dsSV.get(i).xuat();
            }
        }
    }

    private int timViTriSVTheoMa(String maSV) {
        for(int i = 0; i < dsSV.size(); i++)
            if(dsSV.get(i).getMaSV().equals(maSV))
                return i;
        return -1;
    }

    public void xuatSVTheoMa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhap vao ma sinh vien can tim: ");
        String maSVCanTim = scanner.nextLine();
        InCacTruongCuaBang();
        for(int i = 0; i < dsSV.size(); i++) {
            if(dsSV.get(i).getMaSV().equals(maSVCanTim)) {
                System.out.printf("%-5d | ", (i+1));
                dsSV.get(i).xuat();
                break;
            }
        }
    }

    public void xoaSVTheoMa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhap vao ma sinh vien can xoa:");
        String maSVCanXoa = scanner.nextLine();
        int viTriXoa = timViTriSVTheoMa(maSVCanXoa);
        if(viTriXoa >= 0) {
            dsSV.remove(viTriXoa);
            System.out.println("========== DANH SACH SINH VIEN SAU KHI XOA ==========");
            InCacTruongCuaBang();
            for(int i = 0; i < dsSV.size(); i++) {
                System.out.printf("%-5d | ", (i+1));
                dsSV.get(i).xuat();
            }
        }
    }

    public void InCacTruongCuaBang() {
        System.out.printf("%-5s | %-30s | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s \n",
                "STT", "Ten SV", "Ma SV", "Diem Toan", "Diem Ly", "Diem Hoa", "Diem TB", "Xep Loai");
    }

    public ArrayList<SinhVien> getDsSV() {
        return dsSV;
    }

    public void setDsSV(ArrayList<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }
}

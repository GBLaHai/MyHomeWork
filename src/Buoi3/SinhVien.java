package Buoi3;

import java.util.Scanner;

public class SinhVien {
    private static Scanner scanner = new Scanner(System.in);
    private String ten;
    private String maSV;
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    private float diemTB;

    private String xepLoai;

    public SinhVien() {
    }

    public SinhVien(String ten, String maSV, float diemToan, float diemLy, float diemHoa) {
        this.ten = ten;
        this.maSV = maSV;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public boolean kiemTraDiemHopLe(float diem) {
        return diem >= 0 && diem <= 10;
    }

    public void nhap() {
        setTen("");
        setMaSV("");
        setDiemToan(-1);
        setDiemLy(-1);
        setDiemHoa(-1);
        tinhDiemTB();
        xepLoaiSV();
    }

    public void xuat() {
        System.out.println(toString());
    }

    private void tinhDiemTB() {
        diemTB = (diemToan + diemLy + diemHoa) / 3;
    }

    private void xepLoaiSV() {
        if (diemTB <= 10 && diemTB >= 9) xepLoai = "Xuat Sac";
        else if (diemTB < 9 && diemTB >= 8) xepLoai = "Gioi";
        else if (diemTB < 8 && diemTB >= 7) xepLoai = "Kha";
        else if (diemTB < 7 && diemTB >= 6) xepLoai = "TB Kha";
        else if (diemTB < 6 && diemTB >= 5) xepLoai = "TB";
        else xepLoai = "Yeu";
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        System.out.println("Nhap vao ho ten sinh vien: ");
        ten = scanner.nextLine();
        while(true) {
            if(!ten.isEmpty()) {
                break;
            } else {
                System.out.println("Ho ten khong duoc de trong, nhap lai: ");
                ten = scanner.nextLine();
            }
        }
        this.ten = ten;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        System.out.println("Nhap vao ma sinh vien: ");
        maSV = scanner.nextLine();
        while(true) {
            if(maSV.length() == 8) {
                break;
            } else {
                System.out.println("Ma sinh vien gom 8 ky tu, nhap lai: ");
                maSV = scanner.nextLine();
            }
        }
        this.maSV = maSV;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        System.out.println("Nhap diem Toan: ");
        diemToan = Float.parseFloat(scanner.nextLine());
        while(true) {
            if(kiemTraDiemHopLe(diemToan)) {
                break;
            } else {
                System.out.println("Diem Toan tu 0 - 10, nhap lai: ");
                diemToan = Float.parseFloat(scanner.nextLine());
            }
        }
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        System.out.println("Nhap diem Ly: ");
        diemLy = Float.parseFloat(scanner.nextLine());
        while(true) {
            if(kiemTraDiemHopLe(diemLy)) {
                break;
            } else {
                System.out.println("Diem Ly tu 0 - 10, nhap lai: ");
                diemLy = Float.parseFloat(scanner.nextLine());
            }
        }
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        System.out.println("Nhap diem Hoa: ");
        diemHoa = Float.parseFloat(scanner.nextLine());
        while(true) {
            if(kiemTraDiemHopLe(diemHoa)) {
                break;
            } else {
                System.out.println("Diem Hoa tu 0 - 10, nhap lai: ");
                diemHoa = Float.parseFloat(scanner.nextLine());
            }
        }
        this.diemHoa = diemHoa;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", maSV='" + maSV + '\'' +
                ", diemToan=" + diemToan +
                ", diemLy=" + diemLy +
                ", diemHoa=" + diemHoa +
                ", diemTB=" + diemTB +
                ", xepLoai='" + xepLoai + '\'' +
                '}';
    }
}

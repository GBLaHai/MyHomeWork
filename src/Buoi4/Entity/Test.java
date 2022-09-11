package Buoi4.Entity;

public class Test {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVienThuong();
        nv1.setMaSo("nv000001");
        nv1.setHoTen("Nguyen Van Khang Truong");
        nv1.setSoDienThoai("0325478165");
        nv1.setSoNgayLamViec(23);

        System.out.println("Ten: " + nv1.LayTenNhanVien());
    }
}

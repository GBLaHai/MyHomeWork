package Buoi3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachSinhVien dsSV = new DanhSachSinhVien();
        dsSV.xuatDSSV();
        dsSV.xuatDSSVCoDTBCaoNhat();
        dsSV.xuatDSSVYeu();
//        dsSV.xuatDSSVTheoTen();
//        dsSV.xuatSVTheoMa();
        dsSV.xoaSVTheoMa();
    }
}

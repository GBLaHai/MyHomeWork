package Buoi2;

import java.util.Scanner;

public class Karaoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao gio bat dau: ");
        byte gioBatDau = scanner.nextByte();
        while (true) {
            if (gioBatDau >= 9 && gioBatDau <= 24) {
                break;
            } else {
                System.out.println("Thoi gian mo cua tu 9h den 24h. Vui long nhap lai!");
                gioBatDau = scanner.nextByte();
            }
        }
        System.out.println("Nhap vao gio ket thuc: ");
        byte gioKetThuc = scanner.nextByte();
        while(true) {
            if(gioKetThuc >= 9 && gioKetThuc <= 24 && gioKetThuc >= gioBatDau) {
                break;
            } else if (gioKetThuc < 9 && gioKetThuc > 24){
                System.out.println("Thoi gian mo cua tu 9h den 24h. Vui long nhap lai!");
                gioKetThuc = scanner.nextByte();
            } else {
                System.out.println("Gio ket thuc >= gio bat dau");
                gioKetThuc = scanner.nextByte();
            }
        }
        System.out.println("Nhap vao so chai nuoc: ");
        int soChaiNuoc = scanner.nextInt();
        while (true) {
            if(soChaiNuoc >= 0) {
                break;
            } else {
                System.out.println("So chai nuoc la so duong. Vui long nhap lai!");
                soChaiNuoc = scanner.nextInt();
            }
        }
        float tongTien = 0;
        byte soGio = (byte) (gioKetThuc - gioBatDau);
        if(soGio == 0) {
            tongTien = 30000+(soChaiNuoc*10000);
        } else if(soGio <= 3) {
            tongTien = (soGio * 30000) + (soChaiNuoc * 10000);
        } else {
            tongTien = (float) ((3 * 30000) + (soGio - 3)*(0.3*3*30000) + (soChaiNuoc * 10000));
        }

        if(gioBatDau >= 9 && gioBatDau <=17 && gioKetThuc >= 9 && gioKetThuc <= 17) {
            tongTien = (float) (tongTien*0.2);
        }

        System.out.println("Tong chi phi phai tra: " + tongTien);
    }
}

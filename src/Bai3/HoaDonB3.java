package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class HoaDonB3 implements Comparable<HoaDonB3>{
    private String maHD;
    private String ngayLap;
    private ArrayList<HangHoaB3> listHH = new ArrayList<>();

    public HoaDonB3() {
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma hoa don: ");
        maHD=scanner.nextLine();
        System.out.println("Nhap ngay lap hoa don: ");
        ngayLap=scanner.nextLine();
        System.out.print("Nhap so luong hang hoa trong hoa don: ");
        int n=scanner.nextInt();
        for (int i=0;i<n;i++)
        {
            HangHoaB3 temp = new HangHoaB3();
            temp.nhap();
            listHH.add(temp);
        }
    }
    public void xuat(){
        System.out.print("\n"+maHD+"--"+ngayLap+"\n");
        System.out.println("MaHH--TenH--SoL--DonG");
        for (HangHoaB3 x:listHH){
            x.xuat();
        }
        System.out.println("Tong tien: "+this.tongTien());
    }
    public float tongTien(){
        float tong=0;
        for (HangHoaB3 x:listHH){
            tong+=x.tinhTien();
        }
        return tong;
    }
    public float tongTien(float ck){
        float tong=0;
        for (HangHoaB3 x:listHH){
            tong+=x.tinhTien();
        }
        return tong*((100-ck)/100);
    }

    @Override
    public int compareTo(HoaDonB3 o) {
        if (this.tongTien()>o.tongTien()) return 1;
        if (this.tongTien()<o.tongTien()) return -1;
        return 0;
    }
}

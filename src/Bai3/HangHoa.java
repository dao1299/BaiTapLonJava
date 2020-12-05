package Bai3;

import java.util.Scanner;

public class HangHoa {
    private String maHH;
    private String tenHang;
    private int soL;
    private float donG;

    public HangHoa(String maHH, String tenHang, int soL, float donG) {
        this.maHH = maHH;
        this.tenHang = tenHang;
        this.soL = soL;
        this.donG = donG;
    }

    public HangHoa() {
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setSoL(int soL) {
        this.soL = soL;
    }

    public void setDonG(float donG) {
        this.donG = donG;
    }

    public String getMaHH() {
        return maHH;
    }

    public String getTenHang() {
        return tenHang;
    }

    public int getSoL() {
        return soL;
    }

    public float getDonG() {
        return donG;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma hang hoa: ");
        maHH=scanner.nextLine();
        System.out.print("Nhap ten hang hoa: ");
        tenHang=scanner.nextLine();
        System.out.print("Nhap so luong hang hoa: ");
        soL=scanner.nextInt();
        System.out.print("Nhap don gia hang hoa: ");
        donG=scanner.nextFloat();
    }
    public void xuat(){
        System.out.println(maHH+"--"+tenHang+"--"+soL+"--"+donG);
    }
    public float tinhTien(){
        return soL*donG;
    }
}

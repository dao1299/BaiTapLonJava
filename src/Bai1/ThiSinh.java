package Bai1;

import java.io.Serializable;
import java.util.Scanner;

public class ThiSinh implements Serializable {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String dienThoai;
    private String email;

    public ThiSinh(String hoTen, String ngaySinh, String diaChi, String dienThoai, String email) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.email = email;
    }

    public ThiSinh() {
    }
    public void InputThiSinh(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten thi sinh: ");
        hoTen=scanner.nextLine();
        System.out.print("Nhap ngay sinh thi sinh: ");
        ngaySinh=scanner.nextLine();
        System.out.print("Nhap dia chi thi sinh: ");
        diaChi=scanner.nextLine();
        System.out.print("Nhap dien thoai thi sinh: ");
        dienThoai=scanner.nextLine();
        System.out.print("Nhap email thi sinh: ");
        email=scanner.nextLine();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", dienThoai='" + dienThoai + '\'' +
                ", email='" + email + ','
                ;
    }
    public  void OutputThiSinhToScreen(){
        System.out.print("hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", dienThoai='" + dienThoai + '\'' +
                ", email='" + email + '\'');
    }
}

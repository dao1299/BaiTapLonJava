package Bai1;

import java.io.Serializable;
import java.util.Scanner;

public class ThiSinhC extends ThiSinh implements Comparable<ThiSinhC>, Serializable {
    private String khoa;
    private float diem1;
    private float diem2;
    private float diem3;

    public ThiSinhC(String hoTen, String ngaySinh, String diaChi, String dienThoai, String email, String khoa, float diem1, float diem2, float diem3) {
        super(hoTen, ngaySinh, diaChi, dienThoai, email);
        this.khoa = khoa;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public ThiSinhC(String khoa, float diem1, float diem2, float diem3) {
        this.khoa = khoa;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public String toString() {
        String x="";
        x+=super.toString();
        x+="khoa='" + khoa + '\'' +
                ", diem1=" + diem1 +
                ", diem2=" + diem2 +
                ", diem3=" + diem3 ;
        return x;
    }
    public void OutputThiSinhCToScreen(){
        OutputThiSinhToScreen();
        System.out.print(", khoa='" + khoa + '\'' +
                ", diem1=" + diem1 +
                ", diem2=" + diem2 +
                ", diem3=" + diem3 +
                ", tong diem=" + TongDiem() +
                "\n");
    }
    public ThiSinhC(String hoTen, String ngaySinh, String diaChi, String dienThoai, String email) {
        super(hoTen, ngaySinh, diaChi, dienThoai, email);
    }

    public ThiSinhC() {
    }
    public float TongDiem(){
        return diem1+diem2+diem3+diem1;
    }
    public void InputThiSinhC(){
        System.out.println("-----------------------------");
        InputThiSinh();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap khoa: ");
        khoa=scanner.nextLine();
        System.out.print("Nhap diem 1:");
        diem1=scanner.nextFloat();
        System.out.print("Nhap diem 2:");
        diem2=scanner.nextFloat();
        System.out.print("Nhap diem 3:");
        diem3=scanner.nextFloat();
    }

    @Override
    public int compareTo(ThiSinhC o){
        if (this.TongDiem()>o.TongDiem()) return 1;
        if (this.TongDiem()<o.TongDiem()) return -1;
        return 0;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }
}

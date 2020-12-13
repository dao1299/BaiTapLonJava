package B3;

import java.io.Serializable;
import java.util.Scanner;

public class HangHoa implements Serializable {
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

    @Override
    public String toString() {
        return "\n{" +
                "maHH='" + maHH + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", soL=" + soL +
                ", donG=" + donG +"}";
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoL() {
        return soL;
    }

    public void setSoL(int soL) {
        this.soL = soL;
    }

    public float getDonG() {
        return donG;
    }

    public void setDonG(float donG) {
        this.donG = donG;
    }
    public float tingTien(){
        return donG*soL;
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

}

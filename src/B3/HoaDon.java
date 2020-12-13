package B3;

import Bai3.HangHoaB3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class HoaDon extends B3.HangHoa implements Serializable, Comparable<HoaDon> {
    private String maHD;
    private String ngayLap;
    private ArrayList<HangHoa> listHH = new ArrayList<>();

    public HoaDon(String maHH, String tenHang, int soL, float donG, String maHD, String ngayLap, ArrayList<HangHoa> listHH) {
        super(maHH, tenHang, soL, donG);
        this.maHD = maHD;
        this.ngayLap = ngayLap;
        this.listHH = listHH;
    }

    public HoaDon(String maHD, String ngayLap, ArrayList<HangHoa> listHH) {
        this.maHD = maHD;
        this.ngayLap = ngayLap;
        this.listHH = listHH;
    }

    public HoaDon(String maHH, String tenHang, int soL, float donG) {
        super(maHH, tenHang, soL, donG);
    }

    public HoaDon() {
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public ArrayList<HangHoa> getListHH() {
        return listHH;
    }

    public void setListHH(ArrayList<HangHoa> listHH) {
        this.listHH = listHH;
    }

    /*@Override
    public String toString() {
        String s=super.toString();
        s+="maHD='" + maHD + '\'' +
                ", ngayLap='" + ngayLap + '\'' +
                ", listHH=" + listHH +
                '}'+"\n";
        return s;
    }*/

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHD='" + maHD + '\'' +
                ", ngayLap='" + ngayLap + '\'' +
                ", listHH=" + listHH +
                '}';
    }

    public void xuatHoaDon(){
        System.out.println(this);
    }
    public float tongTien(){
        float tong=0;
        for (HangHoa x:listHH){
            tong+=x.tingTien();
        }
        return tong;
    }
    public float tongTien(float ck){
        float tong=0;
        for (HangHoa x:listHH){
            tong+=x.tingTien();
        }
        return tong*((100-ck)/100);
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma hoa don: ");
        maHD=scanner.nextLine();
        System.out.print("Nhap ngay lap hoa don: ");
        ngayLap=scanner.nextLine();
        int n;
        do {
            System.out.print("Nhap so luong hang hoa trong hoa don: ");
            n = scanner.nextInt();
        }while (n<1);
        for (int i=0;i<n;i++)
        {
            System.out.println("------------------");
            HangHoa temp = new HangHoa();
            temp.nhap();
            listHH.add(temp);
        }
    }
    @Override
    public int compareTo(HoaDon o) {
        if (this.tongTien()>o.tongTien()) return 1;
        if (this.tongTien()<o.tongTien()) return -1;
        return 0;
    }
}

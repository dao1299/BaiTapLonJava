package Ngan;

import java.util.ArrayList;

public class Hoadon {
    private String maHD;
    private String ngayLap;
    private ArrayList<Hanghoa> listHH = new ArrayList<>();

    public Hoadon() {

    }

    /**
     * Tinh tong so tien cua 1 hoa don.
     * @return so tien
     */
    public float tongTien() {
        int sum = 0;
        for (Hanghoa e : listHH) {
            sum += e.tinhTien();
        }
        return sum;
    }

    /**
     * Tinh so tien duoc chiet khau.
     * @param ck phan tram chiet khau
     * @return so tien sau khi duoc chiet khau
     */
    public float tongTien(float ck) {
        return tongTien() * (1 - ck) / 100;
    }

    public void sortHD() {

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

    public ArrayList<Hanghoa> getListHH() {
        return listHH;
    }

    public void setListHH(ArrayList<Hanghoa> listHH) {
        this.listHH = listHH;
    }


}

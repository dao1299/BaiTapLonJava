package Ngan;

public class Hanghoa {
    private String maHH;
    private String tenHH;
    private int soL;
    private float donG;

    public Hanghoa() {
    }

    /**
     * Tinh tien cua loai hang.
     * @return so tien cua san pham
     */
    public float tinhTien() {
        return soL * donG;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
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
}

package Ngan;


import java.util.ArrayList;
import java.util.Scanner;

public class DSHoadon {
    private ArrayList<Hoadon> dsHoadon = new ArrayList<>();

    /**
     * Sap xep hoa don theo tong tien.
     */
    public void sapxepHoaDon() {
        for (int i = 0; i < dsHoadon.size() - 1; i++) {
            for (int j = i + 1; j < dsHoadon.size(); j++) {
                float hd1 = dsHoadon.get(i).tongTien();
                float hd2 = dsHoadon.get(j).tongTien();

                if (hd1 > hd2) {
                    Hoadon temp = dsHoadon.get(i);
                    dsHoadon.set(i, dsHoadon.get(j));
                    dsHoadon.set(j, temp);
                }
            }
        }
    }

    /**
     * Tong so tien cua cac hoa don.
     * @return sum
     */
    public float tongTienHoadon() {
        float sum = 0;
        for (Hoadon e : dsHoadon) {
            sum += e.tongTien();
        }
        return sum;
    }

    /**
     * Tinh so tien duoc giam gia.
     * @param ck phan tram giam gia
     * @return so tien duoc giam
     */
    public float soTienDuocGiam(float ck) {
        float sumCK = 0;
        for (Hoadon e : dsHoadon) {
            sumCK += e.tongTien(ck);
        }
        return tongTienHoadon() - sumCK;
    }

    public ArrayList<Hoadon> getDsHoadon() {
        return dsHoadon;
    }

    public void setDsHoadon(ArrayList<Hoadon> dsHoadon) {
        this.dsHoadon = dsHoadon;
    }

    public static void main(String[] args) {
        DSHoadon dsHoadon = new DSHoadon();
        boolean has = true;
        Scanner scanner = new Scanner(System.in);
        int soluonghd = 0;
        int soluongsanpham = 0;

        while (has) {
            System.out.println("Nhap vao so luong hoa don: ");
            soluonghd = scanner.nextInt();

            if (soluonghd <= 0) {
                continue;
            }
            int temp = 0;
            while (temp < soluonghd) {
                temp++;
                Hoadon hoadon = new Hoadon();
                System.out.println("Nhap vao so luong san pham cua hoa don " + temp + ":" );
                soluongsanpham = scanner.nextInt();
                int temp1 = 0;
                while (temp1 < soluongsanpham) {
                    temp1++;
                    Hanghoa hanghoa = new Hanghoa();
                    System.out.println("Nhap vao ma HH cua san pham "+ temp1+" : " );
                    hanghoa.setMaHH(scanner.next());
                    System.out.println("Nhap vao ten HH cua san pham "+ temp1+" : ");
                    hanghoa.setTenHH(scanner.next()); //LỖi - Đạo cmt
                    System.out.println("Nhap vao soL cua san pham "+ temp1+" : ");
                    hanghoa.setSoL(scanner.nextInt());
                    System.out.println("Nhap vao don gia HH cua san pham" + temp1+" : " );
                    hanghoa.setDonG(scanner.nextInt());
                    hoadon.getListHH().add(hanghoa);
                }
                dsHoadon.getDsHoadon().add(hoadon);
            }
            dsHoadon.sapxepHoaDon();
            if (temp >= soluonghd) {
                has = false;
            }
        }

        System.out.println(dsHoadon);
    }
}

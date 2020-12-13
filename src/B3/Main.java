package B3;

import B3.HoaDon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<HoaDon> listHD = new ArrayList<>();
    public static void case1(){
        int n;
        do
        {
            System.out.print("Nhap so luong hoa don: ");
            n=scanner.nextInt();
        }while(n<1);
        for (int i=0;i<n;i++)
        {
            System.out.println("-------------------");
            System.out.println("Hoa don"+(i+1)+" :");
            HoaDon tempHD = new HoaDon();
            tempHD.nhap();
            listHD.add(tempHD);
        }
    }
    public static void case2(){
        Collections.sort(listHD);
        case5();
    }
    public static void case3(){
        float sum=0;
        for (HoaDon x:listHD){
            sum+=x.tongTien();
        }
        System.out.println("Tong tien tat ca hoa don: "+sum);
    }
    public static void case4(){
        float sum=0;
        float ck;
        do {
            System.out.println("Nhap phan tram chiet khau: ");
            ck = scanner.nextFloat();
        }while (ck>100 || ck<0);
        for (HoaDon x:listHD){
            sum+=x.tongTien(ck);
        }
        System.out.println("Tong tien tat ca hoa don: "+sum);
    }
    public static void case5(){
        System.out.println("Danh sách hóa đơn: ");
        for (int i=0;i<listHD.size();i++){
            System.out.println("---------------------");
            listHD.get(i).xuatHoaDon();
        }
    }

    public static void main(String[] args) {

        int n, chon;

        do {
            System.out.println("\n-----------------");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Sap xep hoa don theo tong tien");
            System.out.println("3. Tinh tong tien tat ca hoa don");
            System.out.println("4. Tinh tong tien tat ca hoa don co chiet khau");
            System.out.println("5. In danh sach ");
            System.out.println("6. Thoat");
            do{
                System.out.print("Moi ban chon: ");
                chon = scanner.nextInt();
            }
            while (chon<1 || chon>6);
            switch (chon) {
                case 1:
                    case1();
                    break;
                case 2:
                    case2();
                    break;
                case 3:
                    case3();
                    break;
                case 4:
                    case4();
                    break;
                case 5:
                    case5();
                    break;
                case 6:
                    System.out.println(" Tạm biệt ");
                    break;
            }
        } while (chon != 6);
    }
}

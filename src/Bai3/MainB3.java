package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainB3 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<HoaDonB3> listHD = new ArrayList<>();
    public void case1(){
        System.out.println("Nhap so luong hoa don: ");
        int n=scanner.nextInt();
        for (int i=0;i<n;i++)
        {
            HoaDonB3 tempHD = new HoaDonB3();
            tempHD.nhap();
            listHD.add(tempHD);
        }
    }
    public void case2(){
        Collections.sort(listHD);
        case5();
    }
    public void case3(){
        float sum=0;
        for (HoaDonB3 x:listHD){
            sum+=x.tongTien();
        }
        System.out.println("Tong tien tat ca hoa don: "+sum);
    }
    public void case4(){
        float sum=0;
        System.out.println("Nhap phan tram chiet khau: ");
        float ck=scanner.nextFloat();
        for (HoaDonB3 x:listHD){
            sum+=x.tongTien(ck);
        }
        System.out.println("Tong tien tat ca hoa don: "+sum);
    }
    public void case5(){

        for (int i=0;i<listHD.size();i++){
            System.out.print("-----------------");
            listHD.get(i).xuat();
            System.out.println("-----------------");
        }
    }

    public static void main(String[] args) {

        int n,chon;
        MainB3 mainB3 =  new MainB3();
        do{
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Sap xep hoa don theo tong tien");
            System.out.println("3. Tinh tong tien tat ca hoa don");
            System.out.println("4. Tinh tong tien tat ca hoa don co chiet khau");
            System.out.println("5. In danh sach ");
            System.out.println("6. Thoat");
            System.out.print("Moi ban chon: ");
            chon=scanner.nextInt();

            switch (chon){
                case 1:
                    mainB3.case1();
                    break;
                case 2:
                    mainB3.case2();
                    break;
                case 3:
                    mainB3.case3();
                    break;
                case 4:
                    mainB3.case4();
                    break;
                case 5:
                    mainB3.case5();
                    break;
                case 6:
                    System.out.println(" Done ");
                    break;
            }
        }while(chon!=6);
    }
}

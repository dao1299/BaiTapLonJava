package Bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainThiSinh {
    public static void main(String[] args) throws ClassNotFoundException,IOException,ClassCastException {
        ArrayList<ThiSinhC> listThiSinh = new ArrayList<>();
        int soLuongThiSinh = 0;
        int chon = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----------------------------");
            System.out.println("1. Nhap danh sach thi sinh C"); // done
            System.out.println("2. In danh sach thi sinh C"); // done
            System.out.println("3. Tim kiem");
            System.out.println("4. Sap xep"); // done
            System.out.println("5. Tim gia tri lon nhat"); // done
            System.out.println("6. Dem theo dieu kien");
            System.out.println("7. Luu file"); // done
            System.out.println("8. Doc file"); // done
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = scanner.nextInt();
            switch (chon) {
                case 1: //Thêm danh sách
                    System.out.println("-----------------------------");
                    int n;
                    do {
                        System.out.print("Nhập số lượng thí sinh muốn thêm: ");
                        n = scanner.nextInt();
                    }while (n<0);
                    soLuongThiSinh += scanner.nextInt();
                    for (int i = 0; i < soLuongThiSinh; i++) {
                        ThiSinhC temp = new ThiSinhC();
                        temp.InputThiSinhC();
                        listThiSinh.add(temp);
                    }
                    break;
                case 2://In danh sách
                    System.out.println("-----------------------------");
                    System.out.println("Danh sách thí sinh: ");
                    for (ThiSinhC x : listThiSinh) {
                        x.OutputThiSinhCToScreen();
                    }
                    break;
                case 3://Tìm kiếm
                    System.out.println("-----------------------------");
                    System.out.println("1. Tìm kiếm theo tên");
                    System.out.println("2. Tìm kiếm theo khoa");
                    System.out.println("3. Tìm kiếm theo điểm");
                    int c;
                    do{
                        System.out.print("Chọn: ");
                        c = scanner.nextInt();
                    }while (c<1 || c>3);

                    int count;
                    switch (c) {
                        case 1:
                            System.out.println("--------------------------");
                            count = 0;
                            scanner.nextLine();
                            System.out.println("Nhập tên muốn tìm: ");
                            String tenS = scanner.nextLine();
                            System.out.println("---------------------------");
                            System.out.println("Kết quả tìm kiếm: ");
                            for (ThiSinhC x : listThiSinh) {
                                if (x.getHoTen().toLowerCase().contains(tenS.toLowerCase())) {
                                    x.OutputThiSinhCToScreen();
                                    count++;
                                }
                            }
                            if (count == 0) {
                                System.out.println("Không có");
                            }
                            break;
                        case 2:
                            System.out.println("--------------------------");
                            count = 0;
                            scanner.nextLine();
                            System.out.println("Nhập tên khoa: ");
                            String khoaS = scanner.nextLine();
                            System.out.println("---------------------------");
                            System.out.println("Kết quả tìm kiếm: ");
                            for (ThiSinhC x : listThiSinh) {
                                if (x.getKhoa().toLowerCase().contains(khoaS.toLowerCase())) {
                                    x.OutputThiSinhCToScreen();
                                    count++;
                                }
                            }
                            if (count == 0) {
                                System.out.println("Khong co");
                            }
                            break;
                        case 3:
                            System.out.println("--------------------------");
                            System.out.println("Nhập điểm: ");
                            float diemTimKiem = scanner.nextFloat();
                            System.out.println("1. Tìm kiếm chính xác");
                            System.out.println("2. Tìm kiếm lớn hơn");
                            System.out.println("3. Tìm kiếm nhỏ hơn");
                            int chonSearchDiem;
                            do{
                                System.out.println("Chọn: ");
                                chonSearchDiem= scanner.nextInt();
                            }while (chonSearchDiem<0 || chonSearchDiem>3);
                            System.out.println("--------------------------");
                            System.out.println("Kết quả tìm kiếm: ");
                            switch (chonSearchDiem) {
                                case 1:
                                    for (ThiSinhC x : listThiSinh) {
                                        if (x.TongDiem() == diemTimKiem) {
                                            x.OutputThiSinhCToScreen();
                                        }
                                    }
                                    break;
                                case 2:
                                    for (ThiSinhC x : listThiSinh) {
                                        if (x.TongDiem() > diemTimKiem) {
                                            x.OutputThiSinhCToScreen();
                                        }
                                    }
                                    break;
                                case 3:
                                    for (ThiSinhC x : listThiSinh) {
                                        if (x.TongDiem() < diemTimKiem) {
                                            x.OutputThiSinhCToScreen();
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                    break;
                case 4:
                    System.out.println("-----------------------------");
                    Collections.sort(listThiSinh);
                    System.out.println("Danh sách thí sinh sau khi sắp xếp tăng dần về tổng điểm");
                    for (ThiSinhC x : listThiSinh) {
                        x.OutputThiSinhCToScreen();
                    }
                    break;
                case 5:
                    System.out.println("-----------------------------");
                    Collections.sort(listThiSinh);
                    System.out.println("Thí sinh có tổng điểm cao nhất: ");
                    listThiSinh.get(listThiSinh.size() - 1).OutputThiSinhCToScreen();
                    break;
                case 6:
                    System.out.println("1. Đếm theo điều kiện điểm 1.");
                    System.out.println("2. Đếm theo điều kiện điểm 2.");
                    System.out.println("3. Đếm theo điều kiện điểm 3.");
                    System.out.println("4. Đếm theo điều kiện tổng điểm.");
                    int chon6;
                    do {
                        System.out.print("Mời bạn chọn: ");
                        chon6=scanner.nextInt();
                    }while(chon6<1||chon6>4);
                    int count6=0;
                    float value;
                    switch (chon6){
                        case 1:
                            System.out.println("1. Đếm theo nhỏ hơn");
                            System.out.println("2. Đếm theo lớn hơn");
                            System.out.println("3. Đếm theo bằng");
                            do {
                                System.out.print("Mời bạn chọn: ");
                                chon6=scanner.nextInt();
                            }while(chon6<1||chon6>3);
                            System.out.print("Mời bạn nhập giá trị: ");
                            value=scanner.nextFloat();
                            switch (chon6){
                                case 1:
                                    System.out.println("----------------------------");
                                    count6=0;
                                    for (ThiSinhC x:listThiSinh){
                                        if (x.getDiem1()<value){
                                            count6+=1;
                                        }
                                    }
                                    System.out.println("Số lượng thí sinh có điểm 1 nhở hơn "+value+": "+count6);
                                    break;
                                case 2:
                                    System.out.println("----------------------------");
                                    count6=0;
                                    for (ThiSinhC x:listThiSinh){
                                        if (x.getDiem1()>value){
                                            count6+=1;
                                        }
                                    }
                                    System.out.println("Số lượng thí sinh có điểm 1 lớn hơn "+value+": "+count6);
                                    break;
                                case 3:
                                    System.out.println("----------------------------");
                                    count6=0;
                                    for (ThiSinhC x:listThiSinh){
                                        if (x.getDiem1()==value){
                                            count6+=1;
                                        }
                                    }
                                    System.out.println("Số lượng thí sinh có điểm 1 bằng "+value+": "+count6);
                                    break;
                                default:
                                    System.out.println("Chọn lại!");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("1. Đếm theo nhỏ hơn");
                            System.out.println("2. Đếm theo lớn hơn");
                            System.out.println("3. Đếm theo bằng");
                            do {
                                System.out.print("Mời bạn chọn: ");
                                chon6=scanner.nextInt();
                            }while(chon6<1||chon6>3);
                            System.out.print("Mời bạn nhập giá trị: ");
                            value=scanner.nextFloat();
                            switch (chon6){
                                case 1:
                                    System.out.println("----------------------------");
                                    count6=0;
                                    for (ThiSinhC x:listThiSinh){
                                        if (x.getDiem2()<value){
                                            count6+=1;
                                        }
                                    }
                                    System.out.println("Số lượng thí sinh có điểm 2 nhỏ hơn "+value+": "+count6);
                                    break;
                                case 2:
                                    System.out.println("----------------------------");
                                    count6=0;
                                    for (ThiSinhC x:listThiSinh){
                                        if (x.getDiem2()>value){
                                            count6+=1;
                                        }
                                    }
                                    System.out.println("Số lượng thí sinh có điểm 2 lớn hơn "+value+": "+count6);
                                    break;
                                case 3:
                                    System.out.println("----------------------------");
                                    count6=0;
                                    for (ThiSinhC x:listThiSinh){
                                        if (x.getDiem2()==value){
                                            count6+=1;
                                        }
                                    }
                                    System.out.println("Số lượng thí sinh có điểm 2 bằng "+value+": "+count6);
                                    break;
                                default:
                                    System.out.println("Chọn lại!");
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("1. Đếm theo nhỏ hơn");
                            System.out.println("2. Đếm theo lớn hơn");
                            System.out.println("3. Đếm theo bằng");
                            do {
                                System.out.print("Mời bạn chọn: ");
                                chon6=scanner.nextInt();
                            }while(chon6<1||chon6>3);
                            System.out.print("Mời bạn nhập giá trị: ");
                            value=scanner.nextFloat();

                            switch (chon6){
                                case 1:
                                    System.out.println("----------------------------");
                                    count6=0;
                                    for (ThiSinhC x:listThiSinh){
                                        if (x.getDiem3()<value){
                                            count6+=1;
                                        }
                                    }
                                    System.out.println("Số lượng thí sinh có điểm 3 nhỏ hơn "+value+": "+count6);
                                    break;
                                case 2:
                                    System.out.println("----------------------------");
                                    count6=0;
                                    for (ThiSinhC x:listThiSinh){
                                        if (x.getDiem3()>value){
                                            count6+=1;
                                        }
                                    }
                                    System.out.println("Số lượng thí sinh có điểm 3 lớn hơn "+value+": "+count6);
                                    break;
                                case 3:
                                    System.out.println("----------------------------");
                                    count6=0;
                                    for (ThiSinhC x:listThiSinh){
                                        if (x.getDiem3()==value){
                                            count6+=1;
                                        }
                                    }
                                    System.out.println("Số lượng thí sinh có điểm 3 bằng "+value+": "+count6);
                                    break;
                                default:
                                    System.out.println("Chọn lại!");
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("1. Đếm theo nhỏ hơn");
                            System.out.println("2. Đếm theo lớn hơn");
                            System.out.println("3. Đếm theo bằng");
                            do {
                                System.out.print("Mời bạn chọn: ");
                                chon6=scanner.nextInt();
                            }while(chon6<1||chon6>3);
                            System.out.print("Mời bạn nhập giá trị: ");
                            value=scanner.nextFloat();

                            switch (chon6){
                                case 1:
                                    System.out.println("----------------------------");
                                    count6=0;
                                    for (ThiSinhC x:listThiSinh){
                                        if (x.TongDiem()<value){
                                            count6+=1;
                                        }
                                    }
                                    System.out.println("Số lượng thí sinh có tổng điểm nhỏ hơn "+value+": "+count6);
                                    break;
                                case 2:
                                    System.out.println("----------------------------");
                                    count6=0;
                                    for (ThiSinhC x:listThiSinh){
                                        if (x.TongDiem()>value){
                                            count6+=1;
                                        }
                                    }
                                    System.out.println("Số lượng thí sinh có tổng điểm lớn hơn "+value+": "+count6);
                                    break;
                                case 3:
                                    System.out.println("----------------------------");
                                    count6=0;
                                    for (ThiSinhC x:listThiSinh){
                                        if (x.TongDiem()==value){
                                            count6+=1;
                                        }
                                    }
                                    System.out.println("Số lượng thí sinh có tổng điểm bằng "+value+": "+count6);
                                    break;
                                default:
                                    System.out.println("Chọn lại!");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Chọn lại!");
                            break;
                    }
                    break;
                case 7:
                    System.out.println("-----------------------------");
                    try {
                        FileOutputStream fos = new FileOutputStream("thisinh.txt");
                        ObjectOutputStream fout = new ObjectOutputStream(fos);
                        fout.writeObject(listThiSinh);
                        fout.close();
                        fos.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    System.out.println("Da ghi file thanh cong");
                    break;

                case 8:
                    System.out.println("-----------------------------");
                    try {
                        FileInputStream fileInputStream = new FileInputStream("thisinh.txt");
                        ObjectInputStream fin = new ObjectInputStream(fileInputStream);
                        ArrayList<ThiSinhC> ListReadFromFile = (ArrayList<ThiSinhC>)fin.readObject();
                        int chonAdd;
                        do{
                            System.out.println("Ban co muon chen danh sach vua doc vao danh sach hien tai: ");
                            System.out.println("1. Co");
                            System.out.println("2. Khong");
                            chonAdd = scanner.nextInt();
                        }while (chonAdd!=1 || chonAdd!=2);
                        if (chonAdd == 1) {
                            listThiSinh.addAll(ListReadFromFile);
                        } else {

                        }
                        fin.close();
                        fileInputStream.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;
                case 0:
                    System.out.println("Ban da thoat! ");
                    break;
                default:
                    System.out.println("Chọn lại!");
                    break;
            }
        } while (chon != 0);
    }
}

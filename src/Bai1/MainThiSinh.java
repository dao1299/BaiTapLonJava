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
                case 1:
                    System.out.println("-----------------------------");
                    System.out.print("Nhap so luong thi sinh: ");
                    soLuongThiSinh += scanner.nextInt();
                    for (int i = 0; i < soLuongThiSinh; i++) {
                        ThiSinhC temp = new ThiSinhC();
                        temp.InputThiSinhC();
                        listThiSinh.add(temp);
                    }
                    break;
                case 2:
                    System.out.println("-----------------------------");
                    System.out.println("Danh sach thi sinh: ");
                    for (ThiSinhC x : listThiSinh) {
                        x.OutputThiSinhCToScreen();
                    }
                    break;
                case 3:
                    System.out.println("-----------------------------");
                    System.out.println("1. Tim kiem theo ten");
                    System.out.println("2. Tim kiem theo khoa");
                    System.out.println("3. Tim kiem theo diem");
                    System.out.print("Chon: ");
                    int c = scanner.nextInt();
                    int count;
                    switch (c) {
                        case 1:
                            System.out.println("--------------------------");
                            count = 0;
                            scanner.nextLine();
                            System.out.println("Nhap ten: ");
                            String tenS = scanner.nextLine();
                            System.out.println("---------------------------");
                            System.out.println("Ket qua tim kiem: ");
                            for (ThiSinhC x : listThiSinh) {
                                if (x.getHoTen().toLowerCase().contains(tenS.toLowerCase())) {
                                    x.OutputThiSinhCToScreen();
                                    count++;
                                }
                            }
                            if (count == 0) {
                                System.out.println("Khong co");
                            }
                            break;
                        case 2:
                            System.out.println("--------------------------");
                            count = 0;
                            scanner.nextLine();
                            System.out.println("Nhap khoa: ");
                            String khoaS = scanner.nextLine();
                            System.out.println("---------------------------");
                            System.out.println("Ket qua tim kiem: ");
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
                            System.out.println("Nhap diem: ");
                            float diemTimKiem = scanner.nextFloat();
                            System.out.println("1. Tim kiem chinh xac");
                            System.out.println("2. Tim kiem lon hon");
                            System.out.println("3. Tim kiem nho hon");
                            System.out.println("Chon: ");
                            int chonSearchDiem = scanner.nextInt();
                            System.out.println("--------------------------");
                            System.out.println("Ket qua tim kiem: ");
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
                    System.out.println("Danh sach thi sinh sau khi sap xep tang dan ve tong diem:");
                    for (ThiSinhC x : listThiSinh) {
                        x.OutputThiSinhCToScreen();
                    }
                    break;
                case 5:
                    System.out.println("-----------------------------");
                    Collections.sort(listThiSinh);
                    System.out.println("Thi sinh co tong diem lon nhat: ");
                    listThiSinh.get(listThiSinh.size() - 1).OutputThiSinhCToScreen();
                    break;
                case 6:
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("-----------------------------");
                    try {
                        FileOutputStream fos = new FileOutputStream("thisinh.txt");
                        ObjectOutputStream fout = new ObjectOutputStream(fos);
                        for (ThiSinhC x : listThiSinh) {
                            fout.writeObject(x);
                        }
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
                        //ArrayList<ThiSinhC> tempRead = (ArrayList<ThiSinhC>)fin.readObject();
                        //listThiSinh.add((ThiSinhC)fin.readObject());
                        ArrayList<ThiSinhC> ListRead = new ArrayList<>();
                        ListRead=(ArrayList<ThiSinhC>)fin.readObject();
                        System.out.println("Ban co muon chen danh sach vua doc vao danh sach hien tai: ");
                        System.out.println("1. Co");
                        System.out.println("2. Khong");
                        int chonAdd = scanner.nextInt();
                        if (chonAdd == 1) {
                            listThiSinh.addAll(ListRead);
                        } else {

                        }
                        fin.close();
                        fileInputStream.close();
                    } catch (IOException | ClassNotFoundException e) {
                        System.out.println(e);
                    }
                    break;
                case 0:
                    System.out.println("Ban da thoat! ");
                    break;
                default:
                    System.exit(0);
                    break;
            }
        } while (chon != 0);
    }
}

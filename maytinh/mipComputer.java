package quanlydt.maytinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mipComputer {
    public static <n> void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int chon;
        List<MayTinh> list=new ArrayList<>();
        do {
            System.out.println("1. Input\n2. Display\n3. Sort\n4. Search\n5. Exit\nChon so ban can (1->5): ");
            chon=Integer.parseInt(input.nextLine());
            switch (chon){
                case 1:
                    int n;
                    try{
                        System.out.println("Chon so may de nhap thong tin (toi thieu 3)");
                        n=Integer.parseInt(input.nextLine());
                        if(n<3){
                            throw new RuntimeException("");
                        }else {
                            System.out.println("========== Dell ==========");
                            for (int i = 0; i < n; i++) {
                                System.out.println("May thu "+(i+1));
                                Dell dell=new Dell();
                                dell.inputInfor();
                                list.add(dell);
                            }
                            System.out.println("========== Apple ==========");
                            for (int i = 0; i < n; i++) {
                                System.out.println("May thu "+(i+1));
                                Apple apple=new Apple();
                                apple.inputInfor();
                                list.add(apple);
                            }
                        }
                    }catch (Exception e){
                        System.err.println("Nhap lai (toi thieu phai la 3 may)");
                    }
                    break;
                case 2:
                    System.out.println("Thong tin cac may vua nhap la");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 3:
                    System.out.println("********* Truoc khi sap xep ********* ");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    Collections.sort(list,(x,y)->{
                        int waX=0;
                        int waY=0;
                        if(x instanceof Dell){
                            Dell dell=(Dell) x;
                            waX= dell.warranty;
                        }else {
                            Apple apple=(Apple) x;
                            waX= apple.warranty;
                        }
                        if(y instanceof Dell){
                            Dell dell=(Dell) y;
                            waY= dell.warranty;
                        }else {
                            Apple apple=(Apple) y;
                            waY= apple.warranty;
                        }
                        return waX-waY;
                    });
                    System.out.println("********* Sau khi sap xep theo warranty *********");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 4:
                    String nameMayTinh="apple";
                    System.out.println("Nhung may co ten apple la:");
                    for (MayTinh mayTinh:list) {
                        if(mayTinh.name.equals(nameMayTinh)){
                            System.out.println(mayTinh);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Da thoat chuong trinh");
                    return;
                default:
                    System.out.println("Chon sai vui long chon lai");
            }
        }while (true);
    }
}

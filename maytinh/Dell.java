package quanlydt.maytinh;

import java.util.Scanner;

public class Dell extends MayTinh{
    int warranty;

    @Override
    public void inputInfor() {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap warranty");
        warranty=Integer.parseInt(input.nextLine());
        super.inputInfor();
    }

    @Override
    public String toString() {
        return "Dell{" +
                "warranty=" + warranty +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price + " $"+
                '}';
    }

    @Override
    public void displayInfor() {

    }

    @Override
    public void changeInfor() {
        super.changeInfor();
    }
}

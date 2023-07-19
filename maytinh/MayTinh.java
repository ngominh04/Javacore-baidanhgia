package quanlydt.maytinh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MayTinh implements IMaytinh{
    String code; // mã
    String name; // tên
    double price; // giá

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrive() {
        return price;
    }

    public void setPrive(double prive) {
        this.price = prive;
    }

    @Override
    public void inputInfor() {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap code: ");
        code=input.nextLine();
        System.out.println("Nhap name: ");
        name=input.nextLine();
        System.out.println("Nhap price: ");
        price=Double.parseDouble(input.nextLine());
    }

    @Override
    public String toString() {
        return "MayTinh{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void displayInfor() {

    }

    @Override
    public void changeInfor() {

    }
}

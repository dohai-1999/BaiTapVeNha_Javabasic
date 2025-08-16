package Javabasic2;

public class Calculator {
    int a = 10;  // khai báo biến toàn cục
    int b = 20;
    float c = -2.5F;
    float d = 5.5F;

    public void sumintergers(){//tạo hàm
        System.out.println("Tổng của hai số nguyên là: a + b = " + (a + b ));
    }

    public void sumfload(){
        System.out.println("Tổng của hai số thực là: c + d =" + (c + d));
    }

    public static void main(String[] args) {
        Calculator tinhtongsonguyen = new Calculator();
        tinhtongsonguyen.sumintergers();

        Calculator tinhtongsothuc = new Calculator();
        tinhtongsothuc.sumfload();

    }
}



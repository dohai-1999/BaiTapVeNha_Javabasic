package Javabasic2;

public class Calculator1 {
    static  int a = 10;  // khai báo biến toàn cục
    static int b = 20;
    static float c = -2.5F;
    static float d = 5.5F;

    public static void main(String[] args) {
        Calculator1 tinhtong = new Calculator1();
        System.out.println("Tính tổng: a+b="+(tinhtong.a + tinhtong.b));
        System.out.println("Tính tích: c*d="+(tinhtong.c * tinhtong.d));

    }
}



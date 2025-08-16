package Javabasic3;

public class BaiTap3 {
    static int number = 100; // biến cố định

    public void test() {
        int n = 150;

        if (n == number) {
            System.out.println("Tham số n bằng number");
        } else if (n < number) {
            System.out.println("Tham số n nhỏ hơn number");
        }else {
            System.out.println("Tham số n lớn hơn number");
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 20;
        float c = 1.5F;
        double d = -2.5D;
        String e = "Hà Nội";

        System.out.println("So sánh  > :" + (a > b));
        System.out.println("So sánh < :" + ((a + d) < (b + c)));
        System.out.println("Logic 1 &&:" + ((a > b) && (c > d)));
        System.out.println("Logic 2 ||:" + ((a > b) || (c > d)));
        System.out.println("Logic 3 ==:" + ((a == b) || (e.contains("Nội"))));// so sánh chứa ha comtains


        BaiTap3 test1 = new BaiTap3();
        test1.test();
    }
}

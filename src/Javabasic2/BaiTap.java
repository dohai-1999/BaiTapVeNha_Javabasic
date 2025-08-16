package Javabasic2;

public class BaiTap {
    public int cong2So(int a, int b) { // hàm trả về
        return (a + b);
    }

    public int tich2So(int a, int b) {
        return (a * b);
    }

    public static void main(String[] args) {
        BaiTap baiTap = new BaiTap();
        System.out.println(baiTap.cong2So(10,5));
        System.out.println(baiTap.tich2So(12,5));

    }
}

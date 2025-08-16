package Javabasic1;

public class SinhVien {
    int x = 5; //biến toàn cục
    static double y = -1.5D; // biến static

    public void HocSinh(){
        float z = 4.5F;
        System.out.println("Biến z = "+z);
    }
    public static void main(String[] args) {
        SinhVien bien = new SinhVien(); // gọi lại để in biến toàn cục
        bien.HocSinh(); // để tin biến local
        System.out.println("Biến x = "+bien.x);
        System.out.println("Biến y = "+ y);
        bien.HocSinh();


        System.out.println("Mã sinh viên là: "+ ThongTin.MA_SINHVIEN);// in giá trị biến static ở 1 class khác
        System.out.println("Tên sinh viên là "+ ThongTin.TEN_SINHVIEN);

    }
}

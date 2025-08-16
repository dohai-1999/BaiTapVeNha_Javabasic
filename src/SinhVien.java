public class SinhVien {
    public void getInfoStudent(){
         String tensinhvien = " Nguyễn Văn A"; // Khai báo biến local
        System.out.println("Tên sinh viên là:"+tensinhvien);
    }
    public static void main(String[] args) {
        SinhVien bienLocal = new SinhVien();
        bienLocal.getInfoStudent();   // Gọi hàm để in ra giá trị đã khai báo
    }
}

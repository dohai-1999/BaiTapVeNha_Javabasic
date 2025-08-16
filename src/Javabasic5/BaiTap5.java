package Javabasic5;

import java.util.ArrayList;
import java.util.List;

public class BaiTap5 {
    //Tạo hàm để thêm thông tin cơ bản của 1 nhân viên
    private static List<String> addEmployee(String ten, String tuoi, String vitri, String quequan) {
        List<String> employeeInfo = new ArrayList<>();

        employeeInfo.add(ten);
        employeeInfo.add(tuoi);
        employeeInfo.add(vitri);
        employeeInfo.add(quequan);

        return employeeInfo;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //Kiểm tra số chẵn, add vào ArrayList
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        System.out.println("*****************");
        //Duyệt giá trị trong ArrayList
        for (int i : list) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("===Thông tin nhân viên=====");

        List<String> employee = addEmployee("Nguyễn văn A", "25", "QC", "Hà Nội");
        for (String value : employee) {
            System.out.println(value);
        }

//        for (int i =0;i<=employeeInfo.size();i++){
//            System.out.println(employeeInfo.get(i));
//        }

    }
}

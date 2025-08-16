package Javabasic5;

import java.util.ArrayList;
import java.util.List;

public class BaiTap5_1 {
    private static void addEmployee(String ten, String tuoi, String vitri, String quequan) {
        List<String> employeeInfo = new ArrayList<>();
        employeeInfo.add(ten);
        employeeInfo.add(tuoi);
        employeeInfo.add(vitri);
        employeeInfo.add("Hà Nội");
        System.out.println(employeeInfo);
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

//        List<String> employee = addEmployee("Nguyễn văn A", "25", "QC", "Hà Nội");
        addEmployee("Nguyễn Văn A","25 tuổi","QC","Hà Nội");
        for (String value : addEmployee()) {
            System.out.println(value);
        }

    }
}

package Javabasic4;

public class BaiTap4 {
    public static void main(String[] args) {
        //Tạo vòng lặp for in ra các số chẵn 0~50
//        for (int i = 0; i <= 50; i += 2) {
//            System.out.println(i);
//        }

        int mangSoNguyen[] = new int[26];
        int index = 0;
        //DÙng % để kiểm tra phần dư
        for (int j = 0; j <= 50; j++) {
            if (j % 2 == 0) {
                System.out.print(j + "  ");
                mangSoNguyen[index] = j;//Gán giá trị số chẵn vào vị trí mảng tuần tự
                index++; // Tăng  biến chỉ mục lên 1 đơn vị
            }
        }
        System.out.println("==========");
        //Duyệt mảng
        for (int value: mangSoNguyen){
            System.out.println(value);
        }

    }
}

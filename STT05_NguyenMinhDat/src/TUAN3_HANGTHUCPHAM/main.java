package TUAN3_HANGTHUCPHAM;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        try {
            HANGTHUCPHAM tp1 = new HANGTHUCPHAM("001", "Gạo", 100000.0,LocalDate.of(2018, 1, 10),LocalDate.of(2018, 7, 10));
            HANGTHUCPHAM tp2 = new HANGTHUCPHAM("002", "Mì", 5000.0,LocalDate.of(2018, 3, 1),LocalDate.of(2018, 9, 1));
            HANGTHUCPHAM tp3 = new HANGTHUCPHAM("003", "Nước", 10000.0,LocalDate.of(2017, 3, 1),LocalDate.of(2018, 3, 1));
            System.out.printf("%-10s %-15s %-20s %-18s %-18s %-15s\n","Mã Hàng","Tên Hàng","Đơn Giá","Ngày Sản Xuất","Ngày Hết Hạn","Ghi Chú");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println(tp1);
            System.out.println(tp2);
            System.out.println(tp3);
            System.out.println("\nTEST Mã hàng rỗng ");
            HANGTHUCPHAM tpLoi = new HANGTHUCPHAM("","Sữa",15000.0,LocalDate.of(2022, 1, 1),LocalDate.of(2022, 6, 1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

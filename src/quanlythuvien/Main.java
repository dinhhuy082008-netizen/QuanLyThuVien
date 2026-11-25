package quanlythuvien;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> danhSach = new ArrayList<>();
        danhSach.add(new Book("S01", "Lập trình Java cơ bản", "Nguyễn Văn A"));
        danhSach.add(new Book("S02", "Cấu trúc dữ liệu và giải thuật", "Trần Thị B"));

        System.out.println("=== DANH SÁCH SÁCH ===");
        for (Book b : danhSach) {
            b.hienThiThongTin();
        }
    }
}
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

        System.out.println("\n=== TIM KIEM SACH ===");
        String maTim = "S01";
        Book ketQua = timKiemSach(danhSach, maTim);
        if (ketQua != null) {
            System.out.println("Đã tìm thấy sách:");
            ketQua.hienThiThongTin();
        } else {
            System.out.println("Không tìm thấy sách có mã: " + maTim);
        }
    }

    public static Book timKiemSach(ArrayList<Book> list, String maCanTim) {
        for (Book b : list) {
            if (b.getMaSach().equalsIgnoreCase(maCanTim)) {
                return b;
            }
        }
        return null;
    }
}
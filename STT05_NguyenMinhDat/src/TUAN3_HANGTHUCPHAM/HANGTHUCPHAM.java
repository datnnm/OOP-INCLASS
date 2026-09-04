package TUAN3_HANGTHUCPHAM;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HANGTHUCPHAM {
    private String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setMaHang(String maHang) throws Exception {
        if (maHang != null && !maHang.trim().isEmpty()) {
            this.maHang = maHang;
        } else {
            throw new Exception("Ma hang khong duoc de rong!");
        }
    }

    public void setTenHang(String tenHang) {
        if (tenHang != null && !tenHang.trim().isEmpty()) {
            this.tenHang = tenHang;
        } else {
            this.tenHang = "xxx";
        }
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        } else {
            this.donGia = 0;
        }
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat != null && !ngaySanXuat.isAfter(LocalDate.now())) {
            this.ngaySanXuat = ngaySanXuat;
        } else {
            this.ngaySanXuat = LocalDate.now();
        }
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan != null
                && ngaySanXuat != null
                && ngayHetHan.isAfter(ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        } else {
            this.ngayHetHan = ngaySanXuat;
        }
    }

    public HANGTHUCPHAM() {
        this.maHang = "000";
        this.tenHang = "xxx";
        this.donGia = 0;
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = LocalDate.now();
    }

    public HANGTHUCPHAM(String maHang) throws Exception {
        setMaHang(maHang);
        this.tenHang = "xxx";
        this.donGia = 0;
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = this.ngaySanXuat;
    }

    public HANGTHUCPHAM(
            String maHang,
            String tenHang,
            double donGia,
            LocalDate ngaySanXuat,
            LocalDate ngayHetHan) throws Exception {
        setMaHang(maHang);
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    public boolean HetHan() {
        return ngayHetHan.isBefore(LocalDate.now());
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ghiChu = HetHan() ? "Hang Het Han" : "";
        return String.format("%-10s %-15s %-20s %-18s %-18s %-15s",
                maHang,tenHang,
                df.format(donGia) + " VND",
                dtf.format(ngaySanXuat),
                dtf.format(ngayHetHan),
                ghiChu);
    }
}

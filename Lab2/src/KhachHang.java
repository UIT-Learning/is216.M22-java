import java.util.Scanner;
public class KhachHang {
    protected int SoLuong;
    protected double DonGia, ThanhTien;
    protected String MaKH, NgayHD, HoTenKH;
    Scanner in =new Scanner(System.in);
    protected KhachHang()
    {
        this.MaKH="";
        this.DonGia=0;
        this.NgayHD="";
        this.HoTenKH="";
        this.SoLuong=0;
    }

    protected KhachHang(String ma, double dgia, String ngay, String hoten, int sl, double ttien)
    {
        this.MaKH=ma;
        this.DonGia=dgia;
        this.NgayHD=ngay;
        this.HoTenKH=hoten;
        this.SoLuong=sl;
        this.ThanhTien=ttien;
    }

    protected String getMaKH() {
        return MaKH;
    }
    protected void setMaKH(String maKH) {
        MaKH = maKH;
    }
    protected double getDonGia() {
        return DonGia;
    }
    protected void setDonGia(double donGia) {
        DonGia = donGia;
    }
    protected String getNgayHD() {
        return NgayHD;
    }
    protected void setNgayHD(String ngayHD) {
        NgayHD = ngayHD;
    }
    protected String getHoTenKH() {
        return HoTenKH;
    }
    protected void setHoTenKH(String hoTenKH) {
        HoTenKH = hoTenKH;
    }
    protected int getSoLuong() {
        return SoLuong;
    }
    protected void setSoLuong(int sl) {
        SoLuong = sl;
    }
    protected double getThanhTien() {
        return ThanhTien;
    }
    protected void setThanhTien(double thanhTien) {
        ThanhTien = thanhTien;
    }
    protected void nhap()
    {
        System.out.println("Nhap Ma Khach Hang: ");
        MaKH = in.nextLine();
        System.out.println("Ho va Ten Khach Hang: ");
        HoTenKH = in.next();
        System.out.println("Ngay Lap Hoa Don: ");
        NgayHD = in.next();
        System.out.println("So Luong(KW): ");
        SoLuong = in.nextInt();
        System.out.println("Don Gia: ");
        DonGia = in.nextDouble();
    }

    public String toString() {
        return "[MaKH: " + MaKH + ", HoTenKH: " + HoTenKH + ", NgayHD: " + NgayHD + ", DonGia: " + DonGia
                + ", SoLuong: " + SoLuong;
    }
}
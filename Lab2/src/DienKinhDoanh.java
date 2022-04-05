public class DienKinhDoanh extends KhachHang {
    public DienKinhDoanh() {}

    public DienKinhDoanh(String ma, double dgia, String ngay, String hoten, int sl, double ttien) {
        super(ma, dgia, ngay, hoten, sl, ttien);
    }

    public void nhap()
    {
        super.nhap();
    }

    public double TTien()
    {
        if(SoLuong >= 400)
            return this.ThanhTien = this.DonGia * this.SoLuong * 0.05;
        else
            return this.ThanhTien = this.DonGia * this.SoLuong;
    }
    public String toString()
    {
        return "Dien Kinh Doanh: " + super.toString()  + ", ThanhTien: " + ThanhTien;
    }
}

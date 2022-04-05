public class DienSinhHoat extends KhachHang {
    private double DinhMuc;
    public DienSinhHoat() {}

    public DienSinhHoat(String ma, double dgia, String ngay, String hoten, int sl, double ttien, double dinhmuc) {
        super(ma, dgia, ngay, hoten, sl, ttien);
        this.DinhMuc = dinhmuc;
    }

    public double getDinhMuc() {
        return DinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        DinhMuc = dinhMuc;
    }
    public void nhap()
    {
        super.nhap();
        System.out.println("Dinh Muc: ");
        DinhMuc = in.nextDouble();
    }
    public double TTien()
    {
        if(SoLuong<=DinhMuc)
            return this.ThanhTien = this.DonGia * this.SoLuong;
        else
            return this.ThanhTien = this.DinhMuc * this.DonGia + (this.SoLuong - this.DinhMuc) * this.DonGia * 2;
    }
    public String toString()
    {
        return "Dien Sinh Hoat: " + super.toString() + ", Dinh Muc: " + DinhMuc + ", ThanhTien: " + ThanhTien;
    }
}

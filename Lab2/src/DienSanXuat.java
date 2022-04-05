public class DienSanXuat extends KhachHang {
    private int LoaiDien;
    public DienSanXuat() {}

    public DienSanXuat(String ma, double dgia, String ngay, String hoten, int sl, double ttien, int ld) {
        super(ma, dgia, ngay, hoten, sl, ttien);
        this.LoaiDien = ld;
    }

    public double getLoaiDien() {
        return LoaiDien;
    }

    public void setLoaiDien(int ld) {
        LoaiDien = ld;
    }
    public void nhap()
    {
        super.nhap();
        System.out.println("Loai Dien(1: 2 pha / 2: 3 pha): ");
        LoaiDien = in.nextInt();
    }
    public double TTien()
    {
        if(LoaiDien == 1)
        {
            if(SoLuong > 200)
                return this.ThanhTien = this.DonGia * this.SoLuong * 0.98;
            else
                return this.ThanhTien = this.DonGia * this.SoLuong;
        }
        else
        {
            if(SoLuong > 150)
                return this.ThanhTien = this.DonGia * this.SoLuong * 0.97;
            else
                return this.ThanhTien = this.DonGia * this.SoLuong;
        }
    }
    public String toString()
    {
        return "Dien San Xuat: " + super.toString() + ", Loai Dien: " + (LoaiDien == 1? "2 pha": "3 pha") + ", ThanhTien: " + ThanhTien;
    }
}

import java.util.Scanner;

public class SachTieuThuyet extends Sach{
    private boolean tinhTrang;

    public SachTieuThuyet(){
    }

    public SachTieuThuyet(long ma,String ten, double dG, int sL, String nxb, boolean tTrang){
        super(ma, ten, dG, sL, nxb);
        tinhTrang = tTrang;
    }

    @Override
    public void NhapSach(){
        super.NhapSach();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tinh trang: ");
        tinhTrang = sc.nextBoolean();
    }

    @Override
    public void thongtinSach(){
        super.thongtinSach();

        System.out.println("Tinh trang: " + (tinhTrang ? "Moi" : "Cu"));
    }

    @Override
    public double thanhTien(){
        if (tinhTrang) {
            return donGia * soLuong;
        }
        else {
            return donGia * soLuong * 0.2;
        }
    }
}

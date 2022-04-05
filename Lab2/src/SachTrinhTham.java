import java.util.Scanner;

public class SachTrinhTham extends Sach {
    private float thue;

    public SachTrinhTham(){
    }

    public SachTrinhTham(long ma, String ten, double dG, int sL, String nxb, float th){
        super(ma, ten, dG, sL, nxb);

        thue=th;
    }

    @Override
    public void NhapSach(){
        super.NhapSach();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thue: ");
        thue = sc.nextFloat();
    }

    @Override
    public void thongtinSach(){
        super.thongtinSach();

        System.out.println("Thue: " + thue);
    }

    @Override
    public double thanhTien(){
        return donGia * soLuong + thue;
    }
}

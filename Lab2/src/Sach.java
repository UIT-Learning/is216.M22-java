import java.util.Scanner;

public class Sach {
    protected long maSach;
    protected String tenSach;
    protected double donGia;
    protected int soLuong;
    protected String nxb;

    public Sach() {
    }

    public Sach(long maSach, String tenSach, double donGia, int soLuong, String nxb) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nxb = nxb;
    }
    
    public void NhapSach() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLong();
        System.out.print("Nhap ten sach: ");
        tenSach = sc1.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.print("Nhap nha xuat ban: ");
        nxb = sc1.nextLine();
    }

    public void thongtinSach(){
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Don gia : " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Nha xuat ban: " + nxb);
    }

    public double thanhTien(){
        return donGia*soLuong;
    }
}

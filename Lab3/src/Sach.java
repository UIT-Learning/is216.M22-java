import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String nhaXuatBan;
    private double donGia;
    private int soLuong;
     
    public Sach() {
        super();
    }
 
    public Sach(String maSach, String tenSach, String nhaXuatBan, double donGia, int soLuong) {
        super();      
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
 
    public String getMaSach() {
        return maSach;
    }
 
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    
    public String getTenSach() {
        return tenSach;
    }
 
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
 
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
 
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
 
    public double getDonGia() {
        return donGia;
    }
 
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
 
    public int getSoLuong() {
        return soLuong;
    }
 
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
 
    public void nhapSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma Sach: ");
        maSach = sc.nextLine();
        System.out.print("Ten Sach: ");
        tenSach = sc.nextLine();
        System.out.print("NXB: ");
        nhaXuatBan = sc.nextLine();
        System.out.print("Don Gia: ");
        donGia = sc.nextDouble();
        System.out.print("So Luong: ");
        soLuong = sc.nextInt();
    }
     
    @Override
    public String toString() {
        return "Ma Sac: " + this.maSach + ", Ten Sach: " + this.tenSach + ", NXB: " + this.nhaXuatBan + ", Don Gia: " + this.donGia + ", So Luong: " + this.soLuong;
    }
}

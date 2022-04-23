import java.util.Scanner;

public class SachTrinhTham extends Sach{
    private double thue;
    public SachTrinhTham() {
        super();
    }
 
    public SachTrinhTham(double thue) {
        super();
        this.thue = thue;
    }
 
    public double getThue() {
        return thue;
    }
 
    public void setThue(double thue) {
        this.thue = thue;
    }
 
    public void nhapSach() {
        Scanner sc = new Scanner(System.in);
        super.nhapSach();
        System.out.print("Thue: ");
        thue = sc.nextDouble();
        // sc.close();
    }
     
    @Override
    public String toString() {
        return super.toString() + ", Thue: " + this.thue;
    }
    
     public double thanhTien(){
        return super.getSoLuong() * super.getDonGia() + this.thue;
    }
}

import java.util.Scanner;

public class SachTieuThuyet extends Sach{
   private String tinhTrang;
    private int number;
 
    public SachTieuThuyet() {
        super();
    }
 
    public SachTieuThuyet(String tinhTrang, int number) {
        super();
        this.tinhTrang = tinhTrang;
        this.number = number;
    }
 
 
    public String getTinhTrang() {
        return tinhTrang;
    }
 
 
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
 
 
    public int getNumber() {
        return number;
    }
 
 
    public void setNumber(int number) {
        this.number = number;
    }
 
    public String tinhTrangSach(int x) {
        switch (number) {
            case 0:
                tinhTrang = "Cu";
                break;
            case 1:
                tinhTrang = "Moi";
                break;
            default:
                break;
        }
        return tinhTrang;
    }
     
    public void nhapSach() {
        Scanner sc = new Scanner(System.in);
        super.nhapSach();
        System.out.print("Tinh trang (0 - Cu/ 1 - Moi): ");
        number = sc.nextInt();
        // sc.close();
    }
     
    public String toString() {
        return super.toString() + ", Tinh trang: " + this.tinhTrangSach(number);
    }
    
    public double thanhTien(){
        if(this.getNumber() == 1){
            return super.getSoLuong() * super.getDonGia();
        }else if(this.getNumber() == 0){
            return super.getSoLuong() * super.getDonGia() * 0.2;
        }
        return 0;
    }
   
}

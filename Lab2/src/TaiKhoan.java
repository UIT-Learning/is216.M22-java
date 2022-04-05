public class TaiKhoan {
    private long soTK;
    private String tenTK;
    private double soTien;

    public TaiKhoan() {
    }

    public TaiKhoan(long soTK, String tenTK, double soTien){
        this.soTK =soTK;
        this.tenTK =tenTK;
        this.soTien =soTien;
    }

    public void inTaiKhoan(){
        System.out.println("- STK: " + soTK);
        System.out.println("- Ten TK: " + tenTK);
        System.out.println("- So  tien hien co trong TK: " + soTien);
    }

    public boolean napTien(double st){
        if (st < 0)
        {
            return false;
        }

        soTien = soTien + st;
        return true;
    }

    public boolean chuyenKhoan(TaiKhoan a, double st){
        if (this != a || this.soTien<=st){
            return false;
        }

        soTien = soTien - st;
        return a.napTien(st);
    }
}

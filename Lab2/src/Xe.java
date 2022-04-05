public class Xe {
    private String tenChuXe;
    private String loaiXe;
    private int triGiaXe;
    private int dungTichXylanh;

    public Xe(String tenChuXe, String loaiXe, int triGiaXe, int dungTichXylanh) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.triGiaXe = triGiaXe;
        this.dungTichXylanh = dungTichXylanh;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getTriGiaXe() {
        return triGiaXe;
    }

    public void setTriGiaXe(int triGiaXe) {
        this.triGiaXe = triGiaXe;
    }

    public int getDungTichXylanh() {
        return dungTichXylanh;
    }

    public void setDungTichXylanh(int dungTichXylanh) {
        this.dungTichXylanh = dungTichXylanh;
    }

    public double getTienThue() {
        if (dungTichXylanh < 100) {
            return triGiaXe * 0.01;
        } else if (dungTichXylanh >= 100 & dungTichXylanh <= 175) {
            return triGiaXe * 0.03;
        }

        return triGiaXe * 0.05;
    }

    @Override
    public String toString() {
        return String.format("%-15s|%-15s|%-15d|%-15d|%-15.2f", tenChuXe, loaiXe, triGiaXe, dungTichXylanh, getTienThue());
    }
}

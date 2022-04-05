public class HinhChuNhat {
    private float cDai;
    private float cRong;

    public float getcDai() {
        return cDai;
    }

    public void setcDai(float cDai) {
        this.cDai = cDai;
    }

    public float getcRong() {
        return cRong;
    }

    public void setcRong(float cRong) {
        this.cRong = cRong;
    }

    public float DienTich(){
        return cDai*cRong;
    }

    public float ChuVi(){
        return (cDai+cRong)*2;
    }

    @Override
    public String toString() {
        return "Chieu dai: " + cDai + "\n" + "Chieu rong: " + cRong + "\n" + "Dien tich: " + DienTich() + "\n" + "Chu vi: " + ChuVi();
    }
}

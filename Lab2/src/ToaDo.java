import java.util.Scanner;

public class ToaDo {
    private int x;
    private int y;

    public ToaDo() {
    }
    public ToaDo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void NhapToaDo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap toa do x: ");
        x = sc.nextInt();
        System.out.print("Nhap toa do y: ");
        y = sc.nextInt();
    }
    
    public double distanceTo(ToaDo that) {
        double xPow2 = Math.pow((this.x - that.x), 2);
        double yPow2 = Math.pow((this.y - that.y), 2);
        return Math.sqrt(xPow2 + yPow2);
    }
}

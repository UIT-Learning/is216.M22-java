import java.util.ArrayList;

public class TaoBo52QB {
    // Lớp tạo bộ bài 52 quân bài không trùng nhau
    // Các thuộc tính: cơ, rô, chuồn, bích
    public int number;
    public int co;
    public int ro;
    public int chuon;
    public int bich;

    public TaoBo52QB(int number, int co, int ro, int chuon, int bich) {
        this.number = number;
        this.co = co;
        this.ro = ro;
        this.chuon = chuon;
        this.bich = bich;
    }

    // tạo list 52 lá bài không trùng nhau
    public static ArrayList<TaoBo52QB> taoBo52QuanBai() {
        ArrayList<TaoBo52QB> list = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            list.add(new TaoBo52QB(i, 1, 0, 0, 0));
        }
        for (int i = 1; i <= 13; i++) {
            list.add(new TaoBo52QB(i, 0, 1, 0, 0));
        }
        for (int i = 1; i <= 13; i++) {
            list.add(new TaoBo52QB(i, 0, 0, 1, 0));
        }
        for (int i = 1; i <= 13; i++) {
            list.add(new TaoBo52QB(i, 0, 0, 0, 1));
        }
        return list;
    }
}
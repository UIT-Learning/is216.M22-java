import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaiTapThucHanh3_19522208 {
    public static void main(String[] args) throws Exception {
        // Menu từ câu 1 đen câu 5
        int choice = 0;
        while (choice != 6) {
            System.out.println("------------------------------------------------------");
            System.out.println("1. Cau 1");
            System.out.println("2. Cau 2");
            System.out.println("3. Cau 3");
            System.out.println("4. Cau 4");
            System.out.println("5. Cau 5");
            System.out.println("6. Thoat");
            System.out.print("Nhap lua chon: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            // sc.close();
            switch (choice) {
                case 1:
                    Cau1();
                    break;
                case 2:
                    Cau2();
                    break;
                case 3:
                    Cau3();
                    break;
                case 4:
                    Cau4();
                    break;
                case 5:
                    Cau5();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Nhap sai, moi nhap lai");
                    break;
            }
            
        }
    }

    public static void Cau1() {
        ArrayList<SachTieuThuyet> sachtieuthuyet = new ArrayList<>();
        ArrayList<SachTrinhTham> sachtrinhtham = new ArrayList<>();
        int soSachTieuThuyet, soSachTrinhTham;
        double tienSachTieuThuyet = 0, tienSachTrinhTham = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sach tieu thuyet: ");
        soSachTieuThuyet = sc.nextInt();
        System.out.print("Nhap so sach trinh tham: ");
        soSachTrinhTham = sc.nextInt();
    
        System.out.println("Nhap thong tin sach tieu thuyet:");
        for (int i = 0; i < soSachTieuThuyet; i++) {
            System.out.println("Nhap thong tin sach thu " + (i + 1) + ":");
            SachTieuThuyet sachTieuThuyet = new SachTieuThuyet();
            sachTieuThuyet.nhapSach();
            sachtieuthuyet.add(sachTieuThuyet);
        }
         
        System.out.println("Nhap thong tin sach trinh tham:");
        for (int i = 0; i < soSachTrinhTham; i++) {
            System.out.println("Nhap thong tin sach thu " + (i + 1) + ":");
            SachTrinhTham sachTrinhtham = new SachTrinhTham();
            sachTrinhtham.nhapSach();
            sachtrinhtham.add(sachTrinhtham);
        }
               
        System.out.println("-----Thông tin sach tieu thuyet-----");
        for (int i = 0; i < sachtieuthuyet.size(); i++) {
            System.out.println(sachtieuthuyet.get(i).toString());
            tienSachTieuThuyet = sachtieuthuyet.get(i).thanhTien();
            System.out.println("Thanh tien sach tieu thuyet thu " + (i + 1) + ": " + tienSachTieuThuyet);           
        }
         
        System.out.println("-----Thong tin sach trinh tham-----");
        for (int i = 0; i < sachtrinhtham.size(); i++) {
            System.out.println(sachtrinhtham.get(i).toString());
            tienSachTrinhTham = sachtrinhtham.get(i).thanhTien();
            System.out.println("Thanh tien sach tieu thuyet thu " + (i + 1) + ": " + tienSachTrinhTham);
        }
        // sc.close();
    }

    public static void Cau2() {
        ArrayList<Double> array = new ArrayList<>();
        array.add(10.0);
        array.add(20.0);
        array.add(30.0);
        array.add(40.0);
        double average = Avegare.tinhTB(array); 
        System.out.println("Trung binh = " + average);
    }

    public static void Cau3() {
        Scanner sc = new Scanner(System.in);
        int[] soNguyen = new int[5];
        int so;
        int i = 0;
        try {
            while (true) {
                System.out.println("Nhap so nguyen: ");
                String nhap = sc.nextLine();
                if (nhap == "") {
                    break;
                } else {
                    so = Integer.valueOf(nhap);
                }
                soNguyen[i] = so;
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Ban da nhap qua so luong phan tu!");
            return;
        }
        System.out.println("Mang vua nhap");
        for (int j = 0; j < soNguyen.length; j++) {
            System.out.println(soNguyen[j]);
        }
    }

    public static void Cau4() {
        String[] name = new String[]{"Nguyen", "Huu", "Thang"};
        ArrayGeneric<String> arraygeneric = new ArrayGeneric<String>(name);
        System.out.println("First name: " + arraygeneric.FirstName());
        System.out.println("Last name: " + arraygeneric.LastName());
    }
    
    public static void Cau5()
    {
        ArrayList<TaoBo52QB> list = new ArrayList<>();
        list = TaoBo52QB.taoBo52QuanBai();
        Collections.shuffle(list);
        // Xuất list
        MoTaQB.ChiaBai4Nhom(list);
    }
}

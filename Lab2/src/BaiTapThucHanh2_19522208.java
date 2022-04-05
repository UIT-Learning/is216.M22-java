import java.util.ArrayList;
import java.util.Scanner;

public class BaiTapThucHanh2_19522208 {
    public static void main(String[] args) {
        //Menu câu 1 đến câu 7
        System.out.println("1. Cau 1. Tai Khoan.");
        System.out.println("2. Cau 2. Sach.");
        System.out.println("3. Cau 3. Toa Do.");
        System.out.println("4. Cau 4. Hinh Chu Nhat.");
        System.out.println("5. Cau 5. Sinh Vien.");
        System.out.println("6. Cau 6. Xe.");
        System.out.println("7. Cau 7.");
        System.out.println("8. Thoat.");
        System.out.println("Nhap vao so cau can thuc hien: ");
        Scanner sc = new Scanner(System.in);
        int cau = sc.nextInt();
        switch (cau) {
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
                Cau6();
                break;
            case 7:
                Cau7();
                break;
            case 8:
                System.out.println("Thoat.");
                break;
            default:
                System.out.println("Nhap sai.");
                break;
        }
    }
    // Cau 1:
    public static void Cau1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai khoan: ");
        long soTK = sc.nextLong();
        System.out.println("Nhap ten tai khoan: ");
        String tenTK = sc.next();
        System.out.println("Nhap so tien hien co: ");
        double soTien = sc.nextDouble();
        TaiKhoan tk = new TaiKhoan(soTK, tenTK, soTien);
        tk.inTaiKhoan();
        double st;
        System.out.println("Nhap so tien nap vao: ");
        st = sc.nextDouble();
        tk.napTien(st);
        tk.inTaiKhoan();
        TaiKhoan tk2 = new TaiKhoan(333, "TK2", 0);
        double st2;
        System.out.println("Nhap so tien chuyen khoan sang TK2: ");
        st2 = sc.nextDouble();
        tk.chuyenKhoan(tk2, st2);
        tk.inTaiKhoan();
        tk2.inTaiKhoan();
    }
    // Cau 2:
    public static void Cau2() {
        SachTieuThuyet s2 = new SachTieuThuyet();
        SachTrinhTham s1 = new SachTrinhTham();
        s1.NhapSach();
        s2.NhapSach();
        System.out.println("Thong tin sach 1: ");
        s1.thongtinSach();
        System.out.println("Thong tin sach 2: ");
        s2.thongtinSach();
        System.out.println("Thanh tien sach 1: " + s1.thanhTien());
        System.out.println("Thanh tien sach 2: " + s2.thanhTien());
    }
    // Cau 3:
    public static void Cau3() {
        ToaDo t1 = new ToaDo();
        ToaDo t2 = new ToaDo();
        System.out.println("Nhap toa do 1: ");
        t1.NhapToaDo();
        System.out.println("Nhap toa do 2: ");
        t2.NhapToaDo();
        System.out.println("Khoang cach giua 2 toa do: " + t1.distanceTo(t2));
    }
    // Cau 4:
    public static void Cau4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        float cDai = sc.nextFloat();

        System.out.print("Nhap chieu rong: ");
        float cRong = sc.nextFloat();

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.setcDai(cDai);
        hcn.setcRong(cRong);
        System.out.print(hcn.toString());
    }
    // Cau 5:
    public static void Cau5() {
        SinhVien sv1 = nhapSinhVien();
        SinhVien sv2 = nhapSinhVien();
        SinhVien sv3 = nhapSinhVien();

        inSinhVien(sv1, sv2, sv3);
    }

    private static void inSinhVien(SinhVien... dssv) {
        System.out.println(String.format("%-10s|%-10s|%-10s|%-10s|%-10s", "Ma", "Ho ten", "Diem LT", "Diem TH", "Diem TB"));
        for (SinhVien sv : dssv) {
            System.out.println(sv.toString());
        }
    }

    private static SinhVien nhapSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap sinh vien: ");
        System.out.print("Ma: ");
        int ma = sc.nextInt();
        sc.nextLine();
        System.out.print("Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Diem LT: ");
        float diemLT = sc.nextFloat();
        System.out.print("Diem TH: ");
        float diemTH = sc.nextFloat();
        return new SinhVien(ma, hoTen, diemLT, diemTH);
    }
    // Cau 6:
    public static void Cau6() {
        ArrayList<Xe> dsXe = nhapXe();
        xuatXe(dsXe);
        timXe(dsXe);
    }

    private static void xuatXe(ArrayList<Xe> dsXe) {
        System.out.println(String.format("%-15s|%-15s|%-15s|%-15s|%-15s",
                "Ten chu xe", "Loai xe", "Tri gia xe", "DT Xylanh", "Tien thue"));
        for (Xe xe : dsXe) {
            System.out.println(xe.toString());
        }
    }

    private static ArrayList<Xe> nhapXe() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        ArrayList<Xe> dsXe = new ArrayList<Xe>();
        do {
            System.out.println("Nhap xe: ");
            System.out.print("Ten chu xe: ");
            String tenChuXe = sc1.nextLine();
            if(tenChuXe == "") {
                break;
            }
            System.out.print("Loai xe: ");
            String loaiXe = sc1.nextLine();
            System.out.print("Tri gia xe: ");
            int triGiaXe = sc.nextInt();
            System.out.print("Dung tich xy lanh: ");
            int dungTichXylanh = sc.nextInt();

            Xe xe = new Xe(tenChuXe, loaiXe, triGiaXe, dungTichXylanh);
            dsXe.add(xe);
        }
        while (true);

        return dsXe;
    }

    private static void timXe(ArrayList<Xe> dsXe) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin tim kiem: ");
        System.out.print("Ten chu xe: ");
        String tenChuXe = sc.nextLine();

        System.out.print("Loai xe: ");
        String loaiXe = sc.nextLine();

        for (Xe xe : dsXe) {
            if (xe.getTenChuXe().equals(tenChuXe)
                    && xe.getLoaiXe().equals(loaiXe)) {
                System.out.println("Tien thue: " + xe.getTienThue());
                return;
            }
        }

        System.out.println("Khong tim thay xe");
    }
    // Cau 7:
    public static void Cau7() {
        ArrayList<KhachHang> khachhang = new ArrayList<KhachHang>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập lựa chọn(1. Điện sinh hoạt || 2. Điện kinh doanh || 3. Điện sản xuất): ");
            int Type = sc.nextInt();
            if (Type == 1) {
                DienSinhHoat DSH = new DienSinhHoat();
                DSH.nhap();
                if (DSH.MaKH == "") {
                    break;
                }
                khachhang.add(DSH);
            } else if (Type == 2) {
                DienKinhDoanh DKD = new DienKinhDoanh();
                DKD.nhap();
                if (DKD.MaKH == "") {
                    break;
                }
                khachhang.add(DKD);
            } else {
                DienSanXuat DSX = new DienSanXuat();
                DSX.nhap();
                if (DSX.MaKH == "") {
                    break;
                }
                khachhang.add(DSX);
            }
        }
        for(KhachHang kh : khachhang)
        {
            System.out.println(kh.toString());
        }
        // Xuat hoa don khach hang trong Thang / Nam
        int Nam, Thang;
        System.out.println("Thang: ");
        Thang = sc.nextInt();
        System.out.println("Nam: ");
        Nam = sc.nextInt();
        System.out.println("Khach hang co hoa don vao: " + Thang + "/" + Nam + ": ");
        // dd/mm/yyyy
        for (KhachHang KH : khachhang) {
            if (Integer.parseInt(KH.NgayHD.substring(3, 5)) == Thang
                    && Integer.parseInt(KH.NgayHD.substring(6, 10)) > Nam) {
                System.out.println(KH.toString());
            }
        }
    }
}
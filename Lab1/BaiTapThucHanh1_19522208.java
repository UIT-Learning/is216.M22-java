import java.util.Scanner;

public class BaiTapThucHanh1_19522208 {

    // Câu 1:
    private static int radius;

    public static void NhapBanKinh(){
        System.out.print("Enter the number: ");
        do {
            Scanner sc = new Scanner(System.in);
            radius = sc.nextInt();
            if (radius < 0) {
                System.out.print("Enter the number again: ");
            }
        } while (radius < 0);
    }

    public static void XuatChuVi() {
        System.out.println("The perimeter of this Radius: " + radius * Math.PI);
    }

    public static void XuatDienTich() {
        System.out.println("The area of this Radius: " + radius * radius * Math.PI);
    }
    // Câu 2:
    private static String _strX;
    private static String _strY;

    public static String Nhap1Chuoi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String Chuoine = sc.nextLine();
        return Chuoine;
    }

    public static void Nhap2Chuoi() {
        System.out.println("Chuoi x: ");
        _strX = Nhap1Chuoi();
        System.out.println("Chuoi y: ");
        _strY = Nhap1Chuoi();
    }

    public static void Xuat2Chuoi() {
        System.out.println("Chieu dai x: "+ _strX.length());
        System.out.println("3 ki tu dau chuoi x: "+ _strX.substring(0,3));
        System.out.println("3 ki tu cuoi chuoi x: "+ _strX.substring(Math.max(0, _strX.length() - 3)));

        if (_strX.length()>=6){
            System.out.println("Ki tu thu 6 chuoi x: "+ _strX.charAt(5));
        }
        else{
            System.out.println("Do dai chuoi ngan hon 6 ki tu !");
        }
        String first3OfX = _strX.substring(0,3);
        String last3OfY = _strY.substring(Math.max(0, _strY.length() - 3));
        System.out.println("Chuoi noi: "+ first3OfX.concat(last3OfY));

        if (_strX.equals(_strY)){
            System.out.println("2 chuoi bang nhau <phan biet>");
        }
        else{
            System.out.println("2 chuoi khong bang nhau <phan biet>");
        }

        if (_strX.equalsIgnoreCase(_strY)){
            System.out.println("2 chuoi bang nhau <khong phan biet>");
        }
        else{
            System.out.println("2 chuoi khong bang nhau <khong phan biet>");
        }

        if (_strX.indexOf(_strY)==-1){
            System.out.println("Chuoi y khong nam trong chuoi x");
        }
        else{
            System.out.println("Chuoi y nam trong chuoi x, xuat hien tai vi tri thu: " + _strX.indexOf(_strY));
        }

        int index = 0;
        while (index != -1)
        {
            index = _strX.indexOf(_strY, index + 1);
            if (index != -1)
            {
                System.out.println("Chuoi y xuat hien trong chuoi x o vi tri thu: " + Integer.toString(index));
            }
        }
    }
    // Câu 3:
    private static float number;
    public static void Input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the power number: ");
        number = sc.nextInt();
    }

    public static void Output() {
        float money = CalculateMoney();
        System.out.println("Tien dien phai tra: "+ CalculateMoney());
    }

    private static float CalculateMoney(){
        if(number<=50){
            return (number*2000);
        }
        else if((number>50)&&(number<=100)){
            return ((50*2000)+((number-50)*2500));
        }
        else{
            return ((50*2000)+((number-50)*3500));
        }
    }
    // Câu 4:
    private static int _number;

    public static void InputPytago() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        _number = sc.nextInt();
    }

    public static void OutputPytago() {
        for (int i=1; i<=_number; i++){
            for(int j=1; j<=_number; j++){
                System.out.print(i*j + "\t");
                if (j == _number) {
                    System.out.println();
                }
            }
        }
    }
    // Câu 5:
    private static int a;
    private static int b;
    
    private static int USCLN(int a, int b) {
        if (b == 0)
            return a;
        return USCLN(b, a % b);
    }
    public static void InputUSCLN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        a = sc.nextInt();
        System.out.print("Enter the number 2: ");
        b = sc.nextInt();
    }
    public static void OutputUSCLN() {
        if (a == 0 && b == 0) {
            System.out.println("Khong co so nao la UCLN cua 2 so nay!");
        } else if (a == 0 && b != 0) {
            System.out.println("USCLN cua " + a + " va " + b + " la: " + b);
        } else if (b == 0 && a != 0) {
            System.out.println("USCLN cua " + a + " va " + b + " la: " + a);
        } else {
            System.out.println("USCLN cua " + a + " va " + b + " la: " + USCLN(a, b));
        }
    }
    // Câu 6:
    private static int _number1;

    public static void InputUS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        _number1 = sc.nextInt();
    }
    public static void OutputUS() {
        System.out.println("Cac uoc so cua " + _number1 + " la: ");
        for(int i = 1; i <= _number1; i++) {
            if( _number1 % i == 0) {
                System.out.println(i);
            }
        }
    }
    // Câu 7: Bài 2 phần V
    public static int InputMT() {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            try {
                n = sc.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so! hay nhap lai...");
                sc.nextLine();
            }
        }
        return (n);
    }
    public static void OutputMT(int[][] A, int n, int m){
        int i,j;
        for (i = 0; i < n; i++) {
            System.out.print("\n");
            for (j = 0; j < m; j++)
                System.out.print(" " + A[i][j]);
        }
        System.out.print("\n");
    }

    public static int FindMaxMT(int[][] A, int n, int m) {
        int Max = A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (Max < A[i][j])
                    Max = A[i][j];
            }
        }
        return (Max);
    }

    public static void Element_Index(int[][] A, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == FindMaxMT(A, n, m))
                    System.out.println("\nPhan tu " + A[i][j] + " o hang " + i + " cot " + j + " lon nhat");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void ElementIsPrime(int[][] A, int n, int m) {
        System.out.println("\nCac phan tu nguyen to trong ma tran la: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isPrime(A[i][j]) == true)
                    System.out.println("\nA[" + i + "][" + j + "] = " + A[i][j]);
            }
        }
    }

    public static void SortMT(int[][] A, int n, int m) {
        int i, j, tmp;
        for (j = 0; j < m; j++) {
            for (i = 0; i < n - 1; i++) {
                if (A[i][j] > A[i + 1][j]) {
                    tmp = A[i][j];
                    A[i][j] = A[i + 1][j];
                    A[i + 1][j] = tmp;
                }
            }
        }
    }
    // Câu 8: Trong hàm Main
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        while (true) {
            System.out.println("------------------");
            System.out.println("Menu");
            System.out.println("1. Câu 1");
            System.out.println("2. Câu 2");
            System.out.println("3. Câu 3");
            System.out.println("4. Câu 4");
            System.out.println("5. Câu 5");
            System.out.println("6. Câu 6");
            System.out.println("7. Câu 7");
            System.out.println("8. Thoát");
            System.out.println("------------------");

            int selection = sc.nextInt();

            switch (selection) {
                case 1: {
                    NhapBanKinh();
                    XuatChuVi();
                    XuatDienTich();
                    break;
                }
                case 2: {
                    Nhap2Chuoi();
                    Xuat2Chuoi();
                    break;
                }
                case 3: {
                    Input();
                    Output();
                    break;
                }
                case 4: {
                    InputPytago();
                    OutputPytago();
                    break;
                }
                case 5: {
                    InputUSCLN();
                    OutputUSCLN();
                    break;
                }
                case 6: {
                    InputUS();
                    OutputUS();
                    break;
                }
                case 7: {
                    System.out.print("Nhap so hang n=");
                    int n= InputMT();
                    System.out.print("Nhap so cot m=");
                    int m= InputMT();
                    int [][] A= new int[n][m];
                    int i,j;
                    for(i=0 ; i<n ; i++){
                        for(j=0 ; j<m ; j++){
                            System.out.println("Nhap phan tu thu A["+(i+1)+"]["+(j+1)+"]= ");
                            A[i][j]= InputMT();
                        }
                    }
                    //In ra ma tran nhap vao
                    System.out.println("Ma tran nhap vao: ");
                    OutputMT(A, n, m);
                    //Tim phan tu max
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < m; j++) {
                            if (A[i][j] == FindMaxMT(A, n, m))
                                System.out.println("\nPhan tu lon nhat mang: " + A[i][j]);
                        }
                    }
                    //Tim vi tri cua phan tu max
                    Element_Index(A, n, m);
                    //Tim cac phan tu nguyen to trong ma tran
                    ElementIsPrime(A, n, m);
                    //Sap xep ma tran
                    SortMT(A, m, n);
                    //In ra ma tran sau khi sap xep
                    OutputMT(A, n, m);
                    break;
                }
                default:
                    System.out.println("Kết thúc");
                    System.exit(0);
            }
        }
    }
}

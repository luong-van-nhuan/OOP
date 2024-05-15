import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String tenSV;
    private String msSV;
    private String ngayThangNam;
    private List<BangDiemMonHoc> bangDiem;
    private int n;

    public Student(List<BangDiemMonHoc> bangDiem, String msSV, int n, String ngayThangNam, String tenSV) {
        this.bangDiem = bangDiem;
        this.msSV = msSV;
        this.n = n;
        this.ngayThangNam = ngayThangNam;
        this.tenSV = tenSV;
    }

    public Student() {
        bangDiem = new ArrayList<>();
    }

    public List<BangDiemMonHoc> getBangDiem() {
        return bangDiem;
    }

    public void setBangDiem(List<BangDiemMonHoc> bangDiem) {
        this.bangDiem = bangDiem;
    }

    public String getMsSV() {
        return msSV;
    }

    public void setMsSV(String msSV) {
        this.msSV = msSV;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getNgayThangNam() {
        return ngayThangNam;
    }

    public void setNgayThangNam(String ngayThangNam) {
        this.ngayThangNam = ngayThangNam;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        tenSV = sc.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        msSV = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        ngayThangNam = sc.nextLine();
        System.out.println("Nhập số lượng môn học: ");
        n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            BangDiemMonHoc d = new BangDiemMonHoc();
            d.nhap();
            bangDiem.add(d);
        }
    }
    public void xuat(){
        System.out.println("Thông tin của sinh viên");
        System.out.println("Tên sinh viên: " + tenSV);
        System.out.println("Mã sinh viên: " + msSV);
        System.out.println("Ngày tháng năm: " + ngayThangNam);
        System.out.println("Bảng điểm trung bình");
        BangDiemMonHoc.title();
        for(int i = 0; i < bangDiem.size(); i++){
            bangDiem.get(i).xuat();

        }
    }
    public double diemTB(){
        int total = 0;
        for(BangDiemMonHoc bd : bangDiem){
            total += bd.getDiemSo();
        }
        return bangDiem.size() >0 ? total / bangDiem.size() : 0;
    }
}

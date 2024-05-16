import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String tenSV;
    private String maSV;
    private String ngayThangNam;
    private List<Subject> subjects;
    private int n;

    public Student(String maSV, int n, String ngayThangNam, List<Subject> subjects, String tenSV) {
        this.maSV = maSV;
        this.n = n;
        this.ngayThangNam = ngayThangNam;
        this.subjects = subjects;
        this.tenSV = tenSV;
    }

    public Student() {
        subjects = new ArrayList<>();
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
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

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
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
        maSV = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        ngayThangNam = sc.nextLine();
        System.out.println("Nhập số lượng môn học: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            Subject subject = new Subject();
            subject.nhap();
            subjects.add(subject);
        }
    }

    public void xuat() {
        System.out.println("Thông tin của sinh viên");
        System.out.println("Tên sinh viên: " + tenSV);
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Điểm trung bình: " + diemTB());
    }

    public double diemTB() {
        double total;
        int sum = 0;
        for (Subject subject : subjects) {
            sum += subject.getDiemSo();
        }
        total = (double) sum / n;
        BigDecimal bd = new BigDecimal(total);
        bd = bd.setScale(2, RoundingMode.HALF_UP.HALF_UP);
        return bd.doubleValue();
    }
}

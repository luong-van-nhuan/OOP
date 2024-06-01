import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String tenSV;
    private String maSV;
    private String ngayThangNam;
    private ArrayList<Subject> subjects;

    public Student(String tenSV, String maSV, String ngayThangNam) {
        this.tenSV = tenSV;
        this.maSV = maSV;
        this.ngayThangNam = ngayThangNam;
    }

    public Student() {
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNgayThangNam() {
        return ngayThangNam;
    }

    public void setNgayThangNam(String ngayThangNam) {
        this.ngayThangNam = ngayThangNam;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        tenSV = sc.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        maSV = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        ngayThangNam = sc.nextLine();
    }
    public void danhSachMonHoc(Subject sb){
        this.subjects.add(sb);
    }
    public void themDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String tenSV = sc.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        String maSV = sc.nextLine();
        Subject subject = new Subject();
        if(getTenSV().equals(tenSV) && getMaSV().equals(maSV)){
            subject.nhap();
            subjects.add(subject);
        }

    }

}

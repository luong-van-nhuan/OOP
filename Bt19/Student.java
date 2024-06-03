import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String tenSV;
    private String maSV;
    private String ngayThangNam;
    private ArrayList<Subject> subjects;

    public Student(String tenSV, String maSV, String ngayThangNam, ArrayList<Subject> subjects) {
        this.tenSV = tenSV;
        this.maSV = maSV;
        this.ngayThangNam = ngayThangNam;
        this.subjects = subjects;
    }

    public Student() {
        this.subjects = new ArrayList<>();
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
    public void xuat(){
        System.out.println("Tên sinh viên: " + tenSV);
        System.out.println("Mã sinh viên: " + maSV);
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
    public double tinhDiemTB(){
        if(subjects.isEmpty()){
            System.out.println("Danh sách rỗng");
            return 0;
        }else {
            double sum = 0;
            for (Subject subject : subjects) {
                sum += subject.getDiemSo();
            }
            return sum / subjects.size();
        }
    }

}

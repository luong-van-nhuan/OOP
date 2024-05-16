
import java.util.Scanner;

public class Subject {
    private String tenMH;
    private String maMH;
    private float diemSo;

    public Subject(float diemSo, String maMH, String tenMH) {
        this.diemSo = diemSo;
        this.maMH = maMH;
        this.tenMH = tenMH;
    }

    public Subject() {
    }

    public float getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(float diemSo) {
        this.diemSo = diemSo;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên môn học: ");
        tenMH = sc.nextLine();
        System.out.println("Nhập mã môn học: ");
        maMH = sc.nextLine();
        System.out.println("Nhập điểm số: ");
        diemSo = sc.nextFloat();
        sc.nextLine();
    }

}

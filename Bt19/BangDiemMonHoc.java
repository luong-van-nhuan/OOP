
import java.util.Scanner;

public class BangDiemMonHoc {
    private String tenMH;
    private String maMH;
    private float diemSo;

    public BangDiemMonHoc(float diemSo, String maMH, String tenMH) {
        this.diemSo = diemSo;
        this.maMH = maMH;
        this.tenMH = tenMH;
    }

    public BangDiemMonHoc() {
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

    public static void title() {
        String line = String.format("%-20s%-20s%-20s", "Tên môn học", "Mã môn học", "Điểm số");
        System.out.println(line);
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
    public void xuat() {
        String line = String.format("%-20s%-20s%-20s", tenMH, maMH, diemSo + "");
        System.out.println(line);
    }

}

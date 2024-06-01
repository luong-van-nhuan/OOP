import java.util.Scanner;

public class Subject {
    private String tenMonHoc;
    private String maMonHoc;
    private double diemSo;

    public Subject(String tenMonHoc, String maMonHoc, double diemSo) {
        this.tenMonHoc = tenMonHoc;
        this.maMonHoc = maMonHoc;
        this.diemSo = diemSo;
    }

    public Subject() {

    }

    public double getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(double diemSo) {
        this.diemSo = diemSo;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên môn học: ");
        tenMonHoc = sc.nextLine();
        System.out.println("Nhập mã môn học: ");
        maMonHoc = sc.nextLine();
        System.out.println("Nhập điểm số: ");
        diemSo = sc.nextDouble();
        sc.nextLine();
    }
}

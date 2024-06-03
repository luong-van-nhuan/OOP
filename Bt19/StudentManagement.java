import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManagement {
    public static Scanner sc = new Scanner(System.in);
    private ArrayList<Student> students;
    private ArrayList<Subject> subjects;

    public StudentManagement(ArrayList<Student> students) {
        this.students = students;
    }

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    public void themSinhVien() {
        Student student = new Student();
        student.nhap();
        this.students.add(student);
    }

    public void themDiem() {
        boolean tim = false;
        System.out.println("Nhập mã sinh viên: ");
        String maSV = sc.nextLine();
        Subject sb = new Subject();
        for (int i = 0; i < students.size(); i++) {
            if (students.isEmpty()) {
                System.out.println("Danh sách rỗng");
            }
            if (students.get(i).getTenSV().equals(maSV)) {
                sb.nhap();
                students.get(i).danhSachMonHoc(sb);
                tim = true;
            }
            if (!tim) {
                System.out.println("Không tìm thấy sinh viên");
            }
        }
    }

    public void diemTB() {
        System.out.println("Nhập mã sinh viên: ");
        String maSV = sc.nextLine();
        boolean tim = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMaSV().equals(maSV)) {
                Student student = students.get(i);
                System.out.println("Sinh viên mã: " + maSV);
                System.out.println("Điểm trung bình: " + student.tinhDiemTB());
                tim = true;
            }
            if (!tim) {
                System.out.println("Không tìm thấy sinh");
            }
        }
    }

    public void timSV() {
        System.out.println("Nhập tên sinh viên: ");
        String tenSV = sc.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        String maSV = sc.nextLine();
        for (Student student : students) {
            if (student.getTenSV().equals(tenSV) && student.getMaSV().equals(maSV)) {
                System.out.println("Thông tin sinh viên");
                student.xuat();
                System.out.println("Điểm trung bình: " + student.tinhDiemTB());

            } else {
                System.out.println("Không tìm thấy sinh viên");
            }
        }
    }

    public void sapXepTangDanTheoTenGiamDanTheoDiem() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int xepTheoTen = o1.getTenSV().compareTo(o2.getTenSV());
                if (o1.getTenSV().equals(o2.getTenSV())) {
                    if (o2.tinhDiemTB() - o1.tinhDiemTB() > 0) {
                        return 1;
                    } else if (o2.tinhDiemTB() - o1.tinhDiemTB() < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
                return xepTheoTen;
            }
        });
    }
}

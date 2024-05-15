import java.util.*;

public class RunMain {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        List<BangDiemMonHoc> bangDiem = new ArrayList<>();
        Student student = new Student();
        StudentManagement studentManagement = new StudentManagement();
        int chon = 0;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Thêm điểm cho 1 sinh viên");
            System.out.println("3. Tính điểm trung bình");
            System.out.println("4. Tìm sinh viên theo họ tên và mã số sinh viên");
            System.out.println("5. In danh sách sinh viên xắp xếp tăng dần theo tên, giảm dần theo điểm");
            System.out.println("0. Thoát");
            System.out.println("Nhập sự lựa chọn: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    student.nhap();
                    students.add(student);
                    break;
                case 2:
                    break;
                case 3:
                    student.diemTB();
                    break;
                case 4:
                    break;
                case 5:
                    student.xuat();
                    break;
                case 0:
                    System.out.println("Tạm biệt");
                    break;
                default:
                    System.out.println("Lỗi! vui lòng nhập lại");
            }
        } while (chon != 0);
    }
}

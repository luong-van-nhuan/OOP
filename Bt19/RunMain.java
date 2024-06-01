import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        int chon = 0;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Thêm điểm cho một sinh viên");
            System.out.println("3. Tính điểm trung bình");
            System.out.println("4. Tìm sinh viên theo họ tên và mã số sinh viên");
            System.out.println("0. Thoát chương trình");
            System.out.println("5. In danh sách sinh viên xếp tăng dần theo tên, giảm dần theo điểm:");
            System.out.println("Nhập lựa chọn: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    sm.themSinhVien();
                    break;
                case 2:
                    Student student = new Student();
                    student.themDiem();
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lỗi vui lòng nhập lại");
            }
        } while (chon != 0);
    }
}

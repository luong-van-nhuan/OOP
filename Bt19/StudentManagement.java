import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> students;

    public StudentManagement(ArrayList<Student> students) {
        this.students = students;
    }
    public StudentManagement() {
        this.students = new ArrayList<>();
    }
    public void themSinhVien(){
        Student student = new Student();
        student.nhap();
        this.students.add(student);
    }


}

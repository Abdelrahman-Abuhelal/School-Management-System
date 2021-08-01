import java.util.ArrayList;
import java.util.List;

public class school {

    List<students> studentsList;
    List<teachers> teachersList;
    private static int TotalMoneyEarned;
    private static int TotalMoneySpent;

    public school(List<students> studentsList,List<teachers> teachersList) {
        this.studentsList = studentsList;
        this.teachersList = teachersList;
        TotalMoneyEarned = 0;
        TotalMoneySpent = 0;
    }

    public List<students> getStudentsList() {
        return studentsList;
    }

    public void addStudent(students stu) {
        studentsList.add(stu);
    }

    public List<teachers> getTeachersList() {
        return teachersList;
    }

    public void addTeacher(teachers teach) {
        teachersList.add(teach);
    }


    public int getTotalMoneyEarned() {
        return TotalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        TotalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return TotalMoneySpent;
    }

    public static void UpdateTotalMoneySpent(int MoneySpent) {
        TotalMoneyEarned -= MoneySpent;
    }
}

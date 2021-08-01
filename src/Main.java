import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        teachers Yousef=new teachers(1,"Yousef",2500);
        teachers Layla=new teachers(2,"Layla",3000);
        List<teachers> teachList=new ArrayList<>();
        teachList.add(Yousef);
        teachList.add(Layla);

        students Ali=new students(1,"Ali",8);
        students khaled=new students(2,"khaled",10);

        List<students> studList=new ArrayList<>();
        studList.add(Ali);
        studList.add(khaled);

        school hs=new school(studList,teachList);
        Ali.payFees(5000);
        System.out.println(Ali.getRemaining_fees());
        khaled.payFees(8000);
        System.out.println(khaled.getRemaining_fees());
        System.out.println("The schools has earned a: $"+hs.getTotalMoneyEarned());
        Yousef.recieveSalary(Yousef.getSalary());
        System.out.println(Layla);
        System.out.println(Ali);

    }
}

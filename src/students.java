public class students {

    private int id;
    private String name;
    private int grade;
    private int fees_paid;
    private int fees_total;

    public students(){

    }

    public students(int id, String name, int grade) {
        fees_paid=0;
        fees_total=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees) {
        fees_paid += fees;
        school.updateTotalMoneyEarned(fees_paid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFees_paid() {
        return fees_paid;
    }

    public int getFees_total() {
        return fees_total;
    }
    public int getRemaining_fees(){
        return fees_total-fees_paid;
    }

    @Override
    public String toString() {
        return "student: "+getName()+" has paid "+getFees_paid()+" so far.";
    }
}

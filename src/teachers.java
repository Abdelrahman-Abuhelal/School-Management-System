public class teachers {

    private int id;
    private String name;
    private int Salary;
    private  int salaryEarned;

    public teachers(){

    }

    /**
     *
     * @param id
     * @param name
     * @param salary
     */
    public teachers(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        Salary = salary;

    }

    public void setSalary(int salary){
        this.Salary=salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return Salary;
    }

    public void recieveSalary(int salary){
        salaryEarned+=salary;
        school.UpdateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "the teacher with name: "+getName()+" has earned $"+getSalary()+" so far";
    }
}

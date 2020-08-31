import java.util.ArrayList;

public class Employee extends Person {
    private  int salary;
    private  int hours;

    public Employee(){

    }
    public Employee(String name, String cpr, int hours, int salary) {
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
    }

    public static void print(){
        ArrayList<Employee> eList = new ArrayList<>();
        Employee e1 = new Employee("Brian", "150753-1451", 15, 6840);
        eList.add(e1);
        Employee e2 = new Employee("Elise", "210400-5465", 32, 14592);
        eList.add(e2);
        Employee e3 = new Employee("Muhammad", "042069-8845", 37, 23000);
        eList.add(e3);
        Employee e4 = new Employee("Bent", "140872-4575", 23, 10488);
        eList.add(e4);

        HelperClass.Layout("Name", "CPR", "Hours", "Salary");
        HelperClass.stars();
        for(Employee e : eList){
            String hours = Integer.toString(e.getHours());
            String salary = Integer.toString(e.getSalary());
            HelperClass.Layout(e.getName(), e.getCpr(), hours, salary);
        }
        HelperClass.bars();
    }
    public String toString(){
        return getName() + "\t \t" + getCpr() + "\t \t" + getHours() + "\t \t" + getSalary();
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }
}

public class Instructor extends Employee {

    public Instructor(){

    }

    public Instructor(String name, String cpr, int hours, int salary) {
        super(name, cpr, hours, salary);
    }

    public int getSalary(int hours){
        int salary = (456*hours);
        return salary;
    }
}

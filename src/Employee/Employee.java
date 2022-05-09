package Employee;

public class Employee {
    public static int year = 2001;
    public String name;
    public int age;
    public int salary;
    public Location location;

    Employee(String name, int age, int salary, Location location){
        this.name=name;
        this.salary=salary;
        this.age=age;
        this.location=location;
    }

    public void getSalary(){
        System.out.println("The salary of " + this.name + " is "+ this.salary);
    }

    public void increaseSalary(int factor){
        this.salary=this.salary + factor;
        System.out.println("The new Salary for "+this.name+ " is "+ this.salary);
    }
}

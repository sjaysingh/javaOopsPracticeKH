package Employee;

public class EmpMain {
    public static void main(String[] args){
        Employee emp = new Employee("Ankur",23,45000, Location.Delhi);
        Employee emp2 = new Employee("Bipin", 45,  200000, Location.Pune);

        emp.getSalary();
        emp2.getSalary();

        emp.increaseSalary(17500);

        Employee.year += 2;

        System.out.println(Employee.year);


    }
}

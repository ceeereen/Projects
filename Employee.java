public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public int tax() {
        if (salary < 1000) {
            return salary;
        } else {
            return (int) (salary * 1.3);
        }
    }

    public int bonus() {
        int bonus = (workHours - 40) * 30;
        if (bonus > 0) {
            return bonus;
        }
        return 0;
    }

    public int raiseSalary() {
        if (hireYear < 10){
            return (int) (salary*1.05);
        }
        else if (hireYear > 9 && hireYear < 20) {
            return (int) (salary*1.10);
        }
        else {
            return (int) (salary*1.15);
        }
    }

    public String toString() {
        return "Name: " + name + ", Salary: " + salary + ", Work Hours: " + workHours + ", Hire Year: " + hireYear;
    }
    public static void main(String[] args) {
        Employee employee = new Employee("John", 1500, 45, 8);
        System.out.println(employee.toString());
    }
}    


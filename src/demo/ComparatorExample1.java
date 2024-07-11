package demo;

import java.util.*;

public class
ComparatorExample1 {

    private int id;
    private String name;
    private double salary;

    public ComparatorExample1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparatorExample1 that = (ComparatorExample1) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    @Override
    public String toString() {
        return "demo.ComparatorExample1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<ComparatorExample1> employees = new ArrayList<>();

        employees.add(new ComparatorExample1(1010, "Rajeev", 100000.00));
        employees.add(new ComparatorExample1(1004, "Chris", 95000.50));
        employees.add(new ComparatorExample1(1015, "David", 134000.00));
        employees.add(new ComparatorExample1(1009, "Steve", 100000.00));

        System.out.println("Employees : " + employees);

        Comparator<ComparatorExample1> employeeNameComparator = new Comparator< ComparatorExample1 >() {
            @Override
            public int compare(ComparatorExample1 o1, ComparatorExample1 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(employees,employeeNameComparator);
        System.out.println("sorted by name:" + employees);

        Comparator<ComparatorExample1> employeeGetSalaryComparator = new Comparator< ComparatorExample1 >() {
            @Override
            public int compare(ComparatorExample1 o1, ComparatorExample1 o2) {
                if(o1.getSalary() < o2.getSalary())
                    return -1;
                else if (o1.getSalary() > o2.getSalary())
                    return 1;
                else return 0;
            }
        };

        Collections.sort(employees,employeeGetSalaryComparator);
        System.out.println("sorted by salary:" + employees);

    }

}

import java.util.*;

public class EmployeeDetails implements Comparable< EmployeeDetails >{

    private int id;
    private String name;
    private String address;
    private int salary;

    public EmployeeDetails(int id, String name, String address, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDetails that = (EmployeeDetails) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, salary);
    }

    @Override
    public int compareTo(EmployeeDetails o) {
        //return this.getId() - o.getId();
        if (this.getId() < o.getId()) {
            return -1; }
        else if (this.getId() > o.getId()) {
            return 1; }
        else {
            return 0;}
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<EmployeeDetails> eo = new ArrayList<>();
        eo.add(new EmployeeDetails(18,"gopal","london",90000));
        eo.add(new EmployeeDetails(10,"Dipa","glasgow",60000));
        eo.add(new EmployeeDetails(12,"mou","cob",80000));
        System.out.println("before sorting:" + eo);
        Collections.sort(eo);
        System.out.println("after sorting:"+ eo);
    }
}



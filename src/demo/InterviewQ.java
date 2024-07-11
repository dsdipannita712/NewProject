package demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;



class EmployeeT
{
    private int id;
    private String name;
    private int salary;
    private String gender;
    private int age;

    public EmployeeT(int id, String name, int salary, String gender, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeT{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
//name whose salary>1 and who is female and younger in the company
public class InterviewQ {
    public static void main(String[] args) {

        List<EmployeeT> ta = new ArrayList<EmployeeT>();
        ta.add(new EmployeeT(10,"dipa",1000,"female",18));
        ta.add(new EmployeeT(18,"dipannita",5000,"female",89));

        ta.stream().filter(i -> i.getSalary()>1 && i.getGender().equalsIgnoreCase("Female") && i.getAge() <= 18)
                .forEach(System.out::println);


        int[] ints = {1,2,3,1,4,3,2};
        List<Integer> intList = new ArrayList<Integer>();
        for (int i : ints)
        {
            intList.add(i);
        }
        String st = String.valueOf(intList);

        System.out.println(st);
        Map<Character,Long> ll = st.chars().mapToObj(i-> (char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(ll);
    }
}

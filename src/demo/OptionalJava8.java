package demo;

import java.util.Optional;

class Company
{
    String department;
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public Company(String department) {
        this.department = department;
    }
}
public class OptionalJava8 {
    public static void main(String[] args) {
        Optional<Integer> op = Optional.of(4);
        op.ifPresent(System.out::println);

        Optional<Integer> op2 = Optional.empty();
        op2.ifPresent(System.out::println);

        Optional<Integer> op3 = Optional.ofNullable(null);
        op3.ifPresent(System.out::println);

        Optional<Company> op4 = Optional.of(new Company("mou"));
        op4.filter(p->p.getDepartment().equalsIgnoreCase("Dipa")).
                ifPresent(o -> System.out.println("good"));

        String[] ar = new String[5];
        ar[2] = "hello dipa";
        Optional<String> p = Optional.of(ar[2]);
        p.ifPresent(pp->System.out.println("values received"));

        if(p.isPresent())
        {
            System.out.println(p.get() + " " + p.hashCode());

        }


        Optional<Integer> op1 = Optional.of(null);
        op.ifPresent(System.out::println);
    }
}

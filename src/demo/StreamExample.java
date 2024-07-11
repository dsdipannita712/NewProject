//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//class Employee
//{
//    int id;
//    String name;
//    int age;
//    String gender;
//    String city;
//
//    String department;
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    Employee(int id, String name, int age,String gender, String city, String department) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.city = city;
//        this.department = department;
//    }
//}
//public class StreamExample {
//    public static void main(String[] args) {
//        List< demo.EmployeeDetails > list = new ArrayList< demo.EmployeeDetails >();
//        list.add(new demo.EmployeeDetails(123,"dipa",78,"F","kolkata","CSE"));
//        list.add(new demo.EmployeeDetails(456,"mou",67,"M","delhi","Mechnical"));
//        list.add(new demo.EmployeeDetails(989,"mou",88,"F","kolkata","CSE"));
//        list.add(new demo.EmployeeDetails(321,"adrija",76,"F","Bangalore","Civil"));
//        list.add(new demo.EmployeeDetails(128,"subharaj",43,"M","delhi","CSE"));
//        list.add(new demo.EmployeeDetails(765,"sanku",23,"M","Bangalore","Civil"));
////        Map<String,String> map = list.stream().collect(Collectors.toMap(employee -> String.valueOf(employee.getId()),Employee::getName));
////        Map<Integer,String> map1 = list.stream().collect(Collectors.toMap(Employee::getAge,Employee::getName));
////        //group the employees by city
////        Map<String, List<Employee>> groupListByCity = list.stream().collect(Collectors.groupingBy(Employee::getCity));
////        //group the employees by city
////        Map<String, List<Employee>> groupListByName = list.stream().collect(Collectors.groupingBy(Employee::getName));
////        System.out.println(map);
////        System.out.println(map1);
////        System.out.println(groupListByCity);
////        System.out.println(groupListByName);
////        //Find the count of male and female employees present in the organization.
////        Map<String,Long> countMaleFemale = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
////        System.out.println(countMaleFemale);
////        //print the names of all department of all organization
////        List<String> listOfNames;
////        listOfNames = list.stream().map(Employee::getDepartment).distinct().toList();
////        System.out.println("lisOfNames:" + listOfNames);
////        // 5. Print employee details whose age is greater than 28.
////        list.stream().filter(e -> e.getAge() > 28).toList().forEach(System.out::println);
////
////        //6. Find maximum age of employee.
////       OptionalInt ageMax =  list.stream().mapToInt(Employee::getAge).max();
////       if (ageMax.isPresent())
////       {
////           System.out.println(ageMax.getAsInt());
////       }
//
//        List<Integer> integerList = List.of(2,5,8,9,4,7);
//
//        Stream<Integer> stream = integerList.stream();
//
//        System.out.println(stream.collect(Collectors.partitioningBy(i -> i % 2 == 0)));
//
//        List<Integer> integerList1 = List.of(2,5,8,9,4,7);
//
//        Stream<Integer> stream1 = integerList.stream();
//
//        integerList1.add(34);
//
//        System.out.println(stream1.filter(i -> i % 2 == 0).collect(Collectors.toList()));
//    }
//}

import java.util.Objects;

public class EncapsulationJava {
//    private String name;
//    private String address;
//    private String id;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        EncapsulationJava that = (EncapsulationJava) o;
//        return Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(id, that.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, address, id);
//    }
//
//    @Override
//    public String toString() {
//        return "EncapsulationJava{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", id='" + id + '\'' +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        EncapsulationJava e = new EncapsulationJava();
//        e.setName("dipa");
//        e.setAddress("kolkata");
//        e.setId("123");
//        System.out.println(e.getName());
//        System.out.println(e.getAddress());
//        System.out.println(e.getId());
//    }
private String name;
private String address;
private String age;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static void main(String[] args) {
        EncapsulationJava ee = new EncapsulationJava();
        ee.setName("dipa");
        ee.setAddress("glasgow");
        ee.setAge("32");

        System.out.println(ee.name);
        System.out.println(ee.getName() + " " + ee.getAddress() + " " + ee.getAge());

    }
}

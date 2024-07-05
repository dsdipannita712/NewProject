final public class ImmutuableClassExample {
    final String name;

    public ImmutuableClassExample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
    ImmutuableClassExample io = new ImmutuableClassExample("Dipa");
    System.out.println(io.getName());
    }
}

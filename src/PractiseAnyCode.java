
public final class PractiseAnyCode {
    final String name;

    public PractiseAnyCode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        PractiseAnyCode p = new PractiseAnyCode("Dipannita");
        System.out.println(p.getName());
    }
}


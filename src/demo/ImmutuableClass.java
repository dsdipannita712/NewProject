package demo;

final public class ImmutuableClass {
    final String panCardNumber;

    public ImmutuableClass(String panCardNumber) {
        this.panCardNumber = panCardNumber;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }

    public static void main(String[] args) {
      ImmutuableClass ca = new ImmutuableClass("DJDPS9139B");
      System.out.println(ca.getPanCardNumber());
    }
}

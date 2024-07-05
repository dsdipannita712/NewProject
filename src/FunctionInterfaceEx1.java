
interface FunctionInterfaceEx1 {
    String display();

    default void print() {
        System.out.println("default print");
    }

    static void paint() {
        System.out.println("paint print");
    }
}

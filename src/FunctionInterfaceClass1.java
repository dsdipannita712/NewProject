public class FunctionInterfaceClass1 {
    public static void main(String[] args) {
        FunctionInterfaceEx1 f = () ->
        {
            return "display something";
        };

        System.out.println(f.display());
    }
}

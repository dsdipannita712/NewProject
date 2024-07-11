package demo;

public class FunctionInterfaceClass1 {
    public static void main(String[] args) {
      FunctionInterfaceEx1 e = () ->
      {
        return "dipa";
      };
      System.out.println(e.display());
    }
}

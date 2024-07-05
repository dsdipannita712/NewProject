public class Exception1 {
    public static void main(String[] args) {
        String s = "abc";
    int a = Integer.parseInt(s) ;
    System.out.println(a);
        try
        {
            int i = 5/0;
        }
        catch (ArithmeticException e)
        {
            e.getMessage();
            System.out.println("message:"+ e);
        }
    }
}

public class ClassCastExample {
    public static void main(String[] args) {
        Object obj = 123;
        if(obj instanceof Integer)
        {
            Integer str = (Integer) obj;
            System.out.println(str);
        }

        String num = "1234";
        Integer m = 123;
        String ss = String.valueOf(m);
        System.out.println(ss);
        Integer in = Integer.parseInt(num);
        System.out.println(in);
        String po = "23k";
        try {
            Integer pom = Integer.parseInt(po);
        }
        catch (NumberFormatException e)
        {
            System.out.println("exception caught");
        }

    }
}

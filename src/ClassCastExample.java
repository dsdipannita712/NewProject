public class ClassCastExample {
    public static void main(String[] args) {
        Object obj = 123;
        if(obj instanceof Integer)
        {
            Integer str = (Integer) obj;
            System.out.println(str);
        }
    }
}

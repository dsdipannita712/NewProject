package demo;

@FunctionalInterface
interface funct
{
    String now(String name);
}
public class LambdaExpressionEx1{
    public static void main(String[] args) {
//        funct f = () ->
//        {
//            return "display something";
//        };
        funct f = (n) ->
        {
            String nn = "" ;
            for(int i = n.length()-1; i>=0;i--)
            {
                nn += n.charAt(i);
            }
            return nn;
        };
        System.out.println(f.now("hello"));
    }
}


package demo;

public class ValidPractise1 {

    public static boolean getValidP(String name)
    {
        int i = -1;
        char[] stack = new char[name.length()];
        for(char ch :  name.toCharArray())
        {
            if(ch == '(' || ch == '{' || ch == '[')
            {
                stack[++i] = ch;
            }
            else { if(i>=0 && ((stack[i]=='(' && ch == ')') || (stack[i]=='{' && ch == '}')|| (stack[i]=='[' && ch == ']')))
                i--;
            else
                return false;
            }
        }
        return i == -1;
    }


    public static void main(String[] args)
    {
        String s = "([)";
        boolean b = getValidP(s);
        if(b)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
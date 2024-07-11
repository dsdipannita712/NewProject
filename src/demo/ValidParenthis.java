package demo;

public class ValidParenthis {

    public static boolean getValidParen(String s) {
        int i = -1;
        char[] stack = new char[s.length()];
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++i] = ch;
            } else {
                if (i >= 0 && ((stack[i] == '(' && ch == ')') || (stack[i] == '{' && ch == '}') || (stack[i] == '[' && ch == ']')))
                    i--;
            }
        }
        return i == -1;
    }

    public static void main(String[] args) {
        String str = "([)";
        boolean b = getValidParen(str);
        if (b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
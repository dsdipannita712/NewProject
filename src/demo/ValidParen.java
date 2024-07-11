package demo;

public class ValidParen {
    public static boolean getValidParen(String st) {
        int i = -1;
        char[] stack = new char[st.length()];
        for (char ch : st.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++i] = ch;
            } else if (i >= 0 && (stack[i] == '(' && ch == ')') || (stack[i] == '{' && ch == '}') || (stack[i] == '[' && ch == ']')) {
                i--;
            } else {
                return false;
            }
        }
            return i == -1;
        }
        public static void main(String[] args)
        {
            String str = "()";
            boolean b = getValidParen(str);
            if (b) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

package demo;

public class InterviewMy {

    public boolean validP(String pa) {
        int i = -1;
        char[] stack = new char[pa.length()];
        for (char ch : pa.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++i] = ch;
            } else if (i >= 0 && (stack[i] == '(' && ch == ')') || (stack[i] == '(' && ch == ')') || (stack[i] == '(' && ch == ')')) {
                 i--;
            }
        }
        return i == -1;
    }

    public static void main(String[] args) {
        String s = "()";
        InterviewMy m = new InterviewMy();
        boolean bb = m.validP(s);
        if (bb) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

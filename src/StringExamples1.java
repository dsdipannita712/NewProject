public class StringExamples1 {
    public static void main(String[] args) {
        String s = "dipa ";
        s = s + "dipa";
        String sr = s.toUpperCase();
        System.out.println(sr +" ");
        StringBuffer sb = new StringBuffer("hello ");
        sb.append("adrija");
        System.out.println(sb);
        StringBuilder sbb = new StringBuilder("hi dipannita ");
        sbb.append("welcome to uk");
        System.out.println(sbb);

    }
}

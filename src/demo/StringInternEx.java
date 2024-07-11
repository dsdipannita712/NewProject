package demo;

public class StringInternEx {
    public static void main(String[] args) {
        String s1 = new String("dipa");
        String s2 = new String("dipa");
        System.out.println(s1==s2);

        String s3=s1.intern();
        String s4 = s2.intern();
        System.out.println(s3==s4);
        String del = ",";
        String[] str = {"banana","orange","apple"};
        String joined = String.join(del,str);
        System.out.println(joined);

        String sg = "dipannita,saha,adrija";
        String sp = ",";

        String[] re = sg.split(sp);
        for(String op : re) {
            System.out.println(op);
        }
        String sub = "demo.Hello, Dipannita";
        System.out.println(sub.substring(7));
        System.out.println(sub.substring(0,5));
    }
}

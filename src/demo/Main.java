package demo;

public class Main {
    public static void main(String[] args) {
       String s1 = "dipa";
       String s2 = "saha";

       String s = s1.concat(s2);
       String sa = String.join(" ",s1,s2);
       System.out.println("s:" + s);
        System.out.println("sa:" + sa);

    }
}
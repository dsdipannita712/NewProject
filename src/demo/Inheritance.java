package demo;

interface A {
    public void disA();
}
interface B {
    public void disB();
}
interface C extends A,B {
    public void disC();
}
public class Inheritance implements C {
    @Override
    public void disA() {
    System.out.println("A");
    }
    @Override
    public void disB() {
        System.out.println("B");
    }
    @Override
    public void disC() {
        System.out.println("C");
    }
    public static void main(String args[]) {
    Inheritance h = new Inheritance();
    h.disA();
    h.disB();
    h.disC();
}}

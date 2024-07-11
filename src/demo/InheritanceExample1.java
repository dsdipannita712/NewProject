package demo;

class Animal
{
    String name;
    public void display() {
        System.out.println("display name");
    }
}
class Dog extends Animal
{
    public void eat() {
        System.out.println("eat chicken " + name);
    }
}
public class InheritanceExample1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = new Animal();
        d.name = "dipa";
        d.display();
        d.eat();
        a.display();
        Animal aa =  new Dog();
        aa.name = "hello";
        aa.display();
    }
}

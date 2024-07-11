package demo;

class AllAnimal {
    public void display() {
        System.out.println("display animal");
    }
    public void displayAnimal() {
        System.out.println("display super animal");
    }
}

class AllDog extends AllAnimal {
    public void display() {
        super.display();
        System.out.println("display dog");
    }
    public void displayDog() {
        System.out.println("display sub dog");
    }
}
public class InheritanceExample2 {

    public static void main(String[] args) {
        AllDog dog = new AllDog();
        dog.display();
        dog.displayAnimal();
        dog.displayDog();

    }
}

package example.four.uml;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Luna", 2,"W",false);
        Dog d2 = new Dog("Tom", 3,"M",true);
        Dog d3 = new Dog("Max", 2,"M",false);

        System.out.println(Animal.getAnimalsList());
        Cat c1 = new Cat("Jerry",10,"M",true);
        System.out.println(Animal.getAnimalsList());
    }
}

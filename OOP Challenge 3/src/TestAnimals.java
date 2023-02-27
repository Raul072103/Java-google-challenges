public class TestAnimals {

    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        System.out.println(d.getName());
        d.play();
        d.walk();
        d.setName("Fizz");
        System.out.println(d.getName());

    }
}

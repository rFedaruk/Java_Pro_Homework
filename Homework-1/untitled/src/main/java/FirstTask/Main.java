package FirstTask;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person(23, "Bogdan");
        person1.talk();
        person1.walk();
        person2.talk();
        person2.walk();
    }
}

package FirstTask;

public class Person {
    private String fullname;
    private int age;
    Person(){}
    Person(int age, String fullname){
        this.age = age;
        this.fullname = fullname;
    }
    public void talk(){
        System.out.println(fullname + " говорит");
    }
    public void walk(){
        System.out.println(fullname + " идёт");
    }

}

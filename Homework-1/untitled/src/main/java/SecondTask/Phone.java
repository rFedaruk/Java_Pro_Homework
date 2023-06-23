package SecondTask;

import FirstTask.Person;

public class Phone {
    private int number;
    private String model;
    private String name;
    private double weight;
    Phone(int number, String model, String name,  double weight){
        this.number = number;
        this.weight = weight;
        this.model = model;
        this.name = name;
        System.out.println(name + " ваш номер - " + number + " Вес телефона + " + weight + " Модель телефона + " + model);
    }
    public void receiveCall(String name){
        System.out.println("Звонит - " + name);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}

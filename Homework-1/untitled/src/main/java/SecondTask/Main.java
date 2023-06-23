package SecondTask;

public class Main {
    public static void main(String[] args) {
    Phone firstPhone = new Phone(623119223, "K1", "Vovan", 0.7);
    Phone secondPhone = new Phone(623119133, "K2", "Bogdan" , 0.6);
    Phone thirdPhone = new Phone(623119883, "K3" , "Stepan", 0.67);

    firstPhone.receiveCall(secondPhone.getName());
        System.out.println(secondPhone.getNumber());
    secondPhone.receiveCall(thirdPhone.getName());
        System.out.println(thirdPhone.getNumber());
    thirdPhone.receiveCall(firstPhone.getName());
        System.out.println(firstPhone.getNumber());
    }
}

//Класс Phone.
//Создайте класс Phone, который содержит переменные number, model и weight.!
//Создайте второй класс и в нём создайте три экземпляра Phone. !
//Выведите на консоль значения их переменных. !
//Добавить в класс Phone метод: receiveCall, который принимает один параметр – имя звонящего.
//Данный метод должен выводить на консоль сообщение “Звонит {здесьимязвонящего}”.
//Создайте геттер getNumber – он должен возвращать номер телефона.
//Вызвать эти методы для каждого из объектов.
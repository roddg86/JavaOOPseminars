package sem1.impl;

import sem1.Animal;
import sem1.Illable;

import java.io.Serializable;

/**
 * Сущность кот реализует функционал абстрактного класса животное, и реализует способность из интерфейса Заболеть
 */
public class Cat extends Animal implements Illable, Serializable {

    // вызвать конструктор родителя
    public Cat(String name, String color) {
        super(name, color,4);
    }

    public Cat(String name) {
        super(name);
    }

    // Инкапсуляция
    // на примере метода hunt
    // соблюдение порядка вызова методов
    // невозможно нарушить порядок вызова методов они инкапсулированы и приватные
    public void hunt(){
        wakeUP();
        findFood();
        eat();
    }

    // полиморфизм
    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    private void wakeUP(){
        // просыпание
        // один из поведенческих методов
        System.out.println("Woke up..");
    }

    private void findFood(){
        System.out.println("Found food..");
    }

    private void eat(){
        System.out.println("Eat..");
    }

    @Override
    public void getIll() {
        /**
         * метод Заболел
         */
            System.out.printf("%s заболел%n", this.getType());
    }
}

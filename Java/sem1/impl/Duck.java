package sem1.impl;

import sem1.Animal;
import sem1.Flyable;
import sem1.Illable;

/**
 * Сущность утка, животное, способное летать и болеть
 * @see Illable
 * @see Flyable
 * @see Animal
 */

public class Duck extends Animal implements Flyable, Illable {
    public Duck(String name, String color) {
        super(name, color, 2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Квак");
    }

    @Override
    public void hunt() {

    }

    public void fly() {
        System.out.println("полетели");
    }

    /**
     *
     * @return возвращает скорость с которой летит утка
     */
    @Override
    public int getFlightSpeed() {
        return 10;
    }

    @Override
    public void getIll() {

    }
}

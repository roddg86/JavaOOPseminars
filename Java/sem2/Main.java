package sem2;

import sem1.Animal;
import sem1.Flyable;
import sem1.Illable;
import sem1.impl.Cat;
import sem1.impl.Dog;
import sem1.impl.Duck;
import sem1.impl.Eagle;
import veterinary.VetClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Мурзик"))
                .addAnimal(new Dog("Бобик"))
                .addAnimal(new Duck("Дональд"));

        /**
         * Список для наследников интерфейса Illable(способных заболеть)
         */
        List<Illable> illables = new ArrayList<>();
        illables.add(new Cat("Барсик"));
        illables.add(new Human());

        /**
         * Список для наследников интерфейса Flyable(умеющих летать)
         */
        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Eagle());
        flyables.add(new Duck("Donald"));

        // Выведем скорость
        for (Flyable f : flyables
        ) {
            System.out.println(f.getFlightSpeed());
        }

        System.out.printf("Количество наследников класса Animal = %d", Animal.getAnimalsCount());
    }
}

package sem3;

import sem3.drugs.Component;
import sem3.drugs.impl.CatDrug;
import sem3.drugs.impl.components.Azitron;
import sem3.drugs.impl.components.Water;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Дообавление компонентов с помощью итератора
         */
        List<Component> componentsCat = List.of(new Azitron("Азитрон", "2", 4),
                new Water("Вода", "15", 1));
        CatDrug catDrug = new CatDrug(componentsCat);

        // вывод всех компонентов с помощью интерфейса Iterable
        for (Component component : catDrug) {
            System.out.println(component);
        }
    }
}

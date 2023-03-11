package sem3;

import sem3.drugs.Component;
import sem3.drugs.Drug;
import sem3.drugs.impl.CatDrug;
import sem3.drugs.impl.components.Azitron;
import sem3.drugs.impl.components.Pinecilin;
import sem3.drugs.impl.components.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Дообавление компонентов с помощью итератора
         */
        List<Component> componentsCat = List.of(new Azitron("Азитрон", "2", 4),
                new Water("Вода", "15", 1));
        CatDrug drug = new CatDrug(componentsCat);

        // вывод всех компонентов с помощью интерфейса Iterable
//        for (Component component : drug) {
//            System.out.println(component);
//        }

        List<Component> componentsCat2 = List.of(new Azitron("Азитрон", "4", 7),
                new Pinecilin("Пинецилин", "18", 6));
        List<Component> componentsCat3 = List.of(new Water("Вода", "20", 4),
                new Azitron("Азитрон", "10", 5));
        List<Component> componentsCat4 = List.of(new Water("Вода", "21", 3),
                new Azitron("Азитрон", "11", 100));

        CatDrug drug1 = new CatDrug(componentsCat2);
        CatDrug drug2 = new CatDrug(componentsCat3);
        CatDrug drug3 = new CatDrug(componentsCat4);

        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug);
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug3);
        //System.out.println(drugs);

        Collections.sort(drugs); // сортировка по возрастанию

        System.out.println(drugs);

        Collections.sort(drugs, Collections.reverseOrder()); // сортировка по убыванию
        //System.out.println(drugs);

        for(CatDrug counter: drugs){
            System.out.println(counter);
        }
    }
}

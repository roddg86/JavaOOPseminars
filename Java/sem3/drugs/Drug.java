package sem3.drugs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Сущность лекарство
 */
public abstract class Drug implements Iterable<Component>, Comparable<Drug> {

    // поле список компонентов
    private List<Component> components;

    // поле номер по порядку
    int index;

    public Drug(List<Component> components) {
        this.components = components;
        this.index = 0;
    }

    /**
     * Получаем power лекарства, это сумма всех сил компонентов
     *
     * @return общая сила всех компонентов
     */
    public int getDrugPower() {
        int power = 0;
        for (Component component : components) {
            power += component.getPower();
        }
        return power;
    }

    public void addComponent(Component component) {
        if (!(components.indexOf(component) != -1))
            components.add(component);
    }

    /**
     * Интерфейс реализован в виде анонимного класса
     * <p>
     * Анонимный класс, класс без имени
     * так как мы нигде его не используем нам не нужно его имя
     *
     * @return возвращает анонимный класс итератора через new, в этом классе мы обязаны переопределить все методы которые требуются
     */
    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            public boolean hasNext() {
                return index < components.size();
            }

            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s}%n", this.getClass().getSimpleName(), components, getDrugPower()
        );
    }

    /**
     * compareTo - нужно переопределить через Ctrl + O, для сравнения объектов либо полей
     *
     * @param o the object to be compared.
     * @return больше меньше либо равно
     */
    @Override
    public int compareTo(Drug o) {
        int power = getDrugPower();
        //Component name = components.
//        if (power > o.getDrugPower()) {
//            return 1;
//        } else if (power < o.getDrugPower()) {
//            return -1;
//        } else return 0;
        return Integer.compare(power, o.getDrugPower());
    }
}

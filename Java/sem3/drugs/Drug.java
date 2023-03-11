package sem3.drugs;

import java.util.Iterator;
import java.util.List;

/**
 * Сущность лекарство
 */
public abstract class Drug implements Iterable<Component> {

    // поле список компонентов
    private List<Component> components;

    // поле номер по порядку
    int index;

    public Drug(List<Component> components) {
        this.components = components;
        this.index = 0;
    }

    /**
     * Интерфейс реализован в виде анонимного класса
     *
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
}

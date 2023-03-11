package sem3.drugs;

import java.util.Iterator;
import java.util.List;

/**
 * Сущность лекарство
 */
public abstract class Drug implements Iterator<Component> {

    // поле список компонентов
    private List<Component> components;

    // поле номер по порядку
    int index;

    public Drug(List<Component> components) {
        this.components = components;
        this.index = 0;
    }

    /**
     * Отвечает на вопрос есть ли следующий элемент этого класса
     *
     * @return true || false
     */
    @Override
    public boolean hasNext() {
//        if(index < components.size())
//            return  true;
//        else return false;
        return index < components.size();
    }

    /**
     * Отвечает на вопрос как получить следующий элемент этого класса
     *
     * @return возвращает следующий элемент списка, пока hasNext будет true
     */
    @Override
    public Component next() {
        return components.get(index++);
    }
}

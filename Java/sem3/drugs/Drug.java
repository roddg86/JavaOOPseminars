package sem3.drugs;

import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterator<Component> {
    private List<Component> components;
    int index;

    public Drug(List<Component> components, int index) {
        this.components = components;
        this.index = index;
    }

    /**
     * Отвечает на вопрос есть ли следующий элемент этого класса
     * @return
     */
    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    /**
     * Отвечает на вопрос как получить следующий элемент этого класса
     * @return
     */
    @Override
    public Component next() {
        return null;
    }
}

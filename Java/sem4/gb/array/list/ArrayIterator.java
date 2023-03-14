package sem4.gb.array.list;

import java.util.Iterator;

/**
 * Сущьность свой итератор
 * будет работать с типами о которых мы незнаем
 * @param <T> тип любой
 */
public class ArrayIterator<T> implements Iterator<T> {
    private int index;
    private final T[] values;

    public ArrayIterator(T[] values) {
        this.index = 0;
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public T next() {
        return values[index++];
    }
}

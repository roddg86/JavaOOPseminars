package sem4.gb.array;

//Simple

/**
 * По этой сущности можно бегать foreach
 * @param <T> любой тип
 *
 * мы создали контракт
 */
public interface GBList<T> extends Iterable<T>{
    // добавить элемент
    boolean add(T t);
    // удаление по индексу
    void remove(int index);
    // получение по индексу
    T get(int index);
    int size();
    // обновлять по индексу наш объект
    void update(int index, T t);
}

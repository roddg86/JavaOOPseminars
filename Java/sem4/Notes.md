### Заметки

#### Обобщения (Дженерики)

[2 метода с одинаковыми названиями из разных интерфейсов в одном классе - ответ на stackoverflow](https://ru.stackoverflow.com/questions/1030087 "Как реализовать в Java 2 метода с одинаковым названием из разных интерфейсов в одном классе?")

Вопрос с собеседования: Написать свою реализацию коллекции, обычно на это дается 20 минут.

```java

<E> тип параметра (часто ставят E - entity, T - type) 

```
```java

<?> так можно указывать если пока что тип параметра неизвестен. (ваилд кар)

```

Параметризованный тип: это когда я хочу работать либо со строками, либо с числами, либо с другим типом, но пока я еще не знаю с каким

```java

<T>

или два типа сразу

<T, E>

```

Например интерфейс Map<String, Integer> это тоже что и Map<K, V>

Что значит <T extends Number & Comparable>; - наследование от двух сразу от класса и от интерфейса, может быть только числом и можно сравнить с помощью интерфейса Comparable;

Что значит <? super T>; - получить всех кто родитель включая этот сам класс. Тайминг 1:18

>Функциональные интерфейсы, стандартные функциональные интерфейсы в Java

2:45 тестирование
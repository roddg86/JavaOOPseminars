package sem1;

/**
 * Абстрактный класс описывающий сущность животное, характеризующей состояние и способности
 */
public abstract class Animal {
    // поля класса(состояние этой сущности)
    public String name;
    private String color;
    private int pawsCount;

    /**
     * поле для подсчета сколько наследников у класса Animal
     * @see animalsCount это счетчик всегда создается с нуля
     */
    private static int animalsCount = 0;

    public String getType(){
        // метод присылает строчку энимал
        return this.getClass().getSimpleName();
    }

    /**
     * Конструктор класса, главный конструктор
     *
     * @param name имя животного
     * @param color цвет животного
     * @param pawsCount количество ног
     * @see animalsCount количество животных в программе
     */
    public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
        animalsCount++;
    }

    // конструктор вызывающий главный конструктор
    public Animal(String name){
        this(name, null, 0);
    }

    public Animal() {
        this(null);
    }

    @Override
    public String toString() {
        return String.format("Имя:%s, Цвет: %s", this.name, this.color);
    }


    /**
     * Абстрактный метод - это говорит о том что я этот метод в этом классе реализовывать не хочу
     * потому что я не знаю как он тут должен быть реализован, я буду реализовывать его в наследниках.
     */
    public abstract void speak();

    /**
     *Абстрактный метод
     */
    public abstract void hunt();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    /**
     * Метод подсчета количества наследников класса Animal
     * @return возвращает количество наследников класса Animal
     *
     */
    public static int getAnimalsCount(){
        return animalsCount;
    }
}

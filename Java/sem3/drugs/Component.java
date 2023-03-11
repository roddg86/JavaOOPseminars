package sem3.drugs;

/**
 * Сущность компонент лекарства(например вода, сода и т.п.)
 */
public class Component {
    // поле имя
    private String name;

    // поле вес
    private String weight;

    // поле сила действия компонента
    private int power;

    /**
     * Главный конструктор класса
     * @param name имя
     * @param weight вес
     * @param power сила действия
     */
    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }
}

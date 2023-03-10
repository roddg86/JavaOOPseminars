package veterinary;

import sem1.Animal;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    /**
     * поле хранит в себе всех животных пациентов
     */
    private final List<Animal> animals;

    /**
     * Метод позволяет принимать в клинику нового пациента
     * @param animal - параметр пациент который поступает в клинику
     *
     * @return this - фишка java для каскадного вызова встроенных методов, отголосок паттерна билдер.
     */
    public VetClinic addAnimal(Animal animal){
        this.animals.add(animal);
        return this;
    }

    /**
     * Конструктор
     */
    public VetClinic() {
        // инициализация поля в конструкторе, является хорошим тоном
        this.animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}

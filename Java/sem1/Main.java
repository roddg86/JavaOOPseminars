//package sem1;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    /**
//     *
//     * @param args
//     */
//    public static void main(String[] args) {
//        Animal animal = new Animal(null,null,1);
//     //   System.out.println(animal.getColor());
//
//        Animal animal1 = new Animal("собака");
//      //  System.out.println(animal1.getPawsCount());
//
//        Object animal3 = new Animal();
//       // System.out.println(animal1.getType()); // наследование классом Animal методов супер класса Object
//
//        Cat cat1 = new Cat("Мурзик");
//        //Cat cat1 = new Cat();
//        // Пример наследования
//        cat1.setName("Мурзик");
//        System.out.println(cat1.getType());
//
//        System.out.println(animal1.getType());
//        System.out.println(cat1.getType());
//
//        Animal cat2 = new Cat("Котик");
//        cat2.speak();
//        animal1.speak();
//
//        List<Animal> animals = new ArrayList<>();
//        animals.add(cat2);
//        animals.add(new Dog("Бобик"));
//        animals.add(new Duck("Дональд"));
//
//        // :: - дать ссылку на метод
//        animals.forEach(Animal::speak);
//
//        // вызовем метод полета  приведением типа
//        for (Animal a : animals) {
//            if(a instanceof Duck) ((Duck) a).fly();
//            System.out.println(a);
//        }
//
//        // логика
//        Cat cat3 = new Cat("Кот с методами");
//        cat3.hunt();
//
//    }
//
//}

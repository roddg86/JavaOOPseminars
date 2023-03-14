package sem4;


import sem4.gb.array.GBList;
import sem4.gb.array.list.GBArrayList;

public class Main {
    public static void main(String[] args) {
        GBList<String> strings = new GBArrayList<>();
        strings.add("один");
        strings.add("два");
        strings.add("три");
        System.out.println("-------GET-------");
        System.out.println(strings.get(1));
        System.out.println("-------SIZE-------");
        System.out.println(strings.size());
        System.out.println("-----FOREACH------");
        strings.forEach(System.out::println);
        System.out.println("-------UPDATE-------");
        strings.update(1, "update");
        System.out.println(strings.get(1));
        System.out.println("-----FOREACH------");
        strings.forEach(System.out::println);
        System.out.println("-------REMOVE-------");
        strings.remove(1);
        System.out.println(strings.size());
        System.out.println("-----FOREACH------");
        strings.forEach(System.out::println);
    }
}

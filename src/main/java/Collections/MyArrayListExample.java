package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class MyArrayListExample {
  private static String fruit;
    public static void main(String[] args) {
        // Создание ArrayList
        List<String> list1 = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<>();

        // Добавление элементов в конец
        list1.add("яблоко");
        list1.add("груша");
        list1.add("слива");

        // Добавление элемента в начало
        list1.add(0, "арбуз");

        // Добавление элемента в середину
        list1.add(2, "кабачок");

        // Вывод списка
        System.out.println("MyArrayList: " + list1);
        fruit = list1.get(3); // Получаем элемент по индексу 3
        System.out.println(fruit);

        // Удаление элемента по значению
        list1.remove("яблоко");

        // Удаление элемента по индексу
        list1.remove(1);

        // Вывод списка после удаления
        System.out.println("MyArrayList после удаления: " + list1);


        // Добавление элементов в конец
        list2.add("Петя");
        list2.add("Иван");
        list2.add("Сергей");

        // Добавление элемента в начало
        list2.addFirst("Толик");

        // Добавление элемента в середину
        list2.add(2, "Дима");

        // Вывод списка
        System.out.println("LinkedList: " + list2);

        // Удаление элемента по значению
        list2.remove("Петя");

        // Удаление первого элемента
        list2.removeFirst();

        // Удаление последнего элемента
        list2.removeLast();

        // Вывод списка после удаления
        System.out.println("LinkedList после удаления: " + list2);
        list1.addAll(list2);
        System.out.println("MyArrayList после слияния коллекций: " + list1);
    }
}

// Описание переменных для списка
// ArrayList<Integer> a = new ArrayList<>();  // Динамический список, аналог Python list.
// Требует импорта java.util.ArrayList и объектно-ориентированного подхода.

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();  // Пустой список

        // Добавление элементов
        a.add(1);  // Добавляем 1
        a.add(2);  // Добавляем 2
        a.add(3);  // Добавляем 3

        // Вывод списка
        System.out.println("Содержимое списка: " + a);  // Вывод: [1, 2, 3]

        // Дополнительные операции
        System.out.println("Первый элемент: " + a.get(0));  // Первый элемент: 1
        System.out.println("Размер: " + a.size());  // Размер: 3
    }
}

// Описание переменных для стека
// Stack<Integer> m = new Stack<>();  // Встроенный класс для стека (LIFO).
// Поддерживает push(), pop(), peek() для работы с верхним элементом.

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> m = new Stack<>();  // Пустой стек

        // Push операции
        m.push(10);  // Push 10
        m.push(20);  // Push 20
        m.push(30);  // Push 30

        System.out.println("Стек после добавления: " + m);  // Вывод: [10, 20, 30]

        // Pop операция
        Integer popped = m.pop();  // Удаляем 30
        System.out.println("Удаленный элемент: " + popped);  // Вывод: 30
        System.out.println("Стек после удаления: " + m);  // Вывод: [10, 20]

        // Проверка пустоты
        if (m.empty()) {
            System.out.println("Стек пуст");
        } else {
            System.out.println("Верхний элемент: " + m.peek());  // Верх: 20
        }
    }
}

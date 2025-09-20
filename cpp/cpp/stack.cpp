// Описание переменных для стека
// std::vector<int> m;  // Вектор, используемый как стек (LIFO).
// Поддерживает push_back() для добавления и pop_back() для удаления.

#include <iostream>
#include <vector>

int main() {
    std::vector<int> m;  // Пустой стек

    // Push операции
    m.push_back(10);  // Push 10
    m.push_back(20);  // Push 20
    m.push_back(30);  // Push 30

    std::cout << "Стек после добавления: ";
    for (const auto& elem : m) {
        std::cout << elem << " ";
    }
    std::cout << std::endl;  // Вывод: 10 20 30

    // Pop операция
    m.pop_back();  // Удаляем 30
    std::cout << "Стек после удаления: ";
    for (const auto& elem : m) {
        std::cout << elem << " ";
    }
    std::cout << std::endl;  // Вывод: 10 20

    // Проверка пустоты
    if (m.empty()) {
        std::cout << "Стек пуст" << std::endl;
    } else {
        std::cout << "Верхний элемент: " << m.back() << std::endl;  // Верх: 20
    }

    return 0;
}

// Раздел документации
package com.example.app; // Оператор пакета

import java.util.ArrayList; // Оператор импорта
import java.util.List;

public class HelloWorld { // Определение класса

    // Переменные
    private String message;

    // Конструктор
    public HelloWorld(String message) {
        this.message = message;
    }

    // Метод
    public void printMessage() {
        System.out.println(message); // Тело метода
    }

    // Основной метод
    public static void main(String[] args) {
        HelloWorld greeter = new HelloWorld("Привет, мир!"); // Создание объекта класса
        greeter.printMessage(); // Вызов метода
    }
}
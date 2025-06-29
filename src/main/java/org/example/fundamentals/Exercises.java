package org.example.fundamentals;

/**
 * Практические задания по основам Java
 * ---------------------------------
 * 
 * 🎯 Цель: 
 * Научиться применять базовые концепции Java на практике
 */
public class Exercises {

    /**
     * Задание 1: Работа с переменными
     * -----------------------------
     * 
     * 💡 Создайте переменные разных типов и выведите их значения
     */
    public static void exercise1() {
        // TODO: Создайте переменные разных типов
        // Пример:
        String name = "Иван";
        int age = 25;
        double height = 1.75;
        boolean isStudent = true;
        
        // Выведите значения переменных
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Студент: " + isStudent);
    }

    /**
     * Задание 2: Математические операции
     * -------------------------------
     * 
     * 💡 Выполните различные математические операции
     */
    public static void exercise2() {
        // TODO: Выполните математические операции
        int a = 10;
        int b = 3;
        
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление: " + (a / (double)b));
        System.out.println("Остаток от деления: " + (a % b));
    }

    /**
     * Задание 3: Условные операторы
     * --------------------------
     * 
     * 💡 Используйте if-else для принятия решений
     */
    public static void exercise3(int grade) {
        // TODO: Напишите условия для оценки
        if (grade >= 90) {
            System.out.println("Отлично!");
        } else if (grade >= 70) {
            System.out.println("Хорошо!");
        } else if (grade >= 50) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Нужно больше практики");
        }
    }

    /**
     * Главный метод для запуска упражнений
     */
    public static void main(String[] args) {
        System.out.println("=== Упражнение 1 ===");
        exercise1();
        
        System.out.println("\n=== Упражнение 2 ===");
        exercise2();
        
        System.out.println("\n=== Упражнение 3 ===");
        exercise3(85);
    }
} 
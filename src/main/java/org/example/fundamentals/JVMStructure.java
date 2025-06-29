package org.example.fundamentals;

/**
 * Структура JVM и управление памятью
 * --------------------------------
 * 
 * 🎯 Цель: 
 * Понять как работает JVM и как организована память в Java
 * 
 * 📚 Структура памяти JVM:
 * 
 * 1. Heap (Куча)
 *    - Область памяти для хранения объектов
 *    - Делится на Young Generation и Old Generation
 *    - Здесь работает сборщик мусора (Garbage Collector)
 * 
 * 2. Stack (Стек)
 *    - Хранит локальные переменные и вызовы методов
 *    - Работает по принципу LIFO (Last In, First Out)
 *    - Каждый поток имеет свой стек
 * 
 * 3. Metaspace (до Java 8 - PermGen)
 *    - Хранит метаданные классов
 *    - Информация о методах и полях
 */
public class JVMStructure {
    
    // Пример для демонстрации работы со стеком
    private static void methodA() {
        System.out.println("Метод A начал выполнение");
        methodB();
        System.out.println("Метод A завершил выполнение");
    }
    
    private static void methodB() {
        System.out.println("Метод B начал выполнение");
        methodC();
        System.out.println("Метод B завершил выполнение");
    }
    
    private static void methodC() {
        System.out.println("Метод C выполняется");
    }
    
    // Пример для демонстрации работы с кучей
    static class Person {
        String name;
        int age;
        
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Демонстрация работы стека ===");
        System.out.println("Вызов методов (обратите внимание на порядок выполнения):");
        methodA();
        
        System.out.println("\n=== Демонстрация работы кучи ===");
        // Создаем объекты в куче
        Person person1 = new Person("Анна", 25);
        Person person2 = new Person("Петр", 30);
        
        System.out.println("Созданы объекты в куче:");
        System.out.println("Person 1: " + person1.name + ", " + person1.age + " лет");
        System.out.println("Person 2: " + person2.name + ", " + person2.age + " лет");
        
        // Демонстрация работы сборщика мусора
        System.out.println("\nОсвобождаем ссылки на объекты...");
        person1 = null;
        person2 = null;
        System.out.println("Объекты готовы к удалению сборщиком мусора");
        
        // Запрашиваем сборку мусора (в реальных приложениях так делать не рекомендуется!)
        System.gc();
    }
} 
package org.example.fundamentals;

/**
 * Модуль 1: Основы Java
 * ---------------------
 * 
 * 🎯 Цели модуля:
 * 1. Понять базовую структуру Java программы
 * 2. Изучить основные компоненты Java (JVM, JRE, JDK)
 * 3. Научиться работать с main методом
 * 
 * 📚 Термины:
 * - JVM (Java Virtual Machine) - Виртуальная машина Java
 * - JRE (Java Runtime Environment) - Среда выполнения Java
 * - JDK (Java Development Kit) - Инструменты разработки Java
 * - Байткод (Bytecode) - промежуточный код, который выполняет JVM
 */
public class JavaBasics {
    
    /**
     * Главный метод (точка входа) Java программы
     * -----------------------------------------
     * 
     * 💡 Это специальный метод, с которого начинается выполнение программы
     * 
     * @param args массив аргументов командной строки
     */
    public static void main(String[] args) {
        // Выводим приветственное сообщение
        System.out.println("Привет, будущий Java разработчик! 👋");
        
        // Демонстрация работы с аргументами командной строки
        if (args.length > 0) {
            System.out.println("Вы передали следующие аргументы:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
            }
        }
        
        // Демонстрация системной информации
        showSystemInfo();
    }
    
    /**
     * Вспомогательный метод для отображения информации о системе
     * --------------------------------------------------------
     * 
     * 💡 Этот метод показывает, как получить информацию о Java-окружении
     */
    private static void showSystemInfo() {
        System.out.println("\n📊 Информация о вашей Java-системе:");
        System.out.println("Java версия: " + System.getProperty("java.version"));
        System.out.println("JVM версия: " + System.getProperty("java.vm.version"));
        System.out.println("Java домашняя директория: " + System.getProperty("java.home"));
        System.out.println("Операционная система: " + System.getProperty("os.name"));
    }
} 
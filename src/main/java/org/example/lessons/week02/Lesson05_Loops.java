package org.example.lessons.week02;

/**
 * 🔄 ЗАНЯТИЕ 5: ЦИКЛЫ (for/while/do-while)
 * 
 * Циклы - это мощный инструмент для повторения кода.
 * Вместо копирования одного и того же кода много раз,
 * мы можем использовать циклы для автоматизации повторяющихся задач.
 * 
 * 💡 Жаргон разработчика:
 * - Loop (Цикл) - конструкция для повторения кода
 * - Iteration (Итерация) - одно выполнение тела цикла
 * - Iterator (Итератор) - переменная для подсчета итераций
 * - Infinite Loop (Бесконечный цикл) - цикл, который никогда не завершается
 * - Break/Continue - операторы для управления циклом
 */
public class Lesson05_Loops {
    
    public static void main(String[] args) {
        System.out.println("🔄 ИЗУЧАЕМ ЦИКЛЫ\n");
        
        // 🔢 1. ЦИКЛ FOR
        forLoop();
        
        // ⏳ 2. ЦИКЛ WHILE
        whileLoop();
        
        // 🔄 3. ЦИКЛ DO-WHILE
        doWhileLoop();
        
        // 🚀 4. ENHANCED FOR (foreach)
        learnEnhancedFor();
        
        // ⚡ 5. УПРАВЛЕНИЕ ЦИКЛАМИ
        learnLoopControl();
        
        // 🎯 6. ПРАКТИЧЕСКИЕ ЗАДАНИЯ
        practice();
    }
    
    /**
     * 🔢 ЦИКЛ FOR
     * 
     * Идеален когда знаешь количество итераций заранее.
     */
    private static void forLoop() {
        System.out.println("🔢 For цикл:");
        
        // Простой цикл
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Таблица умножения
        for (int i = 1; i <= 5; i++) {
            System.out.println("2 × " + i + " = " + (2 * i));
        }
        
        System.out.println();
    }
    
    /**
     * ⏳ ЦИКЛ WHILE
     * 
     * Используется когда не знаешь точное количество итераций.
     */
    private static void whileLoop() {
        System.out.println("⏳ While цикл:");
        
        int count = 1;
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        
        // Сумма цифр числа
        int num = 123;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Сумма цифр: " + sum);
        
        System.out.println();
    }
    
    /**
     * 🔄 ЦИКЛ DO-WHILE
     * 
     * Выполняется минимум один раз, проверка условия в конце.
     */
    private static void doWhileLoop() {
        System.out.println("🔄 Do-while цикл:");
        
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println();
        
        System.out.println();
    }
    
    /**
     * 🚀 ENHANCED FOR (foreach)
     * 
     * Удобный способ перебора массивов и коллекций.
     */
    private static void learnEnhancedFor() {
        System.out.println("🚀 Enhanced for (foreach):");
        
        // Массив чисел
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.print("Элементы массива: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Массив строк
        String[] fruits = {"яблоко", "банан", "апельсин", "киви"};
        
        System.out.println("Фрукты:");
        for (String fruit : fruits) {
            System.out.println("🍎 " + fruit);
        }
        
        // Сумма элементов массива
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.println("Сумма всех чисел: " + total);
        
        // Поиск максимального элемента
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальное число: " + max);
        
        System.out.println();
    }
    
    /**
     * ⚡ УПРАВЛЕНИЕ ЦИКЛАМИ
     * 
     * break и continue для контроля выполнения.
     */
    private static void learnLoopControl() {
        System.out.println("⚡ Управление циклами:");
        
        // break - прерывает цикл
        System.out.print("Поиск числа 7: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                System.out.print("Найдено " + i + "!");
                break;  // Выходим из цикла
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // continue - пропускает текущую итерацию
        System.out.print("Только нечетные числа: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Пропускаем четные числа
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Вложенные циклы с break
        System.out.println("Поиск в таблице умножения:");
        boolean found = false;
        
        for (int i = 1; i <= 10 && !found; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i * j == 24) {
                    System.out.printf("Найдено: %d × %d = %d%n", i, j, i * j);
                    found = true;
                    break;
                }
            }
        }
        
        // Продвинутое использование continue
        System.out.println("Анализ чисел от 1 до 20:");
        for (int i = 1; i <= 20; i++) {
            // Пропускаем числа, деленные на 3
            if (i % 3 == 0) {
                continue;
            }
            
            // Показываем только простые числа
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime && i > 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("← простые числа");
        
        System.out.println();
    }
    
    /**
     * 🎯 ПРАКТИЧЕСКИЕ ЗАДАНИЯ
     * 
     * Раскомментируй код и выполни задания!
     */
    private static void practice() {
        System.out.println("🎯 Практика:");
        
        // ЗАДАНИЕ 1: Факториал
        /*
        int n = 5;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
        */
        
        // ЗАДАНИЕ 2: Простые числа
        /*
        System.out.print("Простые числа до 20: ");
        for (int num = 2; num <= 20; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        */
        
        // ЗАДАНИЕ 3: Фибоначчи
        /*
        int a = 0, b = 1;
        System.out.print("Фибоначчи: " + a + " " + b + " ");
        for (int i = 0; i < 8; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
        */
    }
}

/*
🎓 ЧТО ТЫ ИЗУЧИЛ:

✅ For цикл - известное количество итераций
✅ While цикл - условие в начале
✅ Do-while цикл - условие в конце
✅ break и continue

💾 Сохрани:
git add .
git commit -m "Урок 5: Циклы"
*/ 
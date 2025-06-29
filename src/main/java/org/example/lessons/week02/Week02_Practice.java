package org.example.lessons.week02;

import java.util.Scanner;

/**
 * 🎯 ПРАКТИКА НЕДЕЛИ 2: УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ
 * 
 * Закрепляем знания условий, циклов и массивов через практические проекты.
 * Это твоя возможность применить все изученное на реальных задачах!
 */
public class Week02_Practice {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("🎯 ПРАКТИКА НЕДЕЛИ 2\n");
        
        guessNumberGame();
        calculator();
        arrayWork();
        gradeAnalysis();
    }
    
    private static void guessNumberGame() {
        System.out.println("🎮 Игра 'Угадай число':");
        
        int secret = 42;
        int[] guesses = {25, 50, 40, 42};
        
        for (int i = 0; i < guesses.length; i++) {
            int guess = guesses[i];
            System.out.printf("Попытка %d: %d ", i + 1, guess);
            
            if (guess == secret) {
                System.out.println("🎉 Угадал!");
                break;
            } else if (guess < secret) {
                System.out.println("↗️ Больше");
            } else {
                System.out.println("↘️ Меньше");
            }
        }
        
        System.out.println();
    }
    
    private static void calculator() {
        System.out.println("🧮 Калькулятор:");
        
        double a = 15.5, b = 4.2;
        
        System.out.printf("%.1f + %.1f = %.1f%n", a, b, a + b);
        System.out.printf("%.1f - %.1f = %.1f%n", a, b, a - b);
        System.out.printf("%.1f * %.1f = %.1f%n", a, b, a * b);
        System.out.printf("%.1f / %.1f = %.1f%n", a, b, a / b);
        
        System.out.println();
    }
    
    private static void arrayWork() {
        System.out.println("📊 Работа с массивом:");
        
        int[] numbers = {23, 45, 12, 67, 34, 89, 56};
        System.out.println("Массив: " + java.util.Arrays.toString(numbers));
        
        // Поиск min/max
        int min = numbers[0], max = numbers[0];
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        // Сумма
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + (double) sum / numbers.length);
        
        System.out.println();
    }
    
    private static void gradeAnalysis() {
        System.out.println("📈 Анализ оценок:");
        
        String[] students = {"Алексей", "Мария", "Дмитрий"};
        int[][] grades = {
            {85, 90, 78},  // Алексей
            {92, 95, 85},  // Мария
            {78, 82, 90}   // Дмитрий
        };
        
        System.out.println("Средние оценки:");
        for (int i = 0; i < students.length; i++) {
            int sum = 0;
            for (int grade : grades[i]) {
                sum += grade;
            }
            double average = (double) sum / grades[i].length;
            System.out.printf("%s: %.1f%n", students[i], average);
        }
        
        System.out.println();
    }
}

/*
🎓 ПРАКТИЧЕСКИЕ НАВЫКИ:

✅ Игровая логика с условиями
✅ Математические операции
✅ Анализ массивов
✅ Работа с многомерными массивами

💾 Сохрани:
git add .
git commit -m "Практика недели 2"
*/ 
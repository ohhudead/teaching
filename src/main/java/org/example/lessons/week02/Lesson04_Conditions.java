package org.example.lessons.week02;

/**
 * 🎯 ЗАНЯТИЕ 4: УСЛОВНЫЕ КОНСТРУКЦИИ (if/else/switch)
 * 
 * В этом занятии ты научишься управлять потоком выполнения программы.
 * Условия позволяют программе принимать решения и выполнять разный код
 * в зависимости от обстоятельств.
 * 
 * 💡 Жаргон разработчика:
 * - Control Flow (Поток управления) - порядок выполнения инструкций в программе
 * - Branch (Ветвление) - выбор одного из нескольких путей выполнения
 * - Condition (Условие) - логическое выражение, возвращающее true/false
 * - Code Block (Блок кода) - группа инструкций, заключенных в фигурные скобки {}
 */
public class Lesson04_Conditions {
    
    public static void main(String[] args) {
        System.out.println("🎯 ИЗУЧАЕМ УСЛОВНЫЕ КОНСТРУКЦИИ\n");
        
        // �� 1. ПРОСТЫЕ УСЛОВИЯ
        learnSimpleConditions();
        
        // ⛓️ 2. МНОЖЕСТВЕННЫЕ УСЛОВИЯ
        learnMultipleConditions();
        
        // 🎛️ 3. SWITCH КОНСТРУКЦИЯ
        learnSwitchStatement();
        
        // 🎯 4. ПРАКТИЧЕСКИЕ ЗАДАНИЯ
        practiceConditions();
    }
    
    /**
     * 🔀 ПРОСТЫЕ УСЛОВИЯ
     * 
     * Базовая конструкция для принятия решений.
     */
    private static void learnSimpleConditions() {
        System.out.println("🔀 Простые условия:");
        
        int age = 18;
        System.out.println("Возраст: " + age);
        
        // Простое if
        if (age >= 18) {
            System.out.println("Ты совершеннолетний!");
        }
        
        // if-else
        if (age >= 21) {
            System.out.println("Можешь употреблять алкоголь в США");
        } else {
            System.out.println("Слишком молод для алкоголя в США");
        }
        
        // Тернарный оператор
        String status = (age >= 18) ? "взрослый" : "ребенок";
        System.out.println("Статус: " + status);
        
        System.out.println();
    }
    
    /**
     * ⛓️ МНОЖЕСТВЕННЫЕ УСЛОВИЯ
     * 
     * Проверка нескольких условий по цепочке.
     */
    private static void learnMultipleConditions() {
        System.out.println("⛓️ Множественные условия:");
        
        int score = 85;
        System.out.println("Оценка: " + score + " баллов");
        
        // Определение буквенной оценки
        if (score >= 90) {
            System.out.println("Отличная работа! Оценка: A");
        } else if (score >= 80) {
            System.out.println("Хорошая работа! Оценка: B");
        } else if (score >= 70) {
            System.out.println("Неплохо! Оценка: C");
        } else if (score >= 60) {
            System.out.println("Удовлетворительно. Оценка: D");
        } else {
            System.out.println("Нужно больше учиться. Оценка: F");
        }
        
        System.out.println();
    }
    
    /**
     * 🎛️ SWITCH КОНСТРУКЦИЯ
     * 
     * Выбор одного из множества вариантов.
     */
    private static void learnSwitchStatement() {
        System.out.println("🎛️ Switch конструкция:");
        
        int dayOfWeek = 3;
        String dayName;
        
        switch (dayOfWeek) {
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 4:
                dayName = "Четверг";
                break;
            case 5:
                dayName = "Пятница";
                break;
            case 6:
                dayName = "Суббота";
                break;
            case 7:
                dayName = "Воскресенье";
                break;
            default:
                dayName = "Неизвестный день";
                break;
        }
        
        System.out.println("День " + dayOfWeek + " - это " + dayName);
        
        // Switch со строками
        String season = "весна";
        String activity = switch (season.toLowerCase()) {
            case "зима" -> "Катание на лыжах";
            case "весна" -> "Прогулки в парке";
            case "лето" -> "Плавание";
            case "осень" -> "Сбор листьев";
            default -> "Неизвестная активность";
        };
        
        System.out.println("Сезон: " + season + ", Активность: " + activity);
        
        System.out.println();
    }
    
    /**
     * 🎯 ПРАКТИЧЕСКИЕ ЗАДАНИЯ
     * 
     * Раскомментируй код и выполни задания!
     */
    private static void practiceConditions() {
        System.out.println("🎯 Твоя очередь! Раскомментируй задания:");
        
        // ЗАДАНИЕ 1: Система скидок
        /*
        double price = 1000.0;
        boolean isVip = true;
        
        double discount = isVip ? 0.15 : 0.0;
        double finalPrice = price * (1 - discount);
        
        System.out.printf("Цена: %.2f, Скидка: %.0f%%, Итого: %.2f%n", 
                         price, discount * 100, finalPrice);
        */
        
        // ЗАДАНИЕ 2: Определение времени суток
        /*
        int hour = 14;
        String timeOfDay;
        
        if (hour >= 5 && hour < 12) {
            timeOfDay = "утро";
        } else if (hour >= 12 && hour < 17) {
            timeOfDay = "день";
        } else if (hour >= 17 && hour < 22) {
            timeOfDay = "вечер";
        } else {
            timeOfDay = "ночь";
        }
        
        System.out.println("Час " + hour + " - это " + timeOfDay);
        */
        
        // ЗАДАНИЕ 3: Калькулятор
        /*
        int a = 10, b = 5;
        char operation = '+';
        
        double result = switch (operation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> b != 0 ? (double) a / b : 0;
            default -> 0;
        };
        
        System.out.printf("%d %c %d = %.2f%n", a, operation, b, result);
        */
    }
}

/*
🎓 ЧТО ТЫ ИЗУЧИЛ:

✅ Простые условия (if/else)
✅ Множественные условия (if/else if/else)
✅ Тернарный оператор (?:)
✅ Switch конструкции
✅ Практические применения

🔥 КЛЮЧЕВЫЕ МОМЕНТЫ:

💡 Используй .equals() для сравнения строк
💡 Не забывай break в switch
💡 Тернарный оператор для простых условий
💡 Новый switch более читаемый

💾 Сохрани прогресс:
git add .
git commit -m "Урок 4: Условные конструкции"

Готов к циклам? 🚀
*/ 
package org.example.lessons.week01;

/**
 * ⚡ ЗАНЯТИЕ 3: ОПЕРАТОРЫ И ВЫРАЖЕНИЯ
 * 
 * В этом занятии ты изучишь все операторы Java и научишься создавать сложные выражения.
 * Операторы - это символы, которые выполняют операции над операндами (переменными/значениями).
 * 
 * 💡 Жаргон разработчика:
 * - Операнд (Operand) - значение, над которым выполняется операция
 * - Приоритет операторов (Operator Precedence) - порядок выполнения операций
 * - Ассоциативность (Associativity) - направление выполнения операций одного приоритета
 * - Побочные эффекты (Side Effects) - изменения состояния программы
 */
public class Lesson03_Operators {
    
    public static void main(String[] args) {
        System.out.println("⚡ ИЗУЧАЕМ ОПЕРАТОРЫ И ВЫРАЖЕНИЯ\n");
        
        // 🔢 1. АРИФМЕТИЧЕСКИЕ ОПЕРАТОРЫ
        learnArithmeticOperators();
        
        // ↔️ 2. ОПЕРАТОРЫ ПРИСВАИВАНИЯ
        learnAssignmentOperators();
        
        // 🔍 3. ОПЕРАТОРЫ СРАВНЕНИЯ
        learnComparisonOperators();
        
        // 🧠 4. ЛОГИЧЕСКИЕ ОПЕРАТОРЫ
        learnLogicalOperators();
        
        // 🎯 5. ОПЕРАТОРЫ ИНКРЕМЕНТА/ДЕКРЕМЕНТА
        learnIncrementDecrementOperators();
        
        // 📊 6. ПРИОРИТЕТ ОПЕРАТОРОВ
        learnOperatorPrecedence();
        
        // 🎯 7. ПРАКТИЧЕСКИЕ ЗАДАНИЯ
        practiceOperators();

        }

    
    /**
     * 🔢 АРИФМЕТИЧЕСКИЕ ОПЕРАТОРЫ
     */
    private static void learnArithmeticOperators() {
        System.out.println("🔢 Арифметические операторы:");
        
        int a = 15;
        int b = 4;
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Сложение: a + b = " + (a + b));
        System.out.println("Вычитание: a - b = " + (a - b));
        System.out.println("Умножение: a * b = " + (a * b));
        System.out.println("Деление: a / b = " + (a / b));         // Целочисленное деление!
        System.out.println("Остаток: a % b = " + (a % b));          // Модуло операция
        
        // ВАЖНО: Деление с дробными числами
        double c = 15.0;
        double d = 4.0;
        System.out.println("Дробное деление: " + c + " / " + d + " = " + (c / d));
        
        System.out.println();
    }
    
    /**
     * ↔️ ОПЕРАТОРЫ ПРИСВАИВАНИЯ
     */
    private static void learnAssignmentOperators() {
        System.out.println("↔️ Операторы присваивания:");
        
        int x = 10;
        System.out.println("Начальное значение x = " + x);
        
        x += 7;  // x = x + 7

        System.out.println("x += 7 => x = " + x);
        
        x -= 3;  // x = x - 3
        System.out.println("x -= 3 => x = " + x);
        
        x *= 5;  // x = x * 5
        System.out.println("x *= 5 => x = " + x);
        
        x /= 5;  // x = x / 5
        System.out.println("x /= 5 => x = " + x);
        
        System.out.println();
    }
    
    /**
     * 🔍 ОПЕРАТОРЫ СРАВНЕНИЯ
     */
    private static void learnComparisonOperators() {
        System.out.println("🔍 Операторы сравнения:");
        
        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 = " + num1 + ", nem2 = " + num2);
        System.out.println("num1 == num2: " + (num1 == num2));  // Равно
        System.out.println("num1 != num2: " + (num1 != num2));  // Не равно
        System.out.println("num1 > num2: " + (num1 > num2));    // Больше
        System.out.println("num1 < num2: " + (num1 < num2));    // Меньше
        
        System.out.println();
    }
    
    /**
     * 🧠 ЛОГИЧЕСКИЕ ОПЕРАТОРЫ
     */
    private static void learnLogicalOperators() {
        System.out.println("🧠 Логические операторы:");
        
        boolean isRaining = false;
        boolean hasUmbrella = true;

        System.out.println("isRaining = " + isRaining);
        System.out.println("hasUmbrella = " + hasUmbrella);

        System.out.println("Дождь И зонт: " + (isRaining && hasUmbrella));      // AND (И)
        System.out.println("Дождь ИЛИ зонт: " + (isRaining || hasUmbrella));    // OR (ИЛИ)
        System.out.println("НЕ дождь: " + (!isRaining));                        // NOT (НЕ)

        
        // Тернарный оператор
        String advice = isRaining ? "Возьми зонт!" : "Зонт не нужен";
        System.out.println("Совет: " + advice);
        
        System.out.println();
    }
    
    /**
     * 🎯 ОПЕРАТОРЫ ИНКРЕМЕНТА/ДЕКРЕМЕНТА
     */
    private static void learnIncrementDecrementOperators() {
        System.out.println("🎯 Инкремент и декремент:");
        
        Integer counter = 5;
        counter += ++counter;
        System.out.println("Начальное значение: " + counter);
        
        System.out.println("counter++: " + counter++); // Выведет 5
        System.out.println("После постфиксного: " + counter); // Теперь 6
        
        System.out.println("++counter: " + ++counter); // Выведет 7
        System.out.println("После префиксного: " + counter); // Все еще 7
        
        System.out.println();
    }
    
    /**
     * 📊 ПРИОРИТЕТ ОПЕРАТОРОВ
     */
    private static void learnOperatorPrecedence() {
        System.out.println("📊 Приоритет операторов:");
        
        int result1 = 2 + 3 * 4;        // Умножение выполняется первым
        int result2 = (2 + 3) * 4;      // Скобки изменяют порядок
        
        System.out.println("2 + 3 * 4 = " + result1);        // 14
        System.out.println("(2 + 3) * 4 = " + result2);      // 20
        
        System.out.println();
    }
    
    /**
     * 🎯 ПРАКТИЧЕСКИЕ ЗАДАНИЯ
     */
    private static void practiceOperators() {
        System.out.println("🎯 Твоя очередь! Раскомментируй задания ниже:");
        
        // ЗАДАНИЕ 1: Калькулятор ИМТ
        double weight = 100.0; // кг
        double height = 1.75; // метры
        
        double bmi = weight / (height * height);
        System.out.printf("ИМТ: %.2f%n", bmi);
        
        String category = bmi < 25.0 ? "Нормальный вес" : "Избыточный вес";
        System.out.println("Категория: " + category);

        // ЗАДАНИЕ 2: Проверка четности
        int number = 42;
        boolean isEven = number % 2 == 0;
        String result = isEven ? "четное" : "нечетное";
        System.out.println("Число " + number + " - " + result);

        // ЗАДАНИЕ 3: Конвертер времени
        int totalSeconds = 3725;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        System.out.println(totalSeconds + " сек = " + hours + ":" + minutes + ":" + seconds);
    }
}

/*
🎓 ЧТО ТЫ ИЗУЧИЛ:

✅ Арифметические операторы (+, -, *, /, %)
✅ Операторы присваивания (=, +=, -=, *=, /=)
✅ Операторы сравнения (==, !=, <, >, <=, >=)
✅ Логические операторы (&&, ||, !)
✅ Инкремент и декремент (++, --)
✅ Тернарный оператор (?:)
✅ Приоритет операторов

🔥 КЛЮЧЕВЫЕ МОМЕНТЫ:

💡 Различай целочисленное и дробное деление
💡 Используй .equals() для сравнения строк
💡 Понимай разницу между ++i и i++
💡 Используй скобки для ясности

💾 Сохрани прогресс:
git add .
git commit -m "Урок 3: Операторы и выражения"

🎉 Поздравляю! Ты завершил первую неделю!
Готов к управляющим конструкциям? 🚀
*/ 
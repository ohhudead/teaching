package org.example.lessons.week01;

/**
 * 🔢 ЗАНЯТИЕ 2: ПЕРЕМЕННЫЕ И ТИПЫ ДАННЫХ
 * 
 * В этом занятии ты научишься работать с различными типами данных в Java.
 * Переменные - это как коробки, в которых ты хранишь данные.
 * 
 * 💡 Жаргон разработчика:
 * - Примитивные типы (Primitives) - базовые типы данных (int, double, boolean, char)
 * - Ссылочные типы (Reference types) - объекты (String, массивы, пользовательские классы)
 * - Литерал (Literal) - конкретное значение в коде (42, "Hello", true)
 * - Boxing/Unboxing - автоматическое преобразование между примитивами и их обертками
 */
public class Lesson02_Variables {
    
    public static void main(String[] args) {
        
        System.out.println("🔢 ИЗУЧАЕМ ПЕРЕМЕННЫЕ И ТИПЫ ДАННЫХ\n");
        
        // 📊 1. ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ
        learnPrimitiveTypes();
        
        // 🔤 2. СТРОКИ (STRINGS)
        learnStrings();
        
        // 🔄 3. ПРЕОБРАЗОВАНИЕ ТИПОВ
        learnTypeConversion();
        
        // 📏 4. КОНСТАНТЫ И FINAL
        learnConstants();
        
        // 🎯 5. ПРАКТИЧЕСКИЕ ЗАДАНИЯ
        practiceVariables();
    }
    
    /**
     * 📊 ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ
     * 
     * Java имеет 8 примитивных типов данных.
     * Они хранятся в стеке (Stack) - быстрая память.
     */
    private static void learnPrimitiveTypes() {
        System.out.println("📊 Примитивные типы данных:");
        
        // ЦЕЛЫЕ ЧИСЛА (Integers)
        byte smallNumber = 127;           // 8 бит: -128 до 127
        short mediumNumber = 32767;       // 16 бит: -32,768 до 32,767
        int regularNumber = 2147483647;   // 32 бита: -2 млрд до 2 млрд (чаще всего используем)
        long bigNumber = 9223372036854775807L; // 64 бита: очень большие числа (обрати внимание на L)
        
        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("int: " + regularNumber);
        System.out.println("long: " + bigNumber);
        
        // ДРОБНЫЕ ЧИСЛА (Floating Point)
        float precision = 3.14f;          // 32 бита, 7 десятичных знаков (обрати внимание на f)
        double doublePrecision = 3.141592653589793; // 64 бита, 15 десятичных знаков (по умолчанию)
        
        System.out.println("float: " + precision);
        System.out.println("double: " + doublePrecision);
        
        // ЛОГИЧЕСКИЕ ЗНАЧЕНИЯ
        boolean isJavaFun = true;         // true или false
        boolean isProgrammingHard = false;
        
        System.out.println("Java - это весело? " + isJavaFun);
        System.out.println("Программирование сложное? " + isProgrammingHard);
        
        // СИМВОЛЫ
        char firstLetter = 'J';           // Одиночные кавычки для char!
        char unicodeChar = '\u0041';      // Unicode символ (A)
        
        System.out.println("Первая буква Java: " + firstLetter);
        System.out.println("Unicode символ: " + unicodeChar);
        
        System.out.println();
    }
    
    /**
     * 🔤 СТРОКИ (STRINGS)
     * 
     * String - это НЕ примитивный тип, а класс!
     * Строки в Java неизменяемые (immutable).
     */
    private static void learnStrings() {
        System.out.println("🔤 Работа со строками:");
        
        // СОЗДАНИЕ СТРОК
        String greeting = "Привет";                    // Литерал строки
        String name = new String("Java");             // Создание через конструктор (редко используется)
        String fullGreeting = greeting + ", " + name; // Конкатенация (склеивание)
        
        System.out.println(fullGreeting);
        
        // ПОЛЕЗНЫЕ МЕТОДЫ СТРОК
        String text = "  Java Programming  ";
        
        System.out.println("Длина: " + text.length());
        System.out.println("Верхний регистр: " + text.toUpperCase());
        System.out.println("Нижний регистр: " + text.toLowerCase());
        System.out.println("Убрать пробелы: '" + text.trim() + "'");
        System.out.println("Содержит 'Java': " + text.contains("Java"));
        System.out.println("Начинается с пробела: " + text.startsWith(" "));
        
        // СРАВНЕНИЕ СТРОК (ВАЖНО!)
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        
        System.out.println("str1 == str2: " + (str1 == str2));         // true (String pool)
        System.out.println("str1 == str3: " + (str1 == str3));         // false (разные объекты)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (сравнение содержимого)
        
        // 💡 ВАЖНО: Всегда используй .equals() для сравнения строк!
        
        System.out.println();
    }
    
    /**
     * 🔄 ПРЕОБРАЗОВАНИЕ ТИПОВ
     * 
     * Типы можно преобразовывать друг в друга.
     * Бывает неявное (автоматическое) и явное преобразование.
     */
    private static void learnTypeConversion() {
        System.out.println("🔄 Преобразование типов:");
        
        // НЕЯВНОЕ ПРЕОБРАЗОВАНИЕ (Widening)
        int smallInt = 42;
        long bigLong = smallInt;        // int автоматически преобразуется в long
        double bigDouble = smallInt;    // int автоматически преобразуется в double
        
        System.out.println("int -> long: " + bigLong);
        System.out.println("int -> double: " + bigDouble);
        
        // ЯВНОЕ ПРЕОБРАЗОВАНИЕ (Casting) - может потерять данные!
        double pi = 3.14159;
        int piInt = (int) pi;           // Дробная часть отбрасывается
        
        System.out.println("double: " + pi);
        System.out.println("int (cast): " + piInt);
        
        // ПРЕОБРАЗОВАНИЕ СТРОК
        String numberString = "123";
        int numberFromString = Integer.parseInt(numberString);
        double doubleFromString = Double.parseDouble("45.67");
        
        System.out.println("String -> int: " + numberFromString);
        System.out.println("String -> double: " + doubleFromString);
        
        // ПРЕОБРАЗОВАНИЕ В СТРОКУ
        int number = 456;
        String stringFromNumber = String.valueOf(number);
        String anotherWay = "" + number;  // Хитрый способ (но лучше используй String.valueOf)
        
        System.out.println("int -> String: " + stringFromNumber);
        System.out.println("Хитрый способ: " + anotherWay);
        
        System.out.println();
    }
    
    /**
     * 📏 КОНСТАНТЫ И FINAL
     * 
     * final - ключевое слово, которое делает переменную неизменяемой.
     * Константы обычно пишут ЗАГЛАВНЫМИ_БУКВАМИ_С_ПОДЧЕРКИВАНИЯМИ.
     */
    private static void learnConstants() {
        System.out.println("📏 Константы:");
        
        final int MAX_STUDENTS = 30;           // Константа на уровне метода
        final double PI = 3.14159;             // Математическая константа
        final String COMPANY_NAME = "JavaCorp"; // Строковая константа
        
        System.out.println("Максимум студентов: " + MAX_STUDENTS);
        System.out.println("Число Пи: " + PI);
        System.out.println("Название компании: " + COMPANY_NAME);
        
        // MAX_STUDENTS = 40; // ОШИБКА! Нельзя изменить final переменную
        
        // 💡 Константы делают код более читаемым и предотвращают магические числа
        
        System.out.println();
    }
    
    /**
     * 🎯 ПРАКТИЧЕСКИЕ ЗАДАНИЯ
     * 
     * Раскомментируй код и выполни задания!
     */
    private static void practiceVariables() {
        System.out.println("🎯 Практические задания:");
        
        // ЗАДАНИЕ 1: Создай калькулятор возраста
        System.out.println("\n--- ЗАДАНИЕ 1: Калькулятор возраста ---");
        
        /*
        int currentYear = 2024;
        int birthYear = 2000; // Замени на свой год рождения
        int age = currentYear - birthYear;
        
        System.out.println("Текущий год: " + currentYear);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("Возраст: " + age + " лет");
        */
        
        // ЗАДАНИЕ 2: Работа с температурой
        System.out.println("\n--- ЗАДАНИЕ 2: Конвертер температуры ---");
        
        /*
        double celsius = 25.0;
        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
        double kelvin = celsius + 273.15;
        
        System.out.printf("%.1f°C = %.1f°F = %.1fK%n", celsius, fahrenheit, kelvin);
        */
        
        // ЗАДАНИЕ 3: Анализ строки
        System.out.println("\n--- ЗАДАНИЕ 3: Анализ текста ---");
        
        /*
        String text = "Java Programming Language";
        
        System.out.println("Исходный текст: " + text);
        System.out.println("Длина: " + text.length() + " символов");
        System.out.println("Первый символ: " + text.charAt(0));
        System.out.println("Последний символ: " + text.charAt(text.length() - 1));
        System.out.println("Содержит 'Java': " + text.contains("Java"));
        System.out.println("Верхний регистр: " + text.toUpperCase());
        System.out.println("Замена 'Java' на 'Python': " + text.replace("Java", "Python"));
        */
        
        // ЗАДАНИЕ 4: Создай профиль пользователя
        System.out.println("\n--- ЗАДАНИЕ 4: Профиль пользователя ---");
        
        /*
        String firstName = "Иван";
        String lastName = "Петров";
        int age = 25;
        double height = 1.75; // в метрах
        boolean isStudent = true;
        char grade = 'A';
        
        String fullName = firstName + " " + lastName;
        
        System.out.println("=== ПРОФИЛЬ ПОЛЬЗОВАТЕЛЯ ===");
        System.out.println("ФИО: " + fullName);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Рост: " + height + " м");
        System.out.println("Студент: " + (isStudent ? "Да" : "Нет"));
        System.out.println("Оценка: " + grade);
        */
        
        // ЗАДАНИЕ 5: Эксперименты с преобразованием
        System.out.println("\n--- ЗАДАНИЕ 5: Преобразования ---");
        
        /*
        // Попробуй различные преобразования и посмотри на результаты
        
        String strNumber = "42";
        int intFromStr = Integer.parseInt(strNumber);
        double doubleFromInt = intFromStr;
        
        System.out.println("String '" + strNumber + "' -> int " + intFromStr);
        System.out.println("int " + intFromStr + " -> double " + doubleFromInt);
        
        double bigDouble = 123.456;
        int intFromDouble = (int) bigDouble;
        
        System.out.println("double " + bigDouble + " -> int " + intFromDouble + " (потеря точности!)");
        
        // Что произойдет если попробовать Integer.parseInt("abc")?
        // Раскомментируй следующую строку и запусти (будет ошибка!):
        // int error = Integer.parseInt("abc");
        */
    }
}

/*
🎓 ЧТО ТЫ ИЗУЧИЛ В ЭТОМ ЗАНЯТИИ:

✅ 8 примитивных типов данных Java
✅ Работу со строками (String)
✅ Преобразование типов (casting)
✅ Константы и ключевое слово final
✅ Практические примеры работы с данными

🔥 КЛЮЧЕВЫЕ МОМЕНТЫ:

💡 Используй int для целых чисел (чаще всего)
💡 Используй double для дробных чисел
💡 Всегда используй .equals() для сравнения строк
💡 Константы пиши ЗАГЛАВНЫМИ_БУКВАМИ
💡 Будь осторожен с преобразованием типов - можешь потерять данные

🏆 ПРОФЕССИОНАЛЬНЫЕ СОВЕТЫ:

- byte и short используются редко, обычно int
- float тоже используется редко, обычно double
- char используется редко, обычно String
- Всегда проверяй границы типов данных
- Используй final для значений, которые не должны изменяться

🛠️ ЗАДАНИЯ ДЛЯ САМОСТОЯТЕЛЬНОЙ РАБОТЫ:

1. Создай конвертер валют (рубли <-> доллары)
2. Напиши программу для вычисления площади и периметра прямоугольника
3. Создай генератор имени пользователя из имени и фамилии
4. Поэкспериментируй с Unicode символами

💾 Не забудь сохранить прогресс:
git add .
git commit -m "Урок 2: Переменные и типы данных"

Готов к следующему занятию? Переходи к Lesson03_Operators! 🚀
*/ 
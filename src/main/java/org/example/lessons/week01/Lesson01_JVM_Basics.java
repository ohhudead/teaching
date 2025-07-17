package org.example.lessons.week01;

/**
 * 🚀 ЗАНЯТИЕ 1: JVM И ПЕРВАЯ ПРОГРАММА
 * 
 * Привет! Добро пожаловать в мир Java! 
 * В этом занятии ты узнаешь как работает Java и напишешь свою первую программу.
 * 
 * 💡 Жаргон разработчика:
 * - JVM (Java Virtual Machine) - виртуальная машина, которая выполняет Java код
 * - Байт-код (Bytecode) - промежуточный код, в который компилируется Java
 * - Runtime - время выполнения программы
 */
public class Lesson01_JVM_Basics {
    
    /**
     * 🔥 ГЛАВНЫЙ МЕТОД - ТОЧКА ВХОДА
     * 
     * Каждая Java программа начинается с метода main().
     * Это как входная дверь в твою программу.
     * 
     * Разберем подпись метода:
     * - public: доступен всем (модификатор доступа)
     * - static: можно вызвать без создания объекта класса
     * - void: ничего не возвращает
     * - String[] args: массив аргументов командной строки
     */
    public static void main(String[] args) {
        
        // 📝 1. ТВОЯ ПЕРВАЯ ПРОГРАММА
        System.out.println("Привет, мир Java! 🚀");
        
        // 💡 System.out.println() - выводит текст в консоль с переносом строки
        // System.out.print() - выводит без переноса
        
        System.out.print("Это ");
        System.out.print("одна ");
        System.out.println("строка!");
        
        // 🔥 2. КАК РАБОТАЕТ JAVA (упрощенно)
        explainJavaExecution();
        
        // 💪 3. ПРАКТИЧЕСКИЕ ПРИМЕРЫ
        practicalExamples();
        
        // 🎯 4. ТВОЯ ОЧЕРЕДЬ!
        yourTurn();
    }
    
    /**
     * 🧠 КАК РАБОТАЕТ JAVA
     * 
     * Java код -> Компилятор (javac) -> Байт-код (.class) -> JVM -> Машинный код
     * 
     * Преимущества:
     * - "Напиши один раз, запускай везде" (Write Once, Run Anywhere - WORA)
     * - Автоматическое управление памятью (Garbage Collection)
     * - Безопасность
     */
    private static void explainJavaExecution() {
        System.out.println("\n🧠 Как работает Java:");
        System.out.println("1. Ты пишешь код (.java файл)");
        System.out.println("2. Компилятор javac создает байт-код (.class файл)");
        System.out.println("3. JVM выполняет байт-код на любой платформе");
        System.out.println("4. Profit! Твоя программа работает! 💰");
    }
    
    /**
     * 💪 ПРАКТИЧЕСКИЕ ПРИМЕРЫ
     */
    private static void practicalExamples() {
        System.out.println("\n💪 Практические примеры:");
        
        // Вывод переменной
        String myName = "Java Developer";
        System.out.println("Меня зовут: " + myName);
        
        // Вывод чисел
        int favoriteNumber = 42;
        System.out.println("Мое любимое число: " + favoriteNumber);
        
        // Форматированный вывод
        System.out.printf("Привет, %s! Тебе %d лет?%n", "студент", 20);
        
        // Спецсимволы
        System.out.println("Табуляция:\tтекст");
        System.out.println("Новая строка:\nновая строка");
        System.out.println("Кавычки: \"Привет\"");
    }
    
    /**
     * 🎯 ТВОЯ ОЧЕРЕДЬ - ПРАКТИЧЕСКИЕ ЗАДАНИЯ
     * 
     * Раскомментируй код ниже и выполни задания.
     * Используй Ctrl+/ для быстрого комментирования/раскомментирования!
     */
    private static void yourTurn() {
        System.out.println("\n🎯 Твоя очередь!");
        
//         ЗАДАНИЕ 1: Выведи информацию о себе
//         Создай переменные с твоим именем, возрастом и любимым языком программирования
        
        String myName = "Иван Гжибовский";
        int myAge = 23;
        String favoriteLang = "Java";

        System.out.println("Привет! Меня зовут " + myName);
        System.out.println("Мне " + myAge + " лет");
        System.out.println("Мой любимый язык программирования: " + favoriteLang);

        // ЗАДАНИЕ 2: Создай ASCII арт
        // Выведи свои инициалы или простой рисунок используя символы
        
        System.out.println("  *** ");
        System.out.println(" *   *");
        System.out.println("*     *");
        System.out.println(" *   *");
        System.out.println("  *** ");

        // ЗАДАНИЕ 3: Поэкспериментируй с printf
        // Используй различные спецификаторы формата
        
        String product = "Java книга";
        double price = 1299.99;
        int quantity = 3;
        
        System.out.printf("Товар: %s%n", product);
        System.out.printf("Цена: %.2f руб%n", price);
        System.out.printf("Количество: %d шт%n", quantity);
        System.out.printf("Итого: %.2f руб%n", price * quantity);
    }
}

/*
🎓 ЧТО ТЫ ИЗУЧИЛ В ЭТОМ ЗАНЯТИИ:

✅ Структуру Java программы
✅ Метод main() - точку входа
✅ Как работает JVM
✅ Основы вывода в консоль
✅ Простейшие переменные

🔥 СЛЕДУЮЩИЕ ШАГИ:

1. Запусти эту программу в IntelliJ IDEA:
   - Кликни правой кнопкой на класс
   - Выбери "Run 'Lesson01_JVM_Basics.main()'"
   - Или используй Shift+F10

2. Выполни все задания (раскомментируй код)

3. Поэкспериментируй:
   - Измени текст сообщений
   - Добавь свои println
   - Попробуй разные спецсимволы

4. Зафиксируй прогресс в Git:
   git add .
   git commit -m "Урок 1: Основы JVM и первая программа"

🏆 ПРОФЕССИОНАЛЬНЫЕ СОВЕТЫ:

- Всегда используй осмысленные имена переменных
- Пиши код так, чтобы его понял другой разработчик
- Не бойся экспериментировать!

Готов к следующему занятию? Переходи к Lesson02_Variables! 🚀
*/

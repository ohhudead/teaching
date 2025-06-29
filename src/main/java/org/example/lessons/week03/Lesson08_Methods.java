package org.example.lessons.week03;

/**
 * ⚙️ ЗАНЯТИЕ 8: МЕТОДЫ В ДЕТАЛЯХ
 * 
 * Методы - это "глаголы" вашей программы. Они определяют, что объекты могут ДЕЛАТЬ.
 * Это функции, но с суперсилами! Они могут работать с данными объекта и между собой.
 * 
 * 💡 Жаргон разработчика:
 * - Method signature (Сигнатура метода) - имя + параметры
 * - Parameters (Параметры) - входные данные метода
 * - Arguments (Аргументы) - конкретные значения параметров
 * - Return type (Тип возвращаемого значения) - что метод выдает
 * - Overloading (Перегрузка) - несколько методов с одним именем
 * - Void (Войд) - метод ничего не возвращает
 * - Static (Статический) - метод принадлежит классу, а не объекту
 */
public class Lesson08_Methods {
    
    public static void main(String[] args) {
        System.out.println("⚙️ ИЗУЧАЕМ МЕТОДЫ В ДЕТАЛЯХ\n");
        
        learnBasicMethods();
        learnParametersAndReturnValues();
        learnMethodOverloading();
        learnStaticMethods();
        practiceAdvancedMethods();
    }
    
    /**
     * 🔧 БАЗОВЫЕ МЕТОДЫ
     */
    private static void learnBasicMethods() {
        System.out.println("🔧 Базовые методы:");
        
        Calculator calc = new Calculator();
        
        // Методы без параметров
        calc.displayWelcome();
        calc.showFeatures();
        
        // Методы с параметрами
        calc.setOwner("Алексей");
        calc.displayOwner();
        
        System.out.println();
    }
    
    private static void learnParametersAndReturnValues() {
        System.out.println("📥📤 Параметры и возвращаемые значения:");
        
        MathUtils math = new MathUtils();
        
        // Методы с разными типами возвращаемых значений
        int sum = math.add(15, 25);
        double average = math.calculateAverage(10, 20, 30);
        boolean isEven = math.isEven(42);
        String result = math.compareNumbers(15, 25);
        
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + average);
        System.out.println("42 четное? " + isEven);
        System.out.println("Сравнение: " + result);
        
        // Методы с несколькими параметрами
        int max = math.findMax(45, 67, 23, 89, 12);
        System.out.println("Максимум из чисел: " + max);
        
        double power = math.power(2, 8);
        System.out.println("2 в степени 8 = " + power);
        
        System.out.println();
    }
    
    private static void learnMethodOverloading() {
        System.out.println("🔄 Перегрузка методов:");
        
        Printer printer = new Printer();
        
        // Один и тот же метод, но с разными параметрами
        printer.print("Простой текст");
        printer.print("Важное сообщение", true);
        printer.print("Ошибка: файл не найден", "ERROR");
        printer.print(42);
        printer.print(3.14159);
        printer.print(new String[]{"Первая строка", "Вторая строка", "Третья строка"});
        
        System.out.println();
    }
    
    private static void learnStaticMethods() {
        System.out.println("⚡ Статические методы:");
        
        // Вызываем статические методы без создания объекта
        String formatted = StringUtils.formatName("  иван  ", "  петров  ");
        System.out.println("Отформатированное имя: " + formatted);
        
        boolean isValid = StringUtils.isValidEmail("user@example.com");
        System.out.println("Email валидный? " + isValid);
        
        String password = StringUtils.generatePassword(12);
        System.out.println("Сгенерированный пароль: " + password);
        
        // Математические утилиты
        int factorial = MathUtils.calculateFactorial(5);
        System.out.println("5! = " + factorial);
        
        boolean isPrime = MathUtils.isPrime(17);
        System.out.println("17 простое число? " + isPrime);
        
        System.out.println();
    }
    
    private static void practiceAdvancedMethods() {
        System.out.println("🎯 Продвинутая практика с методами:");
        
        // Создаем игровой персонаж
        GameCharacter hero = new GameCharacter();
        hero.setName("Арагорн");
        hero.setLevel(1);
        hero.setHealth(100);
        hero.setMana(50);
        
        hero.displayStatus();
        
        // Применяем разные действия
        hero.attack("Орк");
        hero.castSpell("Исцеление", 20);
        hero.rest();
        hero.levelUp();
        
        hero.displayStatus();
        
        // Проверяем состояние
        if (hero.canFight()) {
            System.out.println(hero.getName() + " готов к бою!");
        }
        
        System.out.println();
    }
}

/**
 * 🧮 КАЛЬКУЛЯТОР
 * Демонстрирует простые методы
 */
class Calculator {
    private String owner;
    
    // Метод без параметров и возвращаемого значения
    void displayWelcome() {
        System.out.println("🧮 Добро пожаловать в Калькулятор 3000!");
    }
    
    void showFeatures() {
        System.out.println("📋 Функции: сложение, вычитание, умножение, деление");
    }
    
    // Метод с параметром, но без возвращаемого значения
    void setOwner(String name) {
        this.owner = name;
        System.out.println("✅ Владелец установлен: " + name);
    }
    
    void displayOwner() {
        if (owner != null) {
            System.out.println("👤 Владелец калькулятора: " + owner);
        } else {
            System.out.println("❌ Владелец не установлен");
        }
    }
}

/**
 * 🔢 МАТЕМАТИЧЕСКИЕ УТИЛИТЫ
 * Демонстрирует методы с параметрами и возвращаемыми значениями
 */
class MathUtils {
    
    // Метод с двумя параметрами, возвращает int
    int add(int a, int b) {
        int result = a + b;
        System.out.printf("🔢 %d + %d = %d%n", a, b, result);
        return result;
    }
    
    // Метод с переменным количеством параметров, возвращает double
    double calculateAverage(int... numbers) {
        if (numbers.length == 0) return 0;
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
    
    // Метод возвращает boolean
    boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    // Метод возвращает String
    String compareNumbers(int a, int b) {
        if (a > b) return a + " больше " + b;
        if (a < b) return a + " меньше " + b;
        return a + " равно " + b;
    }
    
    // Метод с несколькими параметрами
    int findMax(int... numbers) {
        if (numbers.length == 0) return 0;
        
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    // Метод с вычислениями
    double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    
    // Статические методы (принадлежат классу, а не объекту)
    static int calculateFactorial(int n) {
        if (n <= 1) return 1;
        
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

/**
 * 🖨️ ПРИНТЕР
 * Демонстрирует перегрузку методов
 */
class Printer {
    
    // Перегруженные методы print - одно имя, разные параметры
    
    void print(String text) {
        System.out.println("📄 " + text);
    }
    
    void print(String text, boolean important) {
        if (important) {
            System.out.println("⚠️ ВАЖНО: " + text.toUpperCase());
        } else {
            System.out.println("📄 " + text);
        }
    }
    
    void print(String text, String level) {
        String prefix = switch (level.toUpperCase()) {
            case "ERROR" -> "❌ ОШИБКА: ";
            case "WARNING" -> "⚠️ ПРЕДУПРЕЖДЕНИЕ: ";
            case "INFO" -> "ℹ️ ИНФОРМАЦИЯ: ";
            default -> "📄 ";
        };
        System.out.println(prefix + text);
    }
    
    void print(int number) {
        System.out.println("🔢 Число: " + number);
    }
    
    void print(double number) {
        System.out.printf("🔢 Дробное число: %.2f%n", number);
    }
    
    void print(String[] lines) {
        System.out.println("📋 Список строк:");
        for (int i = 0; i < lines.length; i++) {
            System.out.printf("  %d. %s%n", i + 1, lines[i]);
        }
    }
}

/**
 * 🔤 СТРОКОВЫЕ УТИЛИТЫ
 * Демонстрирует статические методы
 */
class StringUtils {
    
    // Статические методы - вызываются через имя класса
    
    static String formatName(String firstName, String lastName) {
        String formattedFirst = firstName.trim().toLowerCase();
        String formattedLast = lastName.trim().toLowerCase();
        
        // Делаем первую букву заглавной
        formattedFirst = formattedFirst.substring(0, 1).toUpperCase() + 
                        formattedFirst.substring(1);
        formattedLast = formattedLast.substring(0, 1).toUpperCase() + 
                       formattedLast.substring(1);
        
        return formattedFirst + " " + formattedLast;
    }
    
    static boolean isValidEmail(String email) {
        return email != null && 
               email.contains("@") && 
               email.contains(".") &&
               email.length() > 5;
    }
    
    static String generatePassword(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * chars.length());
            password.append(chars.charAt(index));
        }
        
        return password.toString();
    }
}

/**
 * 🗡️ ИГРОВОЙ ПЕРСОНАЖ
 * Комплексный пример использования методов
 */
class GameCharacter {
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int mana;
    private int maxMana;
    
    // Геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }
    
    public void setLevel(int level) {
        this.level = level;
        this.maxHealth = 100 + (level - 1) * 20;
        this.maxMana = 50 + (level - 1) * 10;
    }
    
    public void setHealth(int health) {
        this.health = Math.min(health, maxHealth);
    }
    
    public void setMana(int mana) {
        this.mana = Math.min(mana, maxMana);
    }
    
    public String getName() { return name; }
    public int getLevel() { return level; }
    public int getHealth() { return health; }
    public int getMana() { return mana; }
    
    // Игровые методы
    public void attack(String target) {
        if (!canFight()) {
            System.out.println("❌ " + name + " слишком слаб для атаки!");
            return;
        }
        
        int damage = calculateDamage();
        System.out.printf("⚔️ %s атакует %s и наносит %d урона!%n", name, target, damage);
        
        // Атака тратит немного здоровья
        takeDamage(5);
    }
    
    public void castSpell(String spellName, int manaCost) {
        if (mana < manaCost) {
            System.out.println("❌ Недостаточно маны для заклинания " + spellName);
            return;
        }
        
        mana -= manaCost;
        
        switch (spellName.toLowerCase()) {
            case "исцеление" -> {
                int healing = 30;
                heal(healing);
                System.out.printf("✨ %s использует %s и восстанавливает %d здоровья%n", 
                                name, spellName, healing);
            }
            case "огненный шар" -> {
                int damage = 50;
                System.out.printf("🔥 %s бросает %s и наносит %d урона!%n", 
                                name, spellName, damage);
            }
            default -> System.out.println("❓ Неизвестное заклинание: " + spellName);
        }
    }
    
    public void rest() {
        System.out.println("😴 " + name + " отдыхает...");
        heal(20);
        restoreMana(15);
        System.out.println("💚 Здоровье и мана частично восстановлены");
    }
    
    public void levelUp() {
        level++;
        int oldMaxHealth = maxHealth;
        int oldMaxMana = maxMana;
        
        setLevel(level);
        health = maxHealth; // Полное восстановление при повышении уровня
        mana = maxMana;
        
        System.out.printf("🎉 %s повышает уровень до %d!%n", name, level);
        System.out.printf("📈 Максимальное здоровье: %d -> %d%n", oldMaxHealth, maxHealth);
        System.out.printf("📈 Максимальная мана: %d -> %d%n", oldMaxMana, maxMana);
    }
    
    public void displayStatus() {
        System.out.println("==================");
        System.out.printf("🗡️ %s (Уровень %d)%n", name, level);
        System.out.printf("❤️ Здоровье: %d/%d%n", health, maxHealth);
        System.out.printf("💙 Мана: %d/%d%n", mana, maxMana);
        System.out.println("==================");
    }
    
    // Вспомогательные методы
    private int calculateDamage() {
        int baseDamage = 10 + level * 5;
        int randomBonus = (int) (Math.random() * 10);
        return baseDamage + randomBonus;
    }
    
    private void takeDamage(int damage) {
        health = Math.max(0, health - damage);
    }
    
    private void heal(int amount) {
        health = Math.min(maxHealth, health + amount);
    }
    
    private void restoreMana(int amount) {
        mana = Math.min(maxMana, mana + amount);
    }
    
    public boolean canFight() {
        return health > 20; // Нужно минимум 20 здоровья для боя
    }
}

/*
🎓 ЧТО ТЫ ИЗУЧИЛ:

✅ Анатомия метода (сигнатура, параметры, возврат)
✅ Методы с параметрами и без
✅ Возвращаемые значения разных типов
✅ Перегрузка методов (overloading)
✅ Статические методы (static)
✅ Переменное количество аргументов (varargs)
✅ Приватные вспомогательные методы

🔥 КЛЮЧЕВЫЕ КОНЦЕПЦИИ:

💡 Методы определяют поведение объектов
💡 Сигнатура = имя + типы параметров
💡 Перегрузка позволяет одно имя, разные параметры
💡 static методы принадлежат классу, не объекту
💡 varargs принимает любое количество аргументов
💡 private методы скрывают детали реализации

🏆 ПРИНЦИПЫ ДИЗАЙНА МЕТОДОВ:

- Одна ответственность (SRP)
- Понятные имена (clean code)
- Минимум параметров
- Предсказуемое поведение
- Правильный уровень абстракции

💾 Сохрани прогресс:
git add .
git commit -m "Урок 8: Методы в деталях"

Готов изучать конструкторы? 🏗️
*/ 
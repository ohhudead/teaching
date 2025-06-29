package org.example.lessons.week03;

/**
 * 🏗️ ЗАНЯТИЕ 9: КОНСТРУКТОРЫ
 * 
 * Конструкторы - это "строители" объектов. Они выполняются при создании объекта
 * и настраивают его начальное состояние. Это ваши первые помощники в ООП!
 * 
 * 💡 Жаргон разработчика:
 * - Constructor (Конструктор) - специальный метод для создания объекта
 * - Default constructor (Конструктор по умолчанию) - без параметров
 * - Parameterized constructor (Параметризованный конструктор) - с параметрами
 * - Constructor overloading (Перегрузка конструкторов) - несколько вариантов
 * - this() - вызов другого конструктора этого же класса
 * - Initialization (Инициализация) - задание начальных значений
 */
public class Lesson09_Constructors {
    
    public static void main(String[] args) {
        System.out.println("🏗️ ИЗУЧАЕМ КОНСТРУКТОРЫ\n");
        
        learnDefaultConstructor();
        learnParameterizedConstructor();
        learnConstructorOverloading();
        learnConstructorChaining();
        practiceConstructors();
    }
    
    /**
     * 🔧 КОНСТРУКТОР ПО УМОЛЧАНИЮ
     */
    private static void learnDefaultConstructor() {
        System.out.println("🔧 Конструктор по умолчанию:");
        
        // Используем конструктор по умолчанию
        SimplePerson person1 = new SimplePerson();
        person1.introduce();
        
        // Если мы не написали конструктор, Java создает его автоматически
        EmptyClass empty = new EmptyClass();
        System.out.println("Пустой объект создан: " + empty);
        
        System.out.println();
    }
    
    private static void learnParameterizedConstructor() {
        System.out.println("⚙️ Параметризованный конструктор:");
        
        // Создаем объекты с данными сразу при создании
        Person person1 = new Person("Анна", 25);
        Person person2 = new Person("Иван", 30);
        
        person1.introduce();
        person2.introduce();
        
        // Создаем автомобили
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("BMW", "X5", 2023);
        
        car1.showInfo();
        car2.showInfo();
        
        System.out.println();
    }
    
    private static void learnConstructorOverloading() {
        System.out.println("🔄 Перегрузка конструкторов:");
        
        // Разные способы создания студентов
        Student student1 = new Student(); // По умолчанию
        Student student2 = new Student("Мария"); // Только имя
        Student student3 = new Student("Алексей", 20); // Имя и возраст
        Student student4 = new Student("Дарья", 19, "Информатика"); // Все данные
        
        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        
        System.out.println();
    }
    
    private static void learnConstructorChaining() {
        System.out.println("🔗 Цепочка конструкторов:");
        
        // Демонстрируем вызов конструкторов друг из друга
        BankAccount account1 = new BankAccount(); // Базовый
        BankAccount account2 = new BankAccount("Иван Петров"); // С владельцем
        BankAccount account3 = new BankAccount("Анна Сидорова", 1000); // С балансом
        
        account1.showAccountInfo();
        account2.showAccountInfo();
        account3.showAccountInfo();
        
        System.out.println();
    }
    
    private static void practiceConstructors() {
        System.out.println("🎯 Практика с конструкторами:");
        
        // Создаем команду разработчиков
        Developer[] team = {
            new Developer("Алексей", "Senior", "Java"),
            new Developer("Мария", "Middle", "Python"),
            new Developer("Игорь", "Junior", "JavaScript"),
            new Developer("Елена") // Только имя, остальное по умолчанию
        };
        
        System.out.println("👥 Наша команда разработчиков:");
        for (Developer dev : team) {
            dev.introduce();
        }
        
        // Создаем игру
        Game game = new Game("Космические приключения", 4, 60);
        game.showGameInfo();
        game.startGame();
        
        System.out.println();
    }
}

/**
 * 👤 ПРОСТОЙ ЧЕЛОВЕК
 * Демонстрирует конструктор по умолчанию
 */
class SimplePerson {
    private String name;
    private int age;
    
    // Конструктор по умолчанию
    public SimplePerson() {
        this.name = "Неизвестно";
        this.age = 0;
        System.out.println("🆕 Создан человек с данными по умолчанию");
    }
    
    public void introduce() {
        System.out.printf("👋 Привет! Меня зовут %s, мне %d лет%n", name, age);
    }
}

/**
 * 📝 ПУСТОЙ КЛАСС
 * Java автоматически создает конструктор по умолчанию
 */
class EmptyClass {
    // Здесь нет ни одного конструктора, но Java создаст его автоматически
    // Эквивалент: public EmptyClass() { }
}

/**
 * 👥 ЧЕЛОВЕК
 * Демонстрирует параметризованный конструктор
 */
class Person {
    private String name;
    private int age;
    
    // Параметризованный конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.printf("🆕 Создан человек: %s (%d лет)%n", name, age);
    }
    
    public void introduce() {
        System.out.printf("👋 Привет! Меня зовут %s, мне %d лет%n", name, age);
    }
}

/**
 * 🚗 АВТОМОБИЛЬ
 * Показывает инициализацию всех полей через конструктор
 */
class Car {
    private String brand;
    private String model;
    private int year;
    private boolean isRunning;
    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isRunning = false; // Начальное состояние
        System.out.printf("🆕 Создан автомобиль: %s %s %d года%n", brand, model, year);
    }
    
    public void showInfo() {
        System.out.printf("🚗 %s %s %d года (состояние: %s)%n", 
                         brand, model, year, isRunning ? "заведена" : "заглушена");
    }
}

/**
 * 🎓 СТУДЕНТ
 * Демонстрирует перегрузку конструкторов
 */
class Student {
    private String name;
    private int age;
    private String major;
    
    // Конструктор по умолчанию
    public Student() {
        this.name = "Новый студент";
        this.age = 18;
        this.major = "Не определено";
        System.out.println("🆕 Создан студент с данными по умолчанию");
    }
    
    // Конструктор только с именем
    public Student(String name) {
        this.name = name;
        this.age = 18;
        this.major = "Не определено";
        System.out.printf("🆕 Создан студент: %s%n", name);
    }
    
    // Конструктор с именем и возрастом
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.major = "Не определено";
        System.out.printf("🆕 Создан студент: %s (%d лет)%n", name, age);
    }
    
    // Полный конструктор
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
        System.out.printf("🆕 Создан студент: %s (%d лет), специальность: %s%n", 
                         name, age, major);
    }
    
    public void showInfo() {
        System.out.printf("📋 Студент: %s, %d лет, специальность: %s%n", 
                         name, age, major);
    }
}

/**
 * 🏦 БАНКОВСКИЙ СЧЕТ
 * Демонстрирует цепочку конструкторов (constructor chaining)
 */
class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    
    // Базовый конструктор
    public BankAccount() {
        this("UNKNOWN", "Неизвестный владелец", 0.0);
        System.out.println("🆕 Создан счет с данными по умолчанию");
    }
    
    // Конструктор с владельцем
    public BankAccount(String ownerName) {
        this(generateAccountNumber(), ownerName, 0.0);
        System.out.printf("🆕 Создан счет для %s%n", ownerName);
    }
    
    // Конструктор с владельцем и балансом
    public BankAccount(String ownerName, double initialBalance) {
        this(generateAccountNumber(), ownerName, initialBalance);
        System.out.printf("🆕 Создан счет для %s с балансом %.2f%n", 
                         ownerName, initialBalance);
    }
    
    // Главный конструктор - вызывается всеми остальными
    private BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    
    // Вспомогательный метод для генерации номера счета
    private static String generateAccountNumber() {
        return "ACC-" + (int)(Math.random() * 100000);
    }
    
    public void showAccountInfo() {
        System.out.printf("💳 Счет %s | Владелец: %s | Баланс: %.2f руб%n", 
                         accountNumber, ownerName, balance);
    }
}

/**
 * 💻 РАЗРАБОТЧИК
 * Комплексный пример с валидацией в конструкторах
 */
class Developer {
    private String name;
    private String level; // Junior, Middle, Senior
    private String language;
    private int experienceYears;
    
    // Конструктор только с именем
    public Developer(String name) {
        this(name, "Junior", "Java");
    }
    
    // Конструктор с уровнем и языком
    public Developer(String name, String level, String language) {
        this.name = validateName(name);
        this.level = validateLevel(level);
        this.language = validateLanguage(language);
        this.experienceYears = calculateExperience(level);
        
        System.out.printf("🆕 Создан разработчик: %s (%s %s разработчик)%n", 
                         name, level, language);
    }
    
    // Валидация имени
    private String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Неизвестный разработчик";
        }
        return name.trim();
    }
    
    // Валидация уровня
    private String validateLevel(String level) {
        return switch (level.toLowerCase()) {
            case "junior", "middle", "senior" -> 
                level.substring(0, 1).toUpperCase() + level.substring(1).toLowerCase();
            default -> "Junior";
        };
    }
    
    // Валидация языка программирования
    private String validateLanguage(String language) {
        if (language == null || language.trim().isEmpty()) {
            return "Java";
        }
        return language;
    }
    
    // Расчет опыта по уровню
    private int calculateExperience(String level) {
        return switch (level.toLowerCase()) {
            case "junior" -> (int)(Math.random() * 2) + 1; // 1-2 года
            case "middle" -> (int)(Math.random() * 3) + 3; // 3-5 лет
            case "senior" -> (int)(Math.random() * 5) + 6; // 6-10 лет
            default -> 1;
        };
    }
    
    public void introduce() {
        System.out.printf("👨‍💻 %s - %s %s разработчик (опыт: %d лет)%n", 
                         name, level, language, experienceYears);
    }
}

/**
 * 🎮 ИГРА
 * Демонстрирует инициализацию сложного объекта
 */
class Game {
    private String title;
    private int maxPlayers;
    private int timeLimit; // в минутах
    private boolean isActive;
    private int currentPlayers;
    
    public Game(String title, int maxPlayers, int timeLimit) {
        this.title = title;
        this.maxPlayers = maxPlayers;
        this.timeLimit = timeLimit;
        this.isActive = false;
        this.currentPlayers = 0;
        
        System.out.printf("🆕 Создана игра: \"%s\"(макс. игроков: %d, время: %d мин)%n", 
                         title, maxPlayers, timeLimit);
    }
    
    public void showGameInfo() {
        System.out.printf("🎮 Игра: \"%s\"| Игроков: %d/%d | Время: %d мин | Статус: %s%n", 
                         title, currentPlayers, maxPlayers, timeLimit,
                         isActive ? "Активна" : "Ожидание");
    }
    
    public void startGame() {
        if (!isActive) {
            isActive = true;
            System.out.println("🚀 Игра \"" + title + "\" началась!");
        } else {
            System.out.println("⚠️ Игра уже активна");
        }
    }
}

/*
🎓 ЧТО ТЫ ИЗУЧИЛ:

✅ Конструкторы по умолчанию и параметризованные
✅ Перегрузка конструкторов (несколько вариантов)
✅ Цепочка конструкторов (this())
✅ Валидация данных в конструкторах
✅ Инициализация полей и начального состояния
✅ Автоматическое создание конструктора Java

🔥 КЛЮЧЕВЫЕ КОНЦЕПЦИИ:

💡 Конструктор = специальный метод инициализации
💡 Имя конструктора = имя класса
💡 Конструкторы не имеют возвращаемого типа
💡 this() вызывает другой конструктор
💡 Если нет конструктора, Java создает пустой
💡 Перегрузка дает гибкость создания объектов

🏆 ПРИНЦИПЫ ХОРОШИХ КОНСТРУКТОРОВ:

- Инициализируют ВСЕ поля объекта
- Валидируют входные данные
- Устанавливают логичные значения по умолчанию
- Не выполняют сложную логику
- Используют цепочку для избежания дублирования

💾 Сохрани прогресс:
git add .
git commit -m "Урок 9: Конструкторы"

Готов к практическому занятию? 🎯
*/ 
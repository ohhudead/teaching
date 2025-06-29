package org.example.lessons.week04;

/**
 * 🧬 ЗАНЯТИЕ 10: НАСЛЕДОВАНИЕ
 * 
 * Наследование - это мощный механизм ООП, который позволяет создавать новые классы
 * на основе существующих. Как дети наследуют черты родителей, так и классы могут
 * наследовать поля и методы от других классов.
 * 
 * 💡 Жаргон разработчика:
 * - Inheritance (Наследование) - создание класса на основе другого
 * - Parent/Base/Super class (Родительский/базовый/супер класс) - класс-донор
 * - Child/Derived/Sub class (Дочерний/производный/под класс) - класс-наследник
 * - extends (расширяет) - ключевое слово для наследования
 * - super - ссылка на родительский класс
 * - Override (Переопределение) - замена поведения родительского метода
 * - IS-A relationship (отношение "является") - основа наследования
 */
public class Lesson10_Inheritance {
    
    public static void main(String[] args) {
        System.out.println("🧬 ИЗУЧАЕМ НАСЛЕДОВАНИЕ\n");
        
        learnBasicInheritance();
        learnMethodOverriding();
        learnSuperKeyword();
        learnInheritanceHierarchy();
        practiceInheritance();
    }
    
    /**
     * 🌳 БАЗОВОЕ НАСЛЕДОВАНИЕ
     */
    private static void learnBasicInheritance() {
        System.out.println("🌳 Базовое наследование:");
        
        // Создаем объекты разных классов
        Animal animal = new Animal("Животное", 5);
        Dog dog = new Dog("Рекс", 3, "Немецкая овчарка");
        Cat cat = new Cat("Мурка", 2, "Черно-белая");
        
        // Все унаследовали методы от Animal
        animal.displayInfo();
        animal.eat();
        animal.sleep();
        
        System.out.println();
        
        dog.displayInfo(); // Переопределенный метод
        dog.eat();         // Унаследованный метод
        dog.bark();        // Собственный метод Dog
        
        System.out.println();
        
        cat.displayInfo(); // Переопределенный метод
        cat.sleep();       // Унаследованный метод
        cat.purr();        // Собственный метод Cat
        
        System.out.println();
    }
    
    private static void learnMethodOverriding() {
        System.out.println("🔄 Переопределение методов:");
        
        // Создаем разные виды транспорта
        Vehicle[] vehicles = {
            new Vehicle("Транспорт", 50),
            new Car("Автомобиль", 120, 4),
            new Bicycle("Велосипед", 25, "Горный")
        };
        
        // Каждый класс переопределяет метод start() по-своему
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.start();     // Полиморфизм в действии!
            vehicle.accelerate();
            vehicle.stop();
            System.out.println();
        }
    }
    
    private static void learnSuperKeyword() {
        System.out.println("⬆️ Ключевое слово super:");
        
        // Демонстрируем вызов конструктора родителя
        Student student = new Student("Анна", 20, "S12345", "Информатика");
        student.displayInfo();
        student.study();
        
        System.out.println();
        
        // Демонстрируем вызов метода родителя
        Teacher teacher = new Teacher("Иван Петрович", 45, "T67890", "Математика");
        teacher.displayInfo();
        teacher.teach();
        
        System.out.println();
    }
    
    private static void learnInheritanceHierarchy() {
        System.out.println("🏗️ Иерархия наследования:");
        
        // Многоуровневое наследование: Shape -> Rectangle -> Square
        Shape shape = new Shape("Геометрическая фигура");
        Rectangle rectangle = new Rectangle("Прямоугольник", 10, 5);
        Square square = new Square("Квадрат", 7);
        
        shape.displayInfo();
        shape.calculateArea(); // Базовая реализация
        
        System.out.println();
        
        rectangle.displayInfo();
        rectangle.calculateArea(); // Переопределенная реализация
        rectangle.calculatePerimeter();
        
        System.out.println();
        
        square.displayInfo();
        square.calculateArea(); // Унаследованная от Rectangle
        square.calculatePerimeter(); // Переопределенная реализация
        
        System.out.println();
    }
    
    private static void practiceInheritance() {
        System.out.println("🎯 Практика наследования:");
        
        // Создаем игровых персонажей разных классов
        GameCharacter[] party = {
            new Warrior("Торин", 100, 20, "Топор"),
            new Mage("Гэндальф", 80, 150, "Огненный шар"),
            new Archer("Леголас", 90, 100, "Эльфийский лук")
        };
        
        System.out.println("🏰 Наша группа героев:");
        for (GameCharacter hero : party) {
            hero.displayStats();
            System.out.println();
        }
        
        // Начинаем бой!
        System.out.println("⚔️ Начинается битва с драконом!");
        for (GameCharacter hero : party) {
            hero.attack(); // Каждый атакует по-своему
            hero.useSpecialAbility(); // Уникальная способность
            System.out.println();
        }
        
        // Отдых после боя
        System.out.println("😴 Герои отдыхают...");
        for (GameCharacter hero : party) {
            hero.rest(); // Общий метод для всех
        }
        
        System.out.println();
    }
}

// ================================
// БАЗОВЫЕ КЛАССЫ ДЛЯ ЖИВОТНЫХ
// ================================

/**
 * 🐾 БАЗОВЫЙ КЛАСС ЖИВОТНОЕ
 */
class Animal {
    protected String name;  // protected - доступно наследникам
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.printf("🐾 Создано животное: %s%n", name);
    }
    
    public void displayInfo() {
        System.out.printf("🐾 %s, возраст: %d лет%n", name, age);
    }
    
    public void eat() {
        System.out.printf("🍖 %s кушает%n", name);
    }
    
    public void sleep() {
        System.out.printf("😴 %s спит%n", name);
    }
    
    public void makeSound() {
        System.out.printf("🔊 %s издает звук%n", name);
    }
}

/**
 * 🐕 СОБАКА - наследник Animal
 */
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age); // Вызов конструктора родителя
        this.breed = breed;
        System.out.printf("🐕 Создана собака породы: %s%n", breed);
    }
    
    @Override // Аннотация переопределения
    public void displayInfo() {
        System.out.printf("🐕 Собака %s (%s), возраст: %d лет%n", name, breed, age);
    }
    
    @Override
    public void makeSound() {
        System.out.printf("🐕 %s лает: Гав-гав!%n", name);
    }
    
    // Уникальный метод собаки
    public void bark() {
        makeSound();
    }
    
    public void wagTail() {
        System.out.printf("🐕 %s виляет хвостом%n", name);
    }
}

/**
 * 🐱 КОШКА - наследник Animal
 */
class Cat extends Animal {
    private String color;
    
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
        System.out.printf("🐱 Создана кошка окраса: %s%n", color);
    }
    
    @Override
    public void displayInfo() {
        System.out.printf("🐱 Кошка %s (%s), возраст: %d лет%n", name, color, age);
    }
    
    @Override
    public void makeSound() {
        System.out.printf("🐱 %s мяукает: Мяу-мяу!%n", name);
    }
    
    // Уникальные методы кошки
    public void purr() {
        System.out.printf("🐱 %s мурлычет%n", name);
    }
    
    public void hunt() {
        System.out.printf("🐱 %s охотится на мышей%n", name);
    }
}

// ================================
// КЛАССЫ ТРАНСПОРТА
// ================================

/**
 * 🚗 БАЗОВЫЙ КЛАСС ТРАНСПОРТ
 */
class Vehicle {
    protected String name;
    protected int maxSpeed;
    protected boolean isMoving;
    
    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.isMoving = false;
    }
    
    public void displayInfo() {
        System.out.printf("🚗 %s (макс. скорость: %d км/ч)%n", name, maxSpeed);
    }
    
    public void start() {
        isMoving = true;
        System.out.printf("🚀 %s начинает движение%n", name);
    }
    
    public void stop() {
        isMoving = false;
        System.out.printf("🛑 %s останавливается%n", name);
    }
    
    public void accelerate() {
        if (isMoving) {
            System.out.printf("⚡ %s ускоряется%n", name);
        } else {
            System.out.printf("❌ %s не движется%n", name);
        }
    }
}

/**
 * 🚙 АВТОМОБИЛЬ
 */
class Car extends Vehicle {
    private int wheels;
    
    public Car(String name, int maxSpeed, int wheels) {
        super(name, maxSpeed);
        this.wheels = wheels;
    }
    
    @Override
    public void start() {
        System.out.printf("🔑 Заводим двигатель %s%n", name);
        super.start(); // Вызов метода родителя
    }
    
    @Override
    public void accelerate() {
        if (isMoving) {
            System.out.printf("🚗 %s разгоняется на %d колесах%n", name, wheels);
        } else {
            System.out.printf("❌ Сначала заведите %s%n", name);
        }
    }
    
    public void honk() {
        System.out.printf("📯 %s сигналит: Би-би!%n", name);
    }
}

/**
 * 🚲 ВЕЛОСИПЕД
 */
class Bicycle extends Vehicle {
    private String type;
    
    public Bicycle(String name, int maxSpeed, String type) {
        super(name, maxSpeed);
        this.type = type;
    }
    
    @Override
    public void start() {
        System.out.printf("🚴 Начинаем крутить педали %s (%s)%n", name, type);
        super.start();
    }
    
    @Override
    public void accelerate() {
        if (isMoving) {
            System.out.printf("🚲 %s ускоряется силой ног%n", name);
        } else {
            System.out.printf("❌ Сначала начните крутить педали%n");
        }
    }
    
    public void ringBell() {
        System.out.printf("🔔 %s звонит в звонок: Динь-динь!%n", name);
    }
}

// ================================
// ИЕРАРХИЯ ЛЮДЕЙ
// ================================

/**
 * 👤 БАЗОВЫЙ КЛАСС ЧЕЛОВЕК
 */
class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.printf("👤 %s, %d лет%n", name, age);
    }
    
    public void walk() {
        System.out.printf("🚶 %s идет%n", name);
    }
    
    public void talk() {
        System.out.printf("💬 %s говорит%n", name);
    }
}

/**
 * 🎓 СТУДЕНТ
 */
class Student extends Person {
    private String studentId;
    private String major;
    
    public Student(String name, int age, String studentId, String major) {
        super(name, age); // Обязательный вызов конструктора родителя
        this.studentId = studentId;
        this.major = major;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Вызов метода родителя
        System.out.printf("   📚 Студент ID: %s, специальность: %s%n", studentId, major);
    }
    
    public void study() {
        System.out.printf("📖 Студент %s изучает %s%n", name, major);
    }
    
    public void takeExam() {
        System.out.printf("✍️ %s сдает экзамен%n", name);
    }
}

/**
 * 👨‍🏫 ПРЕПОДАВАТЕЛЬ
 */
class Teacher extends Person {
    private String teacherId;
    private String subject;
    
    public Teacher(String name, int age, String teacherId, String subject) {
        super(name, age);
        this.teacherId = teacherId;
        this.subject = subject;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("   👨‍🏫 Преподаватель ID: %s, предмет: %s%n", teacherId, subject);
    }
    
    public void teach() {
        System.out.printf("🎓 Преподаватель %s ведет урок по предмету %s%n", name, subject);
    }
    
    public void gradeStudents() {
        System.out.printf("📊 %s проверяет работы студентов%n", name);
    }
}

// ================================
// ГЕОМЕТРИЧЕСКИЕ ФИГУРЫ
// ================================

/**
 * 📐 БАЗОВЫЙ КЛАСС ФИГУРА
 */
class Shape {
    protected String name;
    
    public Shape(String name) {
        this.name = name;
    }
    
    public void displayInfo() {
        System.out.printf("📐 Фигура: %s%n", name);
    }
    
    public double calculateArea() {
        System.out.printf("🔢 Площадь фигуры %s не определена%n", name);
        return 0;
    }
}

/**
 * ▭ ПРЯМОУГОЛЬНИК
 */
class Rectangle extends Shape {
    protected double width;
    protected double height;
    
    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("   📏 Ширина: %.1f, Высота: %.1f%n", width, height);
    }
    
    @Override
    public double calculateArea() {
        double area = width * height;
        System.out.printf("🔢 Площадь прямоугольника: %.1f%n", area);
        return area;
    }
    
    public double calculatePerimeter() {
        double perimeter = 2 * (width + height);
        System.out.printf("📏 Периметр прямоугольника: %.1f%n", perimeter);
        return perimeter;
    }
}

/**
 * ⬜ КВАДРАТ
 */
class Square extends Rectangle {
    
    public Square(String name, double side) {
        super(name, side, side); // У квадрата ширина = высота
    }
    
    @Override
    public void displayInfo() {
        System.out.printf("📐 Фигура: %s%n", name);
        System.out.printf("   📏 Сторона: %.1f%n", width);
    }
    
    @Override
    public double calculatePerimeter() {
        double perimeter = 4 * width;
        System.out.printf("📏 Периметр квадрата: %.1f%n", perimeter);
        return perimeter;
    }
}

// ================================
// ИГРОВЫЕ ПЕРСОНАЖИ
// ================================

/**
 * 🗡️ БАЗОВЫЙ ИГРОВОЙ ПЕРСОНАЖ
 */
class GameCharacter {
    protected String name;
    protected int health;
    protected int mana;
    
    public GameCharacter(String name, int health, int mana) {
        this.name = name;
        this.health = health;
        this.mana = mana;
    }
    
    public void displayStats() {
        System.out.printf("🗡️ %s | ❤️ HP: %d | 💙 MP: %d%n", name, health, mana);
    }
    
    public void attack() {
        System.out.printf("⚔️ %s атакует!%n", name);
    }
    
    public void rest() {
        health = Math.min(100, health + 20);
        mana = Math.min(100, mana + 15);
        System.out.printf("😴 %s отдохнул. HP: %d, MP: %d%n", name, health, mana);
    }
    
    public void useSpecialAbility() {
        System.out.printf("✨ %s использует особую способность%n", name);
    }
}

/**
 * 🛡️ ВОИН
 */
class Warrior extends GameCharacter {
    private String weapon;
    
    public Warrior(String name, int health, int mana, String weapon) {
        super(name, health, mana);
        this.weapon = weapon;
    }
    
    @Override
    public void displayStats() {
        super.displayStats();
        System.out.printf("   🛡️ Класс: Воин | ⚔️ Оружие: %s%n", weapon);
    }
    
    @Override
    public void attack() {
        System.out.printf("⚔️ Воин %s наносит мощный удар %s!%n", name, weapon);
    }
    
    @Override
    public void useSpecialAbility() {
        System.out.printf("🛡️ %s использует Железную защиту!%n", name);
    }
}

/**
 * 🧙‍♂️ МАГ
 */
class Mage extends GameCharacter {
    private String spell;
    
    public Mage(String name, int health, int mana, String spell) {
        super(name, health, mana);
        this.spell = spell;
    }
    
    @Override
    public void displayStats() {
        super.displayStats();
        System.out.printf("   🧙‍♂️ Класс: Маг | ✨ Заклинание: %s%n", spell);
    }
    
    @Override
    public void attack() {
        if (mana >= 20) {
            mana -= 20;
            System.out.printf("✨ Маг %s кастует %s! MP: %d%n", name, spell, mana);
        } else {
            System.out.printf("❌ У мага %s недостаточно маны%n", name);
        }
    }
    
    @Override
    public void useSpecialAbility() {
        System.out.printf("🔮 %s призывает магический щит!%n", name);
    }
}

/**
 * 🏹 ЛУЧНИК
 */
class Archer extends GameCharacter {
    private String bow;
    
    public Archer(String name, int health, int mana, String bow) {
        super(name, health, mana);
        this.bow = bow;
    }
    
    @Override
    public void displayStats() {
        super.displayStats();
        System.out.printf("   🏹 Класс: Лучник | 🏹 Лук: %s%n", bow);
    }
    
    @Override
    public void attack() {
        System.out.printf("🏹 Лучник %s стреляет из %s!%n", name, bow);
    }
    
    @Override
    public void useSpecialAbility() {
        System.out.printf("🎯 %s использует Меткий выстрел!%n", name);
    }
}

/*
🎓 ЧТО ТЫ ИЗУЧИЛ:

✅ Основы наследования (extends)
✅ Переопределение методов (@Override)
✅ Ключевое слово super
✅ Многоуровневое наследование
✅ Отношения IS-A (является)
✅ Модификатор protected
✅ Полиморфизм через наследование

🔥 КЛЮЧЕВЫЕ КОНЦЕПЦИИ:

💡 Наследование = переиспользование кода
💡 Child IS-A Parent (Собака является Животным)
💡 super() вызывает конструктор родителя
💡 @Override гарантирует правильное переопределение
💡 protected доступен наследникам
💡 Один родитель, много детей

🏆 ПРИНЦИПЫ НАСЛЕДОВАНИЯ:

- DRY (Don't Repeat Yourself) - не повторяйся
- Логическое отношение IS-A
- Специализация (добавление функций)
- Переопределение (изменение поведения)
- Иерархия от общего к частному

💾 Сохрани прогресс:
git add .
git commit -m "Урок 10: Наследование"

Готов изучать полиморфизм? 🎭
*/ 
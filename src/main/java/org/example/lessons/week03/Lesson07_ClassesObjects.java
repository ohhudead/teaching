//package org.example.lessons.week03;
//
///**
// * 🏗️ ЗАНЯТИЕ 7: КЛАССЫ И ОБЪЕКТЫ
// *
// * Добро пожаловать в мир ООП! Это революционный подход к программированию,
// * где мы моделируем реальный мир через классы и объекты.
// *
// * 💡 Жаргон разработчика:
// * - Class (Класс) - шаблон/чертёж для создания объектов
// * - Object (Объект) - экземпляр класса, конкретная "вещь"
// * - Instance (Экземпляр) - то же что объект
// * - Field (Поле) - переменная внутри класса (состояние)
// * - Method (Метод) - функция внутри класса (поведение)
// * - Encapsulation (Инкапсуляция) - сокрытие данных
// */
//public class Lesson07_ClassesObjects {
//
//    public static void main(String[] args) {
//        System.out.println("🏗️ ИЗУЧАЕМ КЛАССЫ И ОБЪЕКТЫ\n");
//
//        learnBasicClass();
//        learnObjectCreation();
//        learnFieldsAndMethods();
//        learnEncapsulation();
//        practiceOOP();
//    }
//
//    /**
//     * 📚 ПРОСТЕЙШИЙ КЛАСС
//     */
//    private static void learnBasicClass() {
//        System.out.println("📚 Создание объектов из класса:");
//
//        // Создаем объекты
//        Book book1 = new Book();
//        Book book2 = new Book();
//
//        // Устанавливаем данные
//        book1.title = "Java: Полное руководство";
//        book1.author = "Герберт Шилдт";
//        book1.pages = 1248;
//
//        book2.title = "Чистый код";
//        book2.author = "Роберт Мартин";
//        book2.pages = 464;
//
//        // Используем методы
//        book1.displayInfo();
//        book2.displayInfo();
//
//        System.out.println("Книга 1 толстая? " + book1.isThick());
//        System.out.println("Книга 2 толстая? " + book2.isThick());
//
//        System.out.println();
//    }
//
//    private static void learnObjectCreation() {
//        System.out.println("🚗 Моделируем автомобиль:");
//
//        Car car1 = new Car();
//        car1.brand = "Toyota";
//        car1.model = "Camry";
//        car1.year = 2022;
//        car1.color = "Белый";
//        car1.isRunning = false;
//
//        Car car2 = new Car();
//        car2.brand = "BMW";
//        car2.model = "X5";
//        car2.year = 2023;
//        car2.color = "Черный";
//        car2.isRunning = false;
//
//        System.out.println("=== Автомобиль 1 ===");
//        car1.showInfo();
//        car1.start();
//        car1.accelerate();
//        car1.stop();
//
//        System.out.println("\n=== Автомобиль 2 ===");
//        car2.showInfo();
//        car2.start();
//        car2.accelerate();
//        car2.stop();
//
//        System.out.println();
//    }
//
//    private static void learnFieldsAndMethods() {
//        System.out.println("👤 Класс Person с методами:");
//
//        Person person1 = new Person();
//        person1.name = "Алексей";
//        person1.age = 25;
//        person1.height = 180;
//        person1.weight = 75;
//
//        Person person2 = new Person();
//        person2.name = "Мария";
//        person2.age = 22;
//        person2.height = 165;
//        person2.weight = 55;
//
//        person1.introduce();
//        System.out.println("ИМТ: " + person1.calculateBMI());
//        System.out.println("Категория возраста: " + person1.getAgeCategory());
//
//        person2.introduce();
//        System.out.println("ИМТ: " + person2.calculateBMI());
//        System.out.println("Категория возраста: " + person2.getAgeCategory());
//
//        // Сравнение объектов
//        if (person1.isOlderThan(person2)) {
//            System.out.println(person1.name + " старше " + person2.name);
//        } else {
//            System.out.println(person2.name + " старше " + person1.name);
//        }
//
//        System.out.println();
//    }
//
//    private static void learnEncapsulation() {
//        System.out.println("🏦 Инкапсуляция на примере банковского счета:");
//
//        BankAccount account = new BankAccount();
//        account.setAccountNumber("12345-67890");
//        account.setOwnerName("Иван Иванов");
//        account.deposit(1000);
//
//        account.showAccountInfo();
//
//        // Попытки операций
//        account.withdraw(300);
//        account.withdraw(800); // Недостаточно средств
//        account.deposit(500);
//
//        account.showAccountInfo();
//
//        System.out.println();
//    }
//
//    private static void practiceOOP() {
//        System.out.println("🎯 Практика ООП:");
//
//        // Создаем несколько студентов
//        Student[] students = {
//            createStudent("Алексей", 20, "Информатика"),
//            createStudent("Мария", 19, "Математика"),
//            createStudent("Дмитрий", 21, "Физика")
//        };
//
//        // Добавляем оценки
//        students[0].addGrade(85);
//        students[0].addGrade(90);
//        students[0].addGrade(78);
//
//        students[1].addGrade(95);
//        students[1].addGrade(88);
//        students[1].addGrade(92);
//
//        students[2].addGrade(82);
//        students[2].addGrade(79);
//        students[2].addGrade(86);
//
//        // Показываем информацию о студентах
//        System.out.println("📊 Информация о студентах:");
//        for (Student student : students) {
//            student.showStudentInfo();
//            System.out.println();
//        }
//
//        // Находим лучшего студента
//        Student bestStudent = students[0];
//        for (Student student : students) {
//            if (student.getAverageGrade() > bestStudent.getAverageGrade()) {
//                bestStudent = student;
//            }
//        }
//
//        System.out.println("🏆 Лучший студент: " + bestStudent.getName() +
//                          " (средняя оценка: " + bestStudent.getAverageGrade() + ")");
//    }
//
//    private static Student createStudent(String name, int age, String major) {
//        Student student = new Student();
//        student.setName(name);
//        student.setAge(age);
//        student.setMajor(major);
//        return student;
//    }
//}
//
///**
// * 📖 КЛАСС КНИГА
// * Простейший пример класса с полями и методами
// */
//class Book {
//    // Поля (состояние объекта)
//    String title;
//    String author;
//    int pages;
//
//    // Методы (поведение объекта)
//    void displayInfo() {
//        System.out.printf("📖 \"%s\" - %s (%d стр.)%n", title, author, pages);
//    }
//
//    boolean isThick() {
//        return pages > 500;
//    }
//
//    int getReadingTimeHours() {
//        return pages / 50; // Примерно 50 страниц в час
//    }
//}
//
///**
// * 🚗 КЛАСС АВТОМОБИЛЬ
// * Демонстрирует состояние и поведение объекта
// */
//class Car {
//    // Поля
//    String brand;
//    String model;
//    int year;
//    String color;
//    boolean isRunning;
//    int speed;
//
//    // Методы
//    void showInfo() {
//        System.out.printf("🚗 %s %s %d года, цвет: %s%n", brand, model, year, color);
//        System.out.println("Состояние: " + (isRunning ? "Заведена" : "Заглушена"));
//        if (isRunning) {
//            System.out.println("Скорость: " + speed + " км/ч");
//        }
//    }
//
//    void start() {
//        if (!isRunning) {
//            isRunning = true;
//            speed = 0;
//            System.out.println("🔑 Автомобиль заведен!");
//        } else {
//            System.out.println("⚠️ Автомобиль уже работает");
//        }
//    }
//
//    void stop() {
//        if (isRunning) {
//            isRunning = false;
//            speed = 0;
//            System.out.println("🛑 Автомобиль заглушен");
//        } else {
//            System.out.println("⚠️ Автомобиль уже заглушен");
//        }
//    }
//
//    void accelerate() {
//        if (isRunning) {
//            speed += 20;
//            System.out.println("🚀 Ускорение! Скорость: " + speed + " км/ч");
//        } else {
//            System.out.println("❌ Сначала заведите автомобиль!");
//        }
//    }
//}
//
///**
// * 👤 КЛАСС ЧЕЛОВЕК
// * Показывает различные методы для работы с данными
// */
//class Person {
//    String name;
//    int age;
//    double height; // в см
//    double weight; // в кг
//
//    void introduce() {
//        System.out.printf("👋 Привет! Меня зовут %s, мне %d лет%n", name, age);
//        System.out.printf("Мой рост: %.0f см, вес: %.0f кг%n", height, weight);
//    }
//
//    double calculateBMI() {
//        double heightInMeters = height / 100;
//        return weight / (heightInMeters * heightInMeters);
//    }
//
//    String getAgeCategory() {
//        if (age < 13) return "ребенок";
//        if (age < 20) return "подросток";
//        if (age < 65) return "взрослый";
//        return "пенсионер";
//    }
//
//    boolean isOlderThan(Person other) {
//        return this.age > other.age;
//    }
//
//    boolean isTallerThan(Person other) {
//        return this.height > other.height;
//    }
//}
//
///**
// * 🏦 КЛАСС БАНКОВСКИЙ СЧЕТ
// * Демонстрирует инкапсуляцию (приватные поля)
// */
//class BankAccount {
//    // Приватные поля - доступны только внутри класса
//    private String accountNumber;
//    private String ownerName;
//    private double balance;
//
//    // Публичные методы для доступа к данным (геттеры и сеттеры)
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public void setOwnerName(String ownerName) {
//        this.ownerName = ownerName;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public String getOwnerName() {
//        return ownerName;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    // Методы для операций со счетом
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//            System.out.printf("💰 Пополнение на %.2f. Баланс: %.2f%n", amount, balance);
//        } else {
//            System.out.println("❌ Сумма должна быть положительной");
//        }
//    }
//
//    public boolean withdraw(double amount) {
//        if (amount > 0 && amount <= balance) {
//            balance -= amount;
//            System.out.printf("💸 Снятие %.2f. Баланс: %.2f%n", amount, balance);
//            return true;
//        } else if (amount > balance) {
//            System.out.println("❌ Недостаточно средств на счете");
//            return false;
//        } else {
//            System.out.println("❌ Сумма должна быть положительной");
//            return false;
//        }
//    }
//
//    public void showAccountInfo() {
//        System.out.println("📋 Информация о счете:");
//        System.out.println("Номер счета: " + accountNumber);
//        System.out.println("Владелец: " + ownerName);
//        System.out.printf("Баланс: %.2f руб%n", balance);
//    }
//}
//
///**
// * 🎓 КЛАСС СТУДЕНТ
// * Комплексный пример с массивом оценок
// */
//class Student {
//    private String name;
//    private int age;
//    private String major;
//    private int[] grades;
//    private int gradeCount;
//
//    public Student() {
//        grades = new int[10]; // Максимум 10 оценок
//        gradeCount = 0;
//    }
//
//    // Геттеры и сеттеры
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setMajor(String major) {
//        this.major = major;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getMajor() {
//        return major;
//    }
//
//    // Добавление оценки
//    public void addGrade(int grade) {
//        if (gradeCount < grades.length && grade >= 0 && grade <= 100) {
//            grades[gradeCount] = grade;
//            gradeCount++;
//            System.out.printf("✅ Студенту %s добавлена оценка: %d%n", name, grade);
//        } else {
//            System.out.println("❌ Невозможно добавить оценку");
//        }
//    }
//
//    // Вычисление средней оценки
//    public double getAverageGrade() {
//        if (gradeCount == 0) return 0;
//
//        int sum = 0;
//        for (int i = 0; i < gradeCount; i++) {
//            sum += grades[i];
//        }
//        return (double) sum / gradeCount;
//    }
//
//    // Получение буквенной оценки
//    public String getLetterGrade() {
//        double average = getAverageGrade();
//        if (average >= 90) return "A";
//        if (average >= 80) return "B";
//        if (average >= 70) return "C";
//        if (average >= 60) return "D";
//        return "F";
//    }
//
//    // Показать информацию о студенте
//    public void showStudentInfo() {
//        System.out.printf("🎓 Студент: %s (%d лет)%n", name, age);
//        System.out.println("Специальность: " + major);
//        System.out.print("Оценки: ");
//        for (int i = 0; i < gradeCount; i++) {
//            System.out.print(grades[i] + " ");
//        }
//        System.out.println();
//        System.out.printf("Средняя оценка: %.1f (%s)%n", getAverageGrade(), getLetterGrade());
//    }
//}
//
///*
//🎓 ЧТО ТЫ ИЗУЧИЛ:
//
//✅ Что такое классы и объекты
//✅ Поля (переменные) класса
//✅ Методы (функции) класса
//✅ Создание объектов через new
//✅ Инкапсуляция (private/public)
//✅ Геттеры и сеттеры
//✅ Работа с this
//
//🔥 КЛЮЧЕВЫЕ КОНЦЕПЦИИ:
//
//💡 Класс = шаблон, объект = экземпляр
//💡 Поля хранят состояние объекта
//💡 Методы определяют поведение объекта
//💡 private скрывает данные
//💡 public предоставляет интерфейс
//💡 this ссылается на текущий объект
//
//🏆 ПРИНЦИПЫ ООП:
//
//- Инкапсуляция: объединение данных и методов
//- Сокрытие данных: private поля, public методы
//- Абстракция: упрощение сложности
//- Модульность: разделение на логические части
//
//💾 Сохрани прогресс:
//git add .
//git commit -m "Урок 7: Классы и объекты"
//
//Готов к изучению методов? 🚀
//*/
package org.example.lessons.week03;

import java.util.Scanner;

/**
 * 🎯 ПРАКТИЧЕСКОЕ ЗАНЯТИЕ: НЕДЕЛЯ 3
 * 
 * Время применить знания ООП на практике! Создадим несколько мини-проектов,
 * которые продемонстрируют классы, объекты, методы и конструкторы в действии.
 * 
 * 🚀 Проекты:
 * 1. Система управления библиотекой
 * 2. Игра "Виртуальный питомец"
 * 3. Банковская система
 * 4. Управление задачами
 */
public class Week03_Practice {
    
    public static void main(String[] args) {
        System.out.println("🎯 ПРАКТИЧЕСКОЕ ЗАНЯТИЕ: ООП В ДЕЙСТВИИ\n");
        
        runLibrarySystem();
        runVirtualPetGame();
        runBankingSystem();
        runTaskManager();
        
        System.out.println("\n🏆 Поздравляем! Вы освоили основы ООП!");
        System.out.println("🔥 Теперь вы умеете создавать классы, объекты и писать методы!");
    }
    
    /**
     * 📚 ПРОЕКТ 1: СИСТЕМА УПРАВЛЕНИЯ БИБЛИОТЕКОЙ
     */
    private static void runLibrarySystem() {
        System.out.println("📚 ПРОЕКТ 1: СИСТЕМА УПРАВЛЕНИЯ БИБЛИОТЕКОЙ");
        System.out.println("=".repeat(50));
        
        // Создаем библиотеку
        Library library = new Library("Центральная городская библиотека");
        
        // Добавляем книги
        library.addBook(new LibraryBook("Война и мир", "Лев Толстой", 1225));
        library.addBook(new LibraryBook("1984", "Джордж Оруэлл", 328));
        library.addBook(new LibraryBook("Мастер и Маргарита", "Михаил Булгаков", 470));
        
        // Создаем читателей
        Reader reader1 = new Reader("Анна Петрова", "R001");
        Reader reader2 = new Reader("Иван Сидоров", "R002");
        
        // Демонстрируем работу системы
        library.displayAllBooks();
        
        // Выдача книг
        library.borrowBook("1984", reader1);
        library.borrowBook("Война и мир", reader2);
        library.borrowBook("1984", reader2); // Книга уже выдана
        
        System.out.println();
        reader1.displayBorrowedBooks();
        reader2.displayBorrowedBooks();
        
        // Возврат книги
        library.returnBook("1984", reader1);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    /**
     * 🐱 ПРОЕКТ 2: ИГРА "ВИРТУАЛЬНЫЙ ПИТОМЕЦ"
     */
    private static void runVirtualPetGame() {
        System.out.println("🐱 ПРОЕКТ 2: ИГРА \"ВИРТУАЛЬНЫЙ ПИТОМЕЦ\"");
        System.out.println("=".repeat(50));
        
        // Создаем разных питомцев
        VirtualPet cat = new VirtualPet("Мурзик", "Кот");
        VirtualPet dog = new VirtualPet("Бобик", "Собака");
        VirtualPet hamster = new VirtualPet("Хомяк", "Хомяк");
        
        System.out.println("🎮 Добро пожаловать в игру \"Виртуальный питомец\"!");
        System.out.println("У вас есть три питомца:\n");
        
        // Показываем состояние питомцев
        cat.displayStatus();
        dog.displayStatus();
        hamster.displayStatus();
        
        System.out.println("\n⏰ Прошел день...\n");
        
        // Взаимодействуем с питомцами
        cat.feed();
        cat.play();
        
        dog.feed();
        dog.play();
        dog.sleep();
        
        hamster.feed();
        
        System.out.println("\n📊 Состояние питомцев в конце дня:");
        cat.displayStatus();
        dog.displayStatus();
        hamster.displayStatus();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    /**
     * 🏦 ПРОЕКТ 3: БАНКОВСКАЯ СИСТЕМА
     */
    private static void runBankingSystem() {
        System.out.println("🏦 ПРОЕКТ 3: БАНКОВСКАЯ СИСТЕМА");
        System.out.println("=".repeat(50));
        
        // Создаем банк
        Bank bank = new Bank("Народный Банк");
        
        // Создаем клиентов
        BankCustomer customer1 = new BankCustomer("Елена Иванова", "123456789");
        BankCustomer customer2 = new BankCustomer("Дмитрий Петров", "987654321");
        
        // Открываем счета
        BankingAccount account1 = bank.openAccount(customer1, "Сберегательный", 5000);
        BankingAccount account2 = bank.openAccount(customer2, "Текущий", 10000);
        
        // Демонстрируем операции
        System.out.println("\n💰 Банковские операции:");
        account1.deposit(2000);
        account1.withdraw(1500);
        
        account2.deposit(500);
        account2.withdraw(15000); // Недостаточно средств
        
        // Перевод между счетами
        bank.transferMoney(account1, account2, 1000);
        
        // Итоговые балансы
        System.out.println("\n📊 Итоговые балансы:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    /**
     * ✅ ПРОЕКТ 4: УПРАВЛЕНИЕ ЗАДАЧАМИ
     */
    private static void runTaskManager() {
        System.out.println("✅ ПРОЕКТ 4: УПРАВЛЕНИЕ ЗАДАЧАМИ");
        System.out.println("=".repeat(50));
        
        // Создаем проект
        Project project = new Project("Разработка мобильного приложения");
        
        // Добавляем задачи
        project.addTask(new Task("Анализ требований", "высокий", 3));
        project.addTask(new Task("Дизайн интерфейса", "средний", 5));
        project.addTask(new Task("Программирование", "высокий", 10));
        project.addTask(new Task("Тестирование", "средний", 4));
        
        // Показываем план проекта
        project.displayProjectInfo();
        
        // Работаем над задачами
        System.out.println("\n🚀 Начинаем работу над проектом!");
        
        project.startTask("Анализ требований");
        project.completeTask("Анализ требований");
        
        project.startTask("Дизайн интерфейса");
        project.startTask("Программирование");
        
        // Обновляем статус проекта
        System.out.println("\n📊 Текущий статус проекта:");
        project.displayProjectInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
}

// ================================
// КЛАССЫ ДЛЯ СИСТЕМЫ БИБЛИОТЕКИ
// ================================

/**
 * 📖 КНИГА В БИБЛИОТЕКЕ
 */
class LibraryBook {
    private String title;
    private String author;
    private int pages;
    private boolean isAvailable;
    private String borrowedBy;
    
    public LibraryBook(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
        this.borrowedBy = null;
    }
    
    public void borrowBook(String readerName) {
        if (isAvailable) {
            isAvailable = false;
            borrowedBy = readerName;
            System.out.printf("📚 Книга \"%s\" выдана читателю %s%n", title, readerName);
        } else {
            System.out.printf("❌ Книга \"%s\" уже выдана читателю %s%n", title, borrowedBy);
        }
    }
    
    public void returnBook() {
        if (!isAvailable) {
            System.out.printf("📚 Книга \"%s\" возвращена читателем %s%n", title, borrowedBy);
            isAvailable = true;
            borrowedBy = null;
        } else {
            System.out.printf("⚠️ Книга \"%s\" не была выдана%n", title);
        }
    }
    
    public void displayInfo() {
        String status = isAvailable ? "✅ Доступна" : "❌ Выдана (" + borrowedBy + ")";
        System.out.printf("📖 \"%s\" - %s (%d стр.) - %s%n", title, author, pages, status);
    }
    
    // Геттеры
    public String getTitle() { return title; }
    public boolean isAvailable() { return isAvailable; }
    public String getBorrowedBy() { return borrowedBy; }
}

/**
 * 👤 ЧИТАТЕЛЬ
 */
class Reader {
    private String name;
    private String readerId;
    private LibraryBook[] borrowedBooks;
    private int borrowedCount;
    
    public Reader(String name, String readerId) {
        this.name = name;
        this.readerId = readerId;
        this.borrowedBooks = new LibraryBook[5]; // Максимум 5 книг
        this.borrowedCount = 0;
    }
    
    public void borrowBook(LibraryBook book) {
        if (borrowedCount < borrowedBooks.length) {
            borrowedBooks[borrowedCount] = book;
            borrowedCount++;
        }
    }
    
    public void returnBook(LibraryBook book) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedBooks[i] == book) {
                // Сдвигаем массив
                for (int j = i; j < borrowedCount - 1; j++) {
                    borrowedBooks[j] = borrowedBooks[j + 1];
                }
                borrowedCount--;
                borrowedBooks[borrowedCount] = null;
                break;
            }
        }
    }
    
    public void displayBorrowedBooks() {
        System.out.printf("📋 Читатель %s (ID: %s) взял книг: %d%n", name, readerId, borrowedCount);
        for (int i = 0; i < borrowedCount; i++) {
            System.out.printf("  %d. %s%n", i + 1, borrowedBooks[i].getTitle());
        }
    }
    
    public String getName() { return name; }
}

/**
 * 🏛️ БИБЛИОТЕКА
 */
class Library {
    private String name;
    private LibraryBook[] books;
    private int bookCount;
    
    public Library(String name) {
        this.name = name;
        this.books = new LibraryBook[100]; // Максимум 100 книг
        this.bookCount = 0;
    }
    
    public void addBook(LibraryBook book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.printf("✅ Книга \"%s\" добавлена в библиотеку%n", book.getTitle());
        }
    }
    
    public void borrowBook(String title, Reader reader) {
        LibraryBook book = findBook(title);
        if (book != null && book.isAvailable()) {
            book.borrowBook(reader.getName());
            reader.borrowBook(book);
        } else if (book != null) {
            System.out.printf("❌ Книга \"%s\" недоступна%n", title);
        } else {
            System.out.printf("❌ Книга \"%s\" не найдена%n", title);
        }
    }
    
    public void returnBook(String title, Reader reader) {
        LibraryBook book = findBook(title);
        if (book != null && !book.isAvailable()) {
            book.returnBook();
            reader.returnBook(book);
        }
    }
    
    private LibraryBook findBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }
    
    public void displayAllBooks() {
        System.out.printf("📚 Библиотека \"%s\" - всего книг: %d%n", name, bookCount);
        for (int i = 0; i < bookCount; i++) {
            books[i].displayInfo();
        }
        System.out.println();
    }
}

// ================================
// КЛАССЫ ДЛЯ ВИРТУАЛЬНОГО ПИТОМЦА
// ================================

/**
 * 🐾 ВИРТУАЛЬНЫЙ ПИТОМЕЦ
 */
class VirtualPet {
    private String name;
    private String species;
    private int hunger; // 0-100
    private int happiness; // 0-100
    private int energy; // 0-100
    private int age;
    
    public VirtualPet(String name, String species) {
        this.name = name;
        this.species = species;
        this.hunger = 50;
        this.happiness = 50;
        this.energy = 100;
        this.age = 0;
        
        System.out.printf("🐾 Питомец %s (%s) появился на свет!%n", name, species);
    }
    
    public void feed() {
        if (hunger > 20) {
            hunger = Math.max(0, hunger - 30);
            happiness = Math.min(100, happiness + 10);
            System.out.printf("🍖 %s покушал! Голод: %d, Счастье: %d%n", name, hunger, happiness);
        } else {
            System.out.printf("😊 %s не голоден%n", name);
        }
    }
    
    public void play() {
        if (energy > 20) {
            energy = Math.max(0, energy - 20);
            happiness = Math.min(100, happiness + 25);
            hunger = Math.min(100, hunger + 15);
            System.out.printf("🎾 %s поиграл! Энергия: %d, Счастье: %d%n", name, energy, happiness);
        } else {
            System.out.printf("😴 %s слишком устал для игр%n", name);
        }
    }
    
    public void sleep() {
        energy = Math.min(100, energy + 40);
        hunger = Math.min(100, hunger + 10);
        System.out.printf("😴 %s поспал! Энергия: %d%n", name, energy);
    }
    
    public void displayStatus() {
        System.out.printf("🐾 %s (%s) - Возраст: %d%n", name, species, age);
        System.out.printf("   🍖 Голод: %d | 😊 Счастье: %d | ⚡ Энергия: %d%n", 
                         hunger, happiness, energy);
        
        String mood = getMood();
        System.out.printf("   Настроение: %s%n%n", mood);
    }
    
    private String getMood() {
        if (happiness > 80) return "😄 Очень счастлив";
        if (happiness > 60) return "😊 Счастлив";
        if (happiness > 40) return "😐 Нормально";
        if (happiness > 20) return "😞 Грустный";
        return "😭 Очень грустный";
    }
}

// ================================
// КЛАССЫ ДЛЯ БАНКОВСКОЙ СИСТЕМЫ
// ================================

/**
 * 👤 КЛИЕНТ БАНКА
 */
class BankCustomer {
    private String name;
    private String customerId;
    
    public BankCustomer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }
    
    public String getName() { return name; }
    public String getCustomerId() { return customerId; }
}

/**
 * 💳 БАНКОВСКИЙ СЧЕТ
 */
class BankingAccount {
    private String accountNumber;
    private BankCustomer owner;
    private String accountType;
    private double balance;
    private int transactionCount;
    
    public BankingAccount(String accountNumber, BankCustomer owner, String accountType, double initialBalance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.accountType = accountType;
        this.balance = initialBalance;
        this.transactionCount = 0;
        
        System.out.printf("✅ Открыт %s счет %s для %s с балансом %.2f руб%n", 
                         accountType.toLowerCase(), accountNumber, owner.getName(), initialBalance);
    }
    
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionCount++;
            System.out.printf("💰 Пополнение счета %s на %.2f руб. Баланс: %.2f руб%n", 
                             accountNumber, amount, balance);
            return true;
        }
        return false;
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionCount++;
            System.out.printf("💸 Снятие со счета %s: %.2f руб. Баланс: %.2f руб%n", 
                             accountNumber, amount, balance);
            return true;
        } else {
            System.out.printf("❌ Недостаточно средств на счете %s для снятия %.2f руб%n", 
                             accountNumber, amount);
            return false;
        }
    }
    
    public void displayAccountInfo() {
        System.out.printf("💳 Счет: %s | Владелец: %s | Тип: %s%n", 
                         accountNumber, owner.getName(), accountType);
        System.out.printf("   💰 Баланс: %.2f руб | 📊 Операций: %d%n", 
                         balance, transactionCount);
    }
    
    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
    public BankCustomer getOwner() { return owner; }
}

/**
 * 🏦 БАНК
 */
class Bank {
    private String name;
    private BankingAccount[] accounts;
    private int accountCount;
    
    public Bank(String name) {
        this.name = name;
        this.accounts = new BankingAccount[100];
        this.accountCount = 0;
    }
    
    public BankingAccount openAccount(BankCustomer customer, String accountType, double initialBalance) {
        String accountNumber = generateAccountNumber();
        BankingAccount account = new BankingAccount(accountNumber, customer, accountType, initialBalance);
        
        if (accountCount < accounts.length) {
            accounts[accountCount] = account;
            accountCount++;
        }
        
        return account;
    }
    
    public boolean transferMoney(BankingAccount fromAccount, BankingAccount toAccount, double amount) {
        if (fromAccount.withdraw(amount)) {
            toAccount.deposit(amount);
            System.out.printf("💱 Перевод %.2f руб со счета %s на счет %s выполнен%n", 
                             amount, fromAccount.getAccountNumber(), toAccount.getAccountNumber());
            return true;
        } else {
            System.out.printf("❌ Перевод невозможен: недостаточно средств%n");
            return false;
        }
    }
    
    private String generateAccountNumber() {
        return String.format("ACC-%05d", accountCount + 1);
    }
}

// ================================
// КЛАССЫ ДЛЯ УПРАВЛЕНИЯ ЗАДАЧАМИ
// ================================

/**
 * ✅ ЗАДАЧА
 */
class Task {
    private String name;
    private String priority; // высокий, средний, низкий
    private int estimatedDays;
    private String status; // новая, в работе, завершена
    
    public Task(String name, String priority, int estimatedDays) {
        this.name = name;
        this.priority = priority;
        this.estimatedDays = estimatedDays;
        this.status = "новая";
    }
    
    public void startTask() {
        if ("новая".equals(status)) {
            status = "в работе";
            System.out.printf("🚀 Задача \"%s\" начата%n", name);
        } else {
            System.out.printf("⚠️ Задача \"%s\" уже %s%n", name, status);
        }
    }
    
    public void completeTask() {
        if (!"завершена".equals(status)) {
            status = "завершена";
            System.out.printf("✅ Задача \"%s\" завершена%n", name);
        } else {
            System.out.printf("⚠️ Задача \"%s\" уже завершена%n", name);
        }
    }
    
    public void displayTaskInfo() {
        String priorityIcon = switch (priority.toLowerCase()) {
            case "высокий" -> "🔴";
            case "средний" -> "🟡";
            case "низкий" -> "🟢";
            default -> "⚪";
        };
        
        String statusIcon = switch (status) {
            case "новая" -> "📋";
            case "в работе" -> "⏳";
            case "завершена" -> "✅";
            default -> "❓";
        };
        
        System.out.printf("  %s %s \"%s\" - %s приоритет (%d дней) - %s%n", 
                         statusIcon, priorityIcon, name, priority, estimatedDays, status);
    }
    
    public String getName() { return name; }
    public String getStatus() { return status; }
    public int getEstimatedDays() { return estimatedDays; }
}

/**
 * 📊 ПРОЕКТ
 */
class Project {
    private String name;
    private Task[] tasks;
    private int taskCount;
    
    public Project(String name) {
        this.name = name;
        this.tasks = new Task[20];
        this.taskCount = 0;
    }
    
    public void addTask(Task task) {
        if (taskCount < tasks.length) {
            tasks[taskCount] = task;
            taskCount++;
            System.out.printf("➕ Задача \"%s\" добавлена в проект%n", task.getName());
        }
    }
    
    public void startTask(String taskName) {
        Task task = findTask(taskName);
        if (task != null) {
            task.startTask();
        } else {
            System.out.printf("❌ Задача \"%s\" не найдена%n", taskName);
        }
    }
    
    public void completeTask(String taskName) {
        Task task = findTask(taskName);
        if (task != null) {
            task.completeTask();
        } else {
            System.out.printf("❌ Задача \"%s\" не найдена%n", taskName);
        }
    }
    
    private Task findTask(String taskName) {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getName().equalsIgnoreCase(taskName)) {
                return tasks[i];
            }
        }
        return null;
    }
    
    public void displayProjectInfo() {
        System.out.printf("📊 Проект: \"%s\"%n", name);
        System.out.printf("📋 Всего задач: %d%n", taskCount);
        
        int newTasks = 0, inProgress = 0, completed = 0, totalDays = 0;
        
        for (int i = 0; i < taskCount; i++) {
            Task task = tasks[i];
            switch (task.getStatus()) {
                case "новая" -> newTasks++;
                case "в работе" -> inProgress++;
                case "завершена" -> completed++;
            }
            totalDays += task.getEstimatedDays();
            task.displayTaskInfo();
        }
        
        System.out.printf("📈 Статистика: 📋 Новых: %d | ⏳ В работе: %d | ✅ Завершено: %d%n", 
                         newTasks, inProgress, completed);
        System.out.printf("⏱️ Общая оценка времени: %d дней%n", totalDays);
        
        double progress = taskCount > 0 ? (double) completed / taskCount * 100 : 0;
        System.out.printf("🎯 Прогресс проекта: %.1f%%%n", progress);
    }
}

/*
🎓 ЧТО ТЫ СОЗДАЛ:

✅ Система управления библиотекой (классы, инкапсуляция)
✅ Игра "Виртуальный питомец" (состояние объекта, поведение)
✅ Банковская система (валидация, безопасность)
✅ Система управления задачами (композиция классов)

🔥 ИСПОЛЬЗОВАННЫЕ КОНЦЕПЦИИ ООП:

💡 Инкапсуляция - данные скрыты внутри классов
💡 Абстракция - сложность скрыта за простыми методами
💡 Композиция - объекты содержат другие объекты
💡 Полиморфизм - разные способы создания объектов

🏆 НАВЫКИ РАЗРАБОТКИ:

- Проектирование классов с осмысленными именами
- Создание конструкторов с валидацией
- Написание методов с единственной ответственностью
- Управление состоянием объекта
- Взаимодействие между объектами

💾 Сохрани прогресс:
git add .
git commit -m "Неделя 3: Практика ООП - 4 проекта"

Теперь ты готов к изучению наследования! 🚀
*/ 
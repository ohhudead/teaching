package org.example.lessons.week01;

/**
 * 🏆 ПРАКТИЧЕСКОЕ ЗАНЯТИЕ: ПЕРВАЯ НЕДЕЛЯ
 * 
 * Это занятие объединяет все знания первой недели в практических задачах.
 * Здесь ты применишь JVM, переменные, типы данных и операторы в реальных сценариях.
 * 
 * 💡 Цель: Показать, что ты понимаешь основы и готов к следующему уровню!
 */
public class Week01_Practice {
    
    public static void main(String[] args) {
        System.out.println("🏆 ПРАКТИЧЕСКОЕ ЗАНЯТИЕ: НЕДЕЛЯ 1");
        System.out.println("=".repeat(50));
        
        // 🎯 ЗАДАЧА 1: Личная информация
        personalInfoChallenge();
        
        // 🎯 ЗАДАЧА 2: Калькулятор
        calculatorChallenge();
        
        // 🎯 ПРОЕКТЫ
        project1_PersonalInfoApp();
        project2_SimpleCalculator();
        project3_GradeAnalyzer();
        project4_TimeConverter();
        
        // 📊 Мини-тест
        miniQuiz();
        
        System.out.println("\n🎉 Отличная работа! Ты готов к неделе 2!");
    }
    
    /**
     * 🎯 ЗАДАЧА 1: Личная информация
     */
    private static void personalInfoChallenge() {
        System.out.println("\n🎯 ЗАДАЧА 1: Создай профиль пользователя");
        
        // Раскомментируй и заполни:
        /*
        String name = "Твое имя";
        int age = 20;
        double height = 1.75;
        boolean isStudent = true;
        
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height + " м");
        System.out.println("Студент: " + (isStudent ? "Да" : "Нет"));
        */
    }
    
    /**
     * 🎯 ЗАДАЧА 2: Калькулятор
     */
    private static void calculatorChallenge() {
        System.out.println("\n🎯 ЗАДАЧА 2: Простой калькулятор");
        
        // Раскомментируй и поэкспериментируй:
        /*
        int a = 15;
        int b = 4;
        
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
        */
    }
    
    /**
     * 🎯 ПРОЕКТ 1: Приложение "Личная информация"
     * 
     * Создай программу, которая собирает и обрабатывает личную информацию.
     * Используй все изученные типы данных и операторы.
     */
    private static void project1_PersonalInfoApp() {
        System.out.println("\n🎯 ПРОЕКТ 1: Личная информация");
        System.out.println("-".repeat(30));
        
        // Раскомментируй и заполни своими данными:
        
        /*
        // ЛИЧНЫЕ ДАННЫЕ
        final String FULL_NAME = "Иван Петров";
        final int BIRTH_YEAR = 2000;
        final double HEIGHT = 1.75; // в метрах
        final double WEIGHT = 70.0; // в кг
        final char GENDER = 'М'; // М или Ж
        final boolean IS_STUDENT = true;
        
        // ВЫЧИСЛЕНИЯ
        int currentYear = 2024;
        int age = currentYear - BIRTH_YEAR;
        double bmi = WEIGHT / (HEIGHT * HEIGHT);
        
        // АНАЛИЗ ИМТ
        String bmiCategory;
        if (bmi < 18.5) {
            bmiCategory = "Недостаточный вес";
        } else if (bmi < 25.0) {
            bmiCategory = "Нормальный вес";
        } else if (bmi < 30.0) {
            bmiCategory = "Избыточный вес";
        } else {
            bmiCategory = "Ожирение";
        }
        
        // ВОЗРАСТНАЯ КАТЕГОРИЯ
        String ageCategory = age < 18 ? "Несовершеннолетний" :
                            age < 65 ? "Взрослый" : "Пенсионер";
        
        // ВЫВОД РЕЗУЛЬТАТОВ
        System.out.println("=== ЛИЧНЫЙ ПРОФИЛЬ ===");
        System.out.println("ФИО: " + FULL_NAME);
        System.out.println("Возраст: " + age + " лет (" + ageCategory + ")");
        System.out.println("Пол: " + GENDER);
        System.out.println("Рост: " + HEIGHT + " м");
        System.out.println("Вес: " + WEIGHT + " кг");
        System.out.printf("ИМТ: %.1f (%s)%n", bmi, bmiCategory);
        System.out.println("Студент: " + (IS_STUDENT ? "Да" : "Нет"));
        
        // ДОПОЛНИТЕЛЬНАЯ СТАТИСТИКА
        double idealWeight = 22.0 * HEIGHT * HEIGHT; // ИМТ = 22 (средняя норма)
        double weightDifference = WEIGHT - idealWeight;
        
        System.out.printf("Идеальный вес: %.1f кг%n", idealWeight);
        if (Math.abs(weightDifference) < 2.0) {
            System.out.println("Вес в норме! 👍");
        } else if (weightDifference > 0) {
            System.out.printf("Лишний вес: %.1f кг%n", weightDifference);
        } else {
            System.out.printf("Недобор веса: %.1f кг%n", -weightDifference);
        }
        */
    }
    
    /**
     * 🎯 ПРОЕКТ 2: Простой калькулятор
     * 
     * Создай калькулятор для базовых операций.
     */
    private static void project2_SimpleCalculator() {
        System.out.println("\n🎯 ПРОЕКТ 2: Простой калькулятор");
        System.out.println("-".repeat(30));
        
        // Раскомментируй и поэкспериментируй:
        
        /*
        double num1 = 25.5;
        double num2 = 4.2;
        
        System.out.println("Число 1: " + num1);
        System.out.println("Число 2: " + num2);
        System.out.println();
        
        // ОСНОВНЫЕ ОПЕРАЦИИ
        System.out.println("=== ОСНОВНЫЕ ОПЕРАЦИИ ===");
        System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
        System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, num1 - num2);
        System.out.printf("%.2f × %.2f = %.2f%n", num1, num2, num1 * num2);
        System.out.printf("%.2f ÷ %.2f = %.2f%n", num1, num2, num1 / num2);
        System.out.printf("%.2f %% %.2f = %.2f%n", num1, num2, num1 % num2);
        
        // ПРОДВИНУТЫЕ ОПЕРАЦИИ
        System.out.println("\n=== ПРОДВИНУТЫЕ ОПЕРАЦИИ ===");
        System.out.printf("√%.2f = %.2f%n", num1, Math.sqrt(num1));
        System.out.printf("%.2f² = %.2f%n", num1, Math.pow(num1, 2));
        System.out.printf("%.2f^%.2f = %.2f%n", num1, num2, Math.pow(num1, num2));
        System.out.printf("|%.2f| = %.2f%n", -num1, Math.abs(-num1));
        
        // ОКРУГЛЕНИЯ
        System.out.println("\n=== ОКРУГЛЕНИЯ ===");
        double result = num1 / num2;
        System.out.printf("Точное значение: %.6f%n", result);
        System.out.printf("Округление до целого: %.0f%n", result);
        System.out.printf("Округление до 2 знаков: %.2f%n", result);
        System.out.printf("Целая часть: %.0f%n", Math.floor(result));
        System.out.printf("К большему целому: %.0f%n", Math.ceil(result));
        
        // СРАВНЕНИЯ
        System.out.println("\n=== СРАВНЕНИЯ ===");
        System.out.printf("%.2f > %.2f: %b%n", num1, num2, num1 > num2);
        System.out.printf("%.2f == %.2f: %b%n", num1, num2, num1 == num2);
        System.out.printf("Максимум: %.2f%n", Math.max(num1, num2));
        System.out.printf("Минимум: %.2f%n", Math.min(num1, num2));
        */
    }
    
    /**
     * 🎯 ПРОЕКТ 3: Анализатор оценок
     * 
     * Программа для анализа академической успеваемости.
     */
    private static void project3_GradeAnalyzer() {
        System.out.println("\n🎯 ПРОЕКТ 3: Анализатор оценок");
        System.out.println("-".repeat(30));
        
        // Раскомментируй и измени оценки:
        
        /*
        // ОЦЕНКИ ПО ПРЕДМЕТАМ (из 100 баллов)
        int mathGrade = 85;
        int physicsGrade = 92;
        int programmingGrade = 78;
        int englishGrade = 88;
        int historyGrade = 76;
        
        // ПОДСЧЕТ СТАТИСТИКИ
        int totalSubjects = 5;
        int totalPoints = mathGrade + physicsGrade + programmingGrade + englishGrade + historyGrade;
        double averageGrade = (double) totalPoints / totalSubjects;
        
        // ПОИСК МАКСИМУМА И МИНИМУМА
        int maxGrade = Math.max(Math.max(Math.max(Math.max(mathGrade, physicsGrade), 
                                                  programmingGrade), englishGrade), historyGrade);
        int minGrade = Math.min(Math.min(Math.min(Math.min(mathGrade, physicsGrade), 
                                                  programmingGrade), englishGrade), historyGrade);
        
        // ОПРЕДЕЛЕНИЕ БУКВЕННОЙ ОЦЕНКИ
        char letterGrade;
        if (averageGrade >= 90) {
            letterGrade = 'A';
        } else if (averageGrade >= 80) {
            letterGrade = 'B';
        } else if (averageGrade >= 70) {
            letterGrade = 'C';
        } else if (averageGrade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        
        // ОПРЕДЕЛЕНИЕ СТАТУСА
        String status = averageGrade >= 75 ? "Отличник" :
                       averageGrade >= 60 ? "Хорошист" : "Нужно подтянуться";
        
        boolean hasExcellentGrades = maxGrade >= 90;
        boolean hasFailingGrades = minGrade < 60;
        
        // ВЫВОД РЕЗУЛЬТАТОВ
        System.out.println("=== АКАДЕМИЧЕСКИЙ ОТЧЕТ ===");
        System.out.println("Математика: " + mathGrade);
        System.out.println("Физика: " + physicsGrade);
        System.out.println("Программирование: " + programmingGrade);
        System.out.println("Английский: " + englishGrade);
        System.out.println("История: " + historyGrade);
        
        System.out.println("\n=== СТАТИСТИКА ===");
        System.out.println("Общий балл: " + totalPoints);
        System.out.printf("Средний балл: %.1f%n", averageGrade);
        System.out.println("Максимальная оценка: " + maxGrade);
        System.out.println("Минимальная оценка: " + minGrade);
        System.out.println("Буквенная оценка: " + letterGrade);
        System.out.println("Статус: " + status);
        
        System.out.println("\n=== АНАЛИЗ ===");
        System.out.println("Есть отличные оценки (90+): " + (hasExcellentGrades ? "Да" : "Нет"));
        System.out.println("Есть неудовлетворительные (<60): " + (hasFailingGrades ? "Да" : "Нет"));
        
        if (averageGrade >= 85) {
            System.out.println("🏆 Поздравляем! Отличная успеваемость!");
        } else if (averageGrade >= 75) {
            System.out.println("👍 Хорошая работа! Продолжайте в том же духе!");
        } else {
            System.out.println("📚 Есть к чему стремиться. Удачи в учебе!");
        }
        */
    }
    
    /**
     * 🎯 ПРОЕКТ 4: Конвертер времени и даты
     * 
     * Работа с различными единицами времени.
     */
    private static void project4_TimeConverter() {
        System.out.println("\n🎯 ПРОЕКТ 4: Конвертер времени");
        System.out.println("-".repeat(30));
        
        // Раскомментируй и поэкспериментируй:
        
        /*
        // ИСХОДНЫЕ ДАННЫЕ
        long totalSeconds = 7384; // Количество секунд для конвертации
        
        // КОНВЕРТАЦИЯ ВРЕМЕНИ
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;
        
        // КОНВЕРТАЦИЯ В ДНИ
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        long days = totalHours / 24;
        long remainingHours = totalHours % 24;
        
        // ФОРМАТИРОВАНИЕ ВРЕМЕНИ
        String timeFormat = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        
        // ОПРЕДЕЛЕНИЕ ВРЕМЕНИ СУТОК
        String timeOfDay;
        if (hours >= 6 && hours < 12) {
            timeOfDay = "утро";
        } else if (hours >= 12 && hours < 18) {
            timeOfDay = "день";
        } else if (hours >= 18 && hours < 22) {
            timeOfDay = "вечер";
        } else {
            timeOfDay = "ночь";
        }
        
        // РАСЧЕТ ПРОИЗВОДИТЕЛЬНОСТИ
        int workingHoursPerDay = 8;
        double workingDays = (double) totalHours / workingHoursPerDay;
        
        // ВЫВОД РЕЗУЛЬТАТОВ
        System.out.println("=== КОНВЕРТЕР ВРЕМЕНИ ===");
        System.out.println("Исходное количество секунд: " + totalSeconds);
        System.out.println();
        
        System.out.println("=== ВРЕМЯ ===");
        System.out.println("Часы: " + hours);
        System.out.println("Минуты: " + minutes);
        System.out.println("Секунды: " + seconds);
        System.out.println("Формат времени: " + timeFormat);
        System.out.println("Время суток: " + timeOfDay);
        
        System.out.println("\n=== БОЛЬШИЕ ЕДИНИЦЫ ===");
        System.out.println("Общее количество минут: " + totalMinutes);
        System.out.println("Общее количество часов: " + totalHours);
        System.out.println("Дни: " + days);
        System.out.println("Оставшиеся часы: " + remainingHours);
        
        System.out.println("\n=== ПРАКТИЧЕСКИЕ РАСЧЕТЫ ===");
        System.out.printf("Рабочих дней (8ч/день): %.1f%n", workingDays);
        System.out.printf("Недель (168ч): %.1f%n", (double) totalHours / 168);
        System.out.printf("Месяцев (720ч): %.1f%n", (double) totalHours / 720);
        
        // БОНУС: Возраст в секундах
        int ageInYears = 20; // Замени на свой возраст
        long secondsInYear = 365L * 24 * 60 * 60;
        long ageInSeconds = ageInYears * secondsInYear;
        
        System.out.println("\n=== ВОЗРАСТ В СЕКУНДАХ ===");
        System.out.println("Возраст: " + ageInYears + " лет");
        System.out.println("Это примерно: " + ageInSeconds + " секунд");
        System.out.printf("Или %.2e секунд%n", (double) ageInSeconds);
        */
    }
    
    /**
     * 📊 Мини-тест
     */
    private static void miniQuiz() {
        System.out.println("\n📊 МИНИ-ТЕСТ");
        System.out.println("Что выведет: int x = 5; System.out.println(++x);");
        System.out.println("Ответ: 6 (префиксный инкремент)");
        
        System.out.println("\nЧто выведет: 7 % 3?");
        System.out.println("Ответ: 1 (остаток от деления)");
        
        System.out.println("\n🎉 Отлично! Ты готов к неделе 2!");
    }
}

/*
🎓 ПОЗДРАВЛЯЮ С ЗАВЕРШЕНИЕМ ПЕРВОЙ НЕДЕЛИ!

Ты изучил:
✅ Основы JVM и структуру Java программы
✅ Все примитивные типы данных
✅ Работу со строками
✅ Преобразование типов
✅ Все операторы Java
✅ Приоритет операторов

🔥 ЧТО ДАЛЬШЕ?

На следующей неделе ты изучишь:
- Условные конструкции (if/else/switch)
- Циклы (for/while/do-while)
- Массивы
- Методы (функции)

💡 СОВЕТЫ ДЛЯ УСПЕШНОГО ИЗУЧЕНИЯ:

1. Практикуйся каждый день хотя бы 30 минут
2. Запускай все примеры и экспериментируй с ними
3. Решай задачи на LeetCode Easy уровня
4. Не стесняйся задавать вопросы в сообществах
5. Ведите конспекты своими словами

🛠️ ДОМАШНЕЕ ЗАДАНИЕ:

1. Создай свой калькулятор для расчета чего-то полезного (кредит, скидки, конвертер валют)
2. Напиши программу "О себе" с интересной статистикой
3. Поэкспериментируй с различными комбинациями операторов

💾 НЕ ЗАБУДЬ:
git add .
git commit -m "Завершена неделя 1: Основы Java"
git push

Готов к неделе 2? Увидимся в следующих занятиях! 🚀
*/ 
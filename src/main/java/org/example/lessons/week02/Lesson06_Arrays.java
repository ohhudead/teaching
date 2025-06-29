package org.example.lessons.week02;

/**
 * 📦 ЗАНЯТИЕ 6: МАССИВЫ
 * 
 * Массивы - это контейнеры для хранения множества значений одного типа.
 * Это базовая структура данных, с которой должен уметь работать каждый программист.
 * 
 * 💡 Жаргон разработчика:
 * - Array (Массив) - структура данных фиксированного размера
 * - Index (Индекс) - номер позиции элемента в массиве (начинается с 0)
 * - Length (Длина) - количество элементов в массиве
 * - Element (Элемент) - отдельное значение в массиве
 * - Bounds checking - проверка выхода за границы массива
 */
public class Lesson06_Arrays {
    
    public static void main(String[] args) {
        System.out.println("📦 ИЗУЧАЕМ МАССИВЫ\n");
        
        createArrays();
        workWithElements();
        arrayOperations();
        practice();
    }
    
    private static void createArrays() {
        System.out.println("📦 Создание массивов:");
        
        // Создание пустого массива
        int[] numbers = new int[5];
        System.out.println("Размер массива: " + numbers.length);
        
        // Инициализация при создании
        int[] scores = {85, 92, 78, 96, 88};
        System.out.print("Оценки: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        
        // Массив строк
        String[] fruits = {"яблоко", "банан", "апельсин"};
        System.out.println("Фрукты: " + java.util.Arrays.toString(fruits));
        
        System.out.println();
    }
    
    private static void workWithElements() {
        System.out.println("🔍 Работа с элементами:");
        
        String[] cities = {"Москва", "СПб", "Новосибирск"};
        
        // Доступ по индексу (начинается с 0!)
        System.out.println("Первый город: " + cities[0]);
        System.out.println("Последний: " + cities[cities.length - 1]);
        
        // Изменение элемента
        cities[1] = "Санкт-Петербург";
        System.out.println("Изменили: " + cities[1]);
        
        // Поиск элемента
        String search = "Москва";
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals(search)) {
                System.out.println(search + " найден на позиции " + i);
                break;
            }
        }
        
        System.out.println();
    }
    
    private static void arrayOperations() {
        System.out.println("🧰 Операции с массивами:");
        
        int[] data = {45, 12, 89, 67, 23};
        System.out.println("Массив: " + java.util.Arrays.toString(data));
        
        // Поиск минимума и максимума
        int min = data[0], max = data[0];
        for (int value : data) {
            if (value < min) min = value;
            if (value > max) max = value;
        }
        System.out.println("Минимум: " + min + ", Максимум: " + max);
        
        // Сумма элементов
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + (double) sum / data.length);
        
        System.out.println();
    }
    
    private static void practice() {
        System.out.println("🎯 Практика:");
        
        // ЗАДАНИЕ 1: Температуры
        /*
        int[] temperatures = {-5, 0, 3, 8, 12, 18, 22, 25, 20, 15, 8, 1};
        String[] months = {"Янв", "Фев", "Мар", "Апр", "Май", "Июн", 
                          "Июл", "Авг", "Сен", "Окт", "Ноя", "Дек"};
        
        System.out.println("Температура по месяцам:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println(months[i] + ": " + temperatures[i] + "°C");
        }
        
        // Среднегодовая температура
        int sum = 0;
        for (int temp : temperatures) {
            sum += temp;
        }
        System.out.println("Средняя температура: " + (double) sum / temperatures.length + "°C");
        */
        
        // ЗАДАНИЕ 2: Таблица умножения
        /*
        int[][] table = new int[10][10];
        
        // Заполняем таблицу
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        
        // Выводим часть таблицы
        System.out.println("Таблица умножения (5x5):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d ", table[i][j]);
            }
            System.out.println();
        }
        */
        
        // ЗАДАНИЕ 3: Сортировка
        /*
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("До сортировки: " + java.util.Arrays.toString(numbers));
        
        // Простая сортировка пузырьком
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Меняем местами
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        
        System.out.println("После сортировки: " + java.util.Arrays.toString(numbers));
        */
    }
}

/*
🎓 ЧТО ТЫ ИЗУЧИЛ:

✅ Создание массивов
✅ Доступ к элементам по индексу
✅ Перебор массивов
✅ Поиск элементов
✅ Базовые операции

🔥 КЛЮЧЕВЫЕ МОМЕНТЫ:

💡 Индексы начинаются с 0
💡 array.length - размер массива
💡 Enhanced for для простого перебора
💡 Проверяй границы массива

💾 Сохрани:
git add .
git commit -m "Урок 6: Массивы"
*/ 
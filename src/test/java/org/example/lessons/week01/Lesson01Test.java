package org.example.lessons.week01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 🧪 ТЕСТИРОВАНИЕ: Урок 1
 * 
 * Это простой пример тестирования для демонстрации работы JUnit.
 * Пока просто запусти тесты, чтобы убедиться, что все работает.
 * 
 * Как запустить тесты в IntelliJ IDEA:
 * 1. Кликни правой кнопкой на класс
 * 2. Выбери "Run 'Lesson01Test'"
 * 3. Или используй Ctrl+Shift+F10
 */
public class Lesson01Test {
    
    @Test
    void testBasicMath() {
        // Тестируем базовые математические операции
        int a = 5;
        int b = 3;
        
        assertEquals(8, a + b, "Сложение должно работать правильно");
        assertEquals(2, a - b, "Вычитание должно работать правильно");
        assertEquals(15, a * b, "Умножение должно работать правильно");
        assertEquals(1, a / b, "Целочисленное деление должно работать правильно");
        assertEquals(2, a % b, "Остаток от деления должен быть правильным");
    }
    
    @Test
    void testStringOperations() {
        // Тестируем работу со строками
        String greeting = "Привет";
        String name = "Java";
        String fullGreeting = greeting + ", " + name + "!";
        
        assertEquals("Привет, Java!", fullGreeting, "Конкатенация строк должна работать");
        assertTrue(fullGreeting.contains("Java"), "Строка должна содержать 'Java'");
        assertEquals(13, fullGreeting.length(), "Длина строки должна быть 13 символов");
    }
    
    @Test
    void testBooleanLogic() {
        // Тестируем логические операции
        boolean isRaining = true;
        boolean hasUmbrella = false;
        
        assertFalse(isRaining && hasUmbrella, "И: дождь И зонт = false");
        assertTrue(isRaining || hasUmbrella, "ИЛИ: дождь ИЛИ зонт = true");
        assertFalse(!isRaining, "НЕ: НЕ дождь = false");
    }
    
    @Test
    void testTypeConversion() {
        // Тестируем преобразование типов
        int intValue = 42;
        double doubleValue = intValue; // Неявное преобразование
        
        assertEquals(42.0, doubleValue, "int должен преобразовываться в double");
        
        String stringValue = String.valueOf(intValue);
        assertEquals("42", stringValue, "int должен преобразовываться в String");
    }
    
    @Test
    void testIncrementOperators() {
        // Тестируем операторы инкремента
        int counter = 5;
        
        assertEquals(5, counter++, "Постфиксный инкремент возвращает старое значение");
        assertEquals(6, counter, "После постфиксного инкремента значение должно увеличиться");
        
        assertEquals(7, ++counter, "Префиксный инкремент возвращает новое значение");
        assertEquals(7, counter, "После префиксного инкремента значение остается новым");
    }
}

/*
🧪 О ТЕСТИРОВАНИИ В JAVA:

Тесты - это код, который проверяет другой код!

✅ @Test - аннотация для обозначения тестового метода
✅ assertEquals(expected, actual) - проверяет равенство
✅ assertTrue/assertFalse - проверяет булевы значения  
✅ assertNotNull - проверяет, что объект не null

🔥 ЗАЧЕМ НУЖНЫ ТЕСТЫ:
- Проверяют, что код работает правильно
- Помогают найти ошибки рано
- Документируют поведение кода
- Дают уверенность при изменениях

💡 В ПРОФЕССИОНАЛЬНОЙ РАЗРАБОТКЕ:
- Тесты пишутся для каждой функции
- Тесты запускаются автоматически
- Без тестов код не попадает в продакшн

Не волнуйся, если пока не все понятно - 
тестированию будет посвящен отдельный урок! 🚀
*/ 
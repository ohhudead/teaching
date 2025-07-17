package org.example.test;

import org.example.dto.InputIntegerRules;
import org.example.dto.WrongInputException;
import org.example.dto.rules.MaximumValueRule;
import org.example.dto.rules.MoreThanZeroRule;

import java.util.List;
import java.util.Scanner;

public class Square {
    public static Scanner scanner = new Scanner(System.in);
    public static String widthMsg = "Введите ширину: ";
    public static String heightMsg = "Введите высоту: ";
    public static String areaMsg = "Площадь: %s";
    public static String perimeterMsg = "Периметр: %s";

    public static List<InputIntegerRules> rules = List.of(
            new MaximumValueRule(),
            new MoreThanZeroRule()
    );

    public static void main(String[] args) {
        var widht = sendMessageAndGetInput(widthMsg);
        var height = sendMessageAndGetInput(heightMsg);

        int area = widht * height;
        int perimeter = 2 * (widht + height);

        sendMessage(areaMsg, area);
        sendMessage(perimeterMsg, perimeter);
    }

    public static void sendMessage(String message, Object... args) {
        System.out.printf((message) + "%n", args);
    }

    public static int sendMessageAndGetInput(String message) {
        while (true) {
            try {
                System.out.println(message);
                return getPositiveInt();
            } catch (NumberFormatException e) {
                System.out.println("It is not integer!");
            } catch (WrongInputException e) {
                System.out.println("Данное число не подходит по формату");
            }
        }
    }

    public static int getPositiveInt() {
        var str = scanner.next();
        var parsed = Integer.parseInt(str);
        for(InputIntegerRules rule: rules){
            rule.checkAndThrow(parsed);
        }
        return parsed;
    }


}

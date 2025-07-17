package org.example.test;

public class ZooAccess {
    public static void main(String[] args) {
        isAccessibleToZoo(5, true);
        isAccessibleToZoo(4, false);
        isAccessibleToZoo(5, false);
        isAccessibleToZoo(4, true);
    }


    private static void isAccessibleToZoo(int age, boolean hasTicket) {
        if (hasTicket && age >= 5) {
            System.out.println("Вход разрешен");
        } else {
            System.out.println("Вход запрещен");
        }
    }
}
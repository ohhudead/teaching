package org.example.test;

public class Calculate {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 20;
        var testClass = new TestClass();
        testClass.setPrice(2);
        String name = "Ваня";
        String message = "стоимость абонемента %s рублей для клиента %s %n".formatted( testClass, name);
        System.out.println(message);
        
//        System.out.println("стоимость абонемента " + 4 + " рублей дл клиента " + name);
//        System.out.printf("стоимость абонемента %s рублей для клиента %s %n", 4, name);
//        System.out.println("Сложение = " + (a+b));
//        System.out.println("Вычитание =");
//        so

    }

}

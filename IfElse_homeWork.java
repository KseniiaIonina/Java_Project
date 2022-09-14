package Java.Hometask;

import java.util.Scanner;

public class IfElse_homeWork {
    public static void main(String[] args) {

                int x = 12;
                int y = 5;
                int z = 3;
                //    Логический оператор И (&&), придумать пример с ленивого
                //    исполнен я условия для оператора И (то есть когда выполняется
                //    только первое условие)
                if (x > y && y == z) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
//Логический оператор "ИЛИ" (||)
//Логический оператор НЕ (!)
//Для самостоятельной практики напишите несколько
// блоков «if» с этими логическими операторами.
                if (x != y || x * y < z) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }

                if (x <= y || x != z)  {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }




            //Напишите метод который принимает на вход число в диапазон
            // от 1 до 100 и возвращает true  если это четное число,
            // и false если оно не четное.
            Scanner scanner = new Scanner(System.in);
        System.out.println("Write number from 1 before 100");
        int a = scanner.nextInt();
        if (a%2 == 0) {
            System.out.println("number " + a + " is even numbers");
        } else {
            System.out.println("number " + a + " is not even numbers");
        }

    }
}





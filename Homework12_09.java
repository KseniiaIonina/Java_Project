package practika.Practic_0909;

import java.util.Scanner;

public class Homework12_09 {
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

    evenNumbers(22);

    }
    //Напишите метод который принимает на вход число в диапазон
    // от 1 до 100 и возвращает true  если это четное число,
    // и false если оно не четное.
//    public static void evenNumbers (int a) {
//        Scanner scanner = new Scanner (System.in);
//        System.out.println("Write acount from 1 befor 100");
      int a = scanner.nextInt();
        final boolean b = a % 2 == 0;
        if (a % 2 == 0) {
            System.out.println("number " + a "is even numbers");
        }else {
            System.out.println("number " + a is not even numbers");
        }

    }
    }



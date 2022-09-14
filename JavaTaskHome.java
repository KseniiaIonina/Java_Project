package org.example;

public class JavaTaskHome {
    public static void main(String[] args) {

    }
   //     C помощью оператора if написать метод возвращающий сумму двух
        //     целых чисел. А в случае если эти числа равны, возвращающий
        //     двойную сумму.
     //   3+5 -> 8
     //   5+5 -> 20
        public static int sumNumbers(int a, int b) {
            if (a == b) {
                int sum = (a + b) * 2;
                return sum;
                System.out.println(" If a = b than " + sum);
            } else {
                int sum = a + b;
                System.out.println("If a != b  than " + sum);
            }
        }

       // Second level: C помощью оператора if написать метод,
        // принимающий целое число n и выводящий на экран надпись
        // является ли оно положительным , отрицательным или нулем.
     int c;
    public static void int Numder(int c) {
    if(c >0) {
        System.out.println("Number " + c + "is more than 0");}
    if (c < 0) {
        System.out.println("Number " + c + "is less than 0");
    }
    if (c == 0) {
        System.out.println("Number " + c + "is = 0");
    }
    }
}



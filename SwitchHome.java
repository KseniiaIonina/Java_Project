package org.example;

public class SwitchHome {
    public static void main(String[] args) {
        //Переписать следующий код с использованием  switch case:
        char ch = 'b';

        if (ch == 'd') {
            System.out.println("Case1");
        }
        if (ch == 'b') {
            System.out.println("Case2");
        }
        if (ch == 'x') {
            System.out.println("Case3");
        }
        if (ch == 'y') {
            System.out.println("Case4");
        }

        switch (ch) {
            case 'd':
                System.out.println("Case1");
                break;
            case 'b':
                System.out.println("Case2");
                break;
            case 'x':
                System.out.println("Case3");
                break;
            case 'y':
                System.out.println("Case4");
                break;

        }
    }
}
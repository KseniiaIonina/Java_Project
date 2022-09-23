package org.example.Tasks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Home_Task {
    public static void main(String[] args) {
        System.out.println(Cont10(9,10));
        System.out.println(Cont10(9,8));
        System.out.println(Cont10(1,9));
        Numbers(3,4,5);
        Numbers(3,3 ,5);
        Numbers(2,2,2);
        Numbers(4,5,4);
        Numbers(5, 8,8);
    }

  //  Даны два целые числа a и b. Написать метод, возвращающий true  если одно из чисел равно 10 или
    //  сумма этих чисел равна 10. пример:
  //  isTen(9,10)-> true
  //  isTen(9,8)-> false
   // isTen(1,9)-> true
    public static boolean Cont10 (int a, int b) {
        boolean isTen = a == 10 || b ==10 || (a + b)==10;
        return isTen;
    }
//Напишите метод, который принимает три числа и выводит на экран
//"All numbers are equal" если все они равны
//"All numbers are different" если все они разные
//"Some numbers are equal" если какие то из них равны
  public static void Numbers(int x, int y, int z) {
        if (x == y && y ==z) {
            System.out.println("All numbers are equal");
    } if (x!=y && x!=z && y!=z) {
          System.out.println("All numbers are different");
      } if (x ==y || y ==z || x==z) {
          System.out.println("Some numbers are equal");
      }
      }


  }

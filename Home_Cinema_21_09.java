package org.example.Java_class;

public class Home_Cinema_21_09 {
    public static void main(String[] args) {
    showFilm(0, 12);
    yearLeap(2016);
    }
//Представьте, что вы пишите программу для онлайн кинотеатра.
// У вас известно возрастное ограничение  фильма и возраст клиента
// (естественно заданы в виде переменных). Ваша программа должна  выдавать
// на экран: «вы можете смотреть этот фильм» или «данный контент вам не доступен»
    public static void showFilm(int ageFilm, int ageClient){
    boolean canSee = ageFilm>=18 && ageClient >=18;
       if (canSee){
           System.out.println("вы можете смотреть этот фильм");
       } else {
           System.out.println("данный контент вам не доступен");
       }

    }

 //   Допустим, вам дано целое число, которое обозначает год. Напишите метод
    //   который определяет, этот год високосный или нет
    public static void yearLeap( int year) {
        float leapYear = year%4;
        if (leapYear == 0){
            System.out.println("This year is leap");
        } else {
            System.out.println("This year is not ");
        }
    }

}

package ru.skypro;

import com.sun.source.tree.BreakTree;

import java.time.LocalDate;
import java.time.Year;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        leapYear(2018);
        platformPhone(2012, 1);
        System.out.println("Дней для доставки " + deliveryDays(100));
        repetitionLetters("repetitionLetters");
        //И ниже я не поянт что происходит
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        reversalArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    // region task1
    public static void leapYear (int year) {
        boolean leapYear = isleap(year);
        if (leapYear) {
            System.out.println(year + " Высокостный год!");
        } else {
            System.out.println(year + " Не високостный год!");
        }
    }

    public static boolean isleap(int year) {
        return  year % 4 == 0 && year % 100 !=0 || year % 400 == 0;
    }
    //В каких случаях мы вот эту строчку "выше" прописываем?
    //endregion

    // region task2
    public static void platformPhone (int platformYear, int ClientOS) {
        int currentYear = LocalDate.now().getYear();
        //Что эта строчка "Выше" обозначает?

        if (ClientOS == 0) {
            if (platformYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите приложение для iOS по ссылке");
            }
        } else {
            if (platformYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите приложение для Android по ссылке");
            }
        }
    }
    //endregion

    // region task3
    public static int deliveryDays(int deliveryDistance ) {
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }
    //endregion

    // region task4
    public static void repetitionLetters(String str) {
        char[] letters = str.toCharArray();

        char prevChar = Character.MAX_VALUE;

        // Почему тут прописывается эта строка? "ВЫше которая"
        for (char c : letters) {
            if (c == prevChar) {

                System.out.println("Дубликат найден " + c);
                return;
            }
            prevChar = c;
        }
        System.out.println("Дубликат ней найден");
        //Я не особо понял как тут, всё прописсанно и что за что отвечает можете мне подробней расписать, что тут и как?
    }

    //endregion

    //region task5
    public static void reversalArray(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int head = 0;
        int tail = arr.length - 1;

        while (head < tail) {
            int tmp = arr[head];
            arr[head++] = arr[tail];
            arr[tail--] = tmp;
            //Тут я вообще не понял что тут произходит?!?!?!?!?!?!?!?
        }
    }

    //endregion
}
//1.	Выбор за вами, но перед началом задания попробуйте подумать.
//Пользователь вводит число, вам нужно указать какой это месяц по счету.
//На выбор вы можете использовать конструкцию как switch так и if else if
//Если вы выбрали if else - указать почему, какие преимущества дает по сравнению со switch для данного задания.
//Если вы выбрали switch - Также.

package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Day;
        System.out.println("Введите день месяца 1.2.3.4.5.6");
        Scanner in = new Scanner(System.in);
        Day = in.nextInt();
        switch (Day) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            default:
                System.out.println("на сегодня достаточно");

        }
    }
}

//3.	**Используя конструкцию if else написать fizz_buzz для случайных чисел.
//Если случайное число делиться ТОЛЬКО нацело на 3 - вывести FIZZ
//Если случайное число делиться ТОЛЬКО нацело на 5 - вывести BUZZ
//Если случайное число делиться на 3 и на 5 - вывести FIZZ_BUZZ
//Во всех остальных случаях, вывести число.
//Вывод является таким:
//Число %число% является fizz_buzz
//ЛИБО
//Число %число% не является fizz_buzz
//
//
//Для генерации случайного числа можете использовать конструкцию:
//int random = (int)(Math.random()*100);
//Но можете и сканер.
//Решений задачи - очень много. Самое простое, во время вычислений использовать boolean значение которое будет говорить подходит ли вам число.
//Например:
//```
//String.format("Число %d %s является fizz_buzz", random, ********);
//где ****** - тернарник.

package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100);
//        int number;
//        System.out.println("Введите число ");
//        Scanner in = new Scanner(System.in);
//        number = in.nextInt();

        if (random > 3) {
            System.out.println("Fizz");
        } else if (random < 3 ) {
            System.out.println("BuZZ");
        } else {
            System.out.println("BuZZ + FIZZ");

        }

    }
}

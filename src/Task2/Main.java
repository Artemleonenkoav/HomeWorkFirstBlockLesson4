//2.	Пользователь вводит:
//(задание со * решить только с используя scanner, во всех остальных случаях используйте 2 варианта: пользователю есть 18 и нет с заранее записанными данными)
//Свое имя, возраст а также свой пол.
//Если возраст человека больше 18 - вывести:
//Пользователь %имя% вам %кол-во% лет и ваш пол %пол%. Вам доступен доступ.
//Во всех остальных случаях - написать:
//Вам не достаточно лет.


package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        System.out.println("Введите своё имя ");
        Scanner in = new Scanner(System.in);
        name = in.nextLine();

        String man;
        System.out.println("Введите ваш пол ");
        Scanner sc = new Scanner(System.in);
        man = in.nextLine();

        int Age;
        System.out.println("Введите сколько вам лет");
        Scanner sc2 = new Scanner(System.in);
        Age = in.nextInt();
        if (Age > 18) {
            System.out.printf("Пользователь %s,ваш пол %s,вам %s лет", name, man, Age);
        } else {
            System.out.println("Вам не достаточно лет");
        }
    }
}

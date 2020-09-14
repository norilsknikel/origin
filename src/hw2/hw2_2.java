package hw2;

import java.util.Scanner;

public class hw2_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Ведите число:");

            if (scan.hasNextInt()) {
                int number = scan.nextInt();

                while (number != 0) {
                    sum += (number % 10);
                    number /= 10;
                }

                System.out.println("Сумма цифр введенного числа " + sum);
            } else {
                System.out.println("Вы ввели не верное значение");
            }
        //}
    }
}

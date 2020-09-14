package hw2;

import java.util.Scanner;

public class hw_2_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type1 = null;
        String type2 = null;
        System.out.println("Введите число:");

        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            if (number % 2 == 0) {
                type1 = "четное";
            } else {
                type1 = "нечетное";
            }
            if (number > 0) {
                type2 = "положительное";

            } else if (number < 0) {
                type2 = "отрицательное";

            } else {
                type2 = "нулевое";
                type1 = "";
            }
        } else {
            System.out.println("Вы ввели не верные данные");
        }
        System.out.println("Вы ввели: " + type1 + " " + type2 + " " + "число");

    }
}

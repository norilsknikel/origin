package hw2;

import java.util.*;
import java.util.Scanner;

public class hw_2_7 {
    public static void main(String[] args) {

        Map<Integer, Double> citiesPrice = new HashMap<>();
        citiesPrice.put(905, 4.15);
        citiesPrice.put(194, 1.98);
        citiesPrice.put(491, 2.69);
        citiesPrice.put(800, 5.00);

        Map<Integer, String> citiesCodes = new HashMap<>();
        citiesCodes.put(905, "Москва");
        citiesCodes.put(194, "Ростов");
        citiesCodes.put(491, "Краснодар");
        citiesCodes.put(800, "Киров");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите код города:");

        if (scan.hasNextInt()) {

            int citiesCode = scan.nextInt();
            System.out.println("Введите колисчество минут разговора:");

            int timeCall = scan.nextInt();

            switch (citiesCode) {
                case 905:
                    System.out.println(citiesCodes.get(905) + ": стоимость разговора " + citiesPrice.get(905) * timeCall);
                    break;

                case 194:
                    System.out.println(citiesCodes.get(194) + ": стоимость разговора " + citiesPrice.get(194) * timeCall);
                    break;

                case 491:
                    System.out.println(citiesCodes.get(491) + ": стоимость разговора " + citiesPrice.get(491) * timeCall);
                    break;

                case 800:
                    System.out.println(citiesCodes.get(800) + ": стоимость разговора " + citiesPrice.get(800) * timeCall);
                    break;

                default:
                    System.out.println("Город не найден");
            }

        } else {
            System.out.println("Введенные данные не верны");
        }

    }
}

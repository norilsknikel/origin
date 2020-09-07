import java.util.*;

public class hw_2_8 {
    public static void main(String[] args) {

        Integer[] num = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите операцию:" +
                "\n1. Вывод максимального числа" +
                "\n2. Вывод суммы положительных элементов" +
                "\n3. Вывод суммы четных отрицательных элементов" +
                "\n4. Вывод количества положительных элементов" +
                "\n5. Вывод  среднее арифметическое отрицательных элементов" +
                "\n6. Выход из программы");

        int choice = 0;
        while (choice != 6) {

            if (scan.hasNextInt()) {

                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        Arrays.sort(num, Collections.reverseOrder());
                        System.out.println("Максимальное число: " + num[0]);
                        break;

                    case 2:
                        double counter = 0;
                        double sum = 0;
                        for (int i = 0; i < num.length; i++) {
                            if (num[i] > 0) {
                                sum = sum + num[i];
                                counter++;
                            }
                        }
                        System.out.println("Сума положительных элементов массива: " + sum);
                        break;

                    case 3:
                        counter = 0;
                        sum = 0;
                        for (int i = 0; i < num.length; i++) {
                            if (num[i] < 0 && num[i] % 2 == 0) {
                                sum = sum + num[i];
                                counter++;
                            }
                        }
                        System.out.println("Сума четных отрицательных элементов: " + sum);
                        break;

                    case 4:
                        counter = 0;
                        for (int i = 0; i < num.length; i++) {
                            if (num[i] > 0) {
                                counter += 1;
                            }
                        }
                        System.out.println("Количество положительных элементов " + counter);
                        break;

                    case 5:
                        double average;
                        counter = 0;
                        sum = 0;
                        for (int j = 0; j < num.length; j++) {
                            if (num[j] < 0) {
                                sum += num[j];
                                counter += 1;
                            }
                        }
                        average = sum / counter;

                        System.out.println("Среднее арифметическое отрицательных элементов " + average);
                }


            } else {
                System.out.println("Введенные данные не верны");
            }
        }
    }
}







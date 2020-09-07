import java.util.Scanner;

public class hw_2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите число:");
        if(scan.hasNextInt()) {
            int num = scan.nextInt();
            if (num > 0) {
                num++;

                System.out.println("Результат операции:" + num);
            } else {

                System.out.println("Ваше число меньеш нуля, результат:" + num);
            }
        } else {

            System.out.println("Вы ввели не верное значение");
        }

    }
}

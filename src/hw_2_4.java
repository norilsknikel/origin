import java.util.Scanner;

public class hw_2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите число:");
        int result;

        if(scan.hasNextInt()) {
            int num = scan.nextInt();
            if (num > 0) {
                num++;

                System.out.println("Результат операции:" + num);

            } else if (num < 0){
                result = num - 2;
                System.out.println("Ваше число больше нуля, результат:" + result);

            } else {
                result = 10;
                System.out.println("Ваше число равно нулю, результат:" + result);
            }
        } else {
            System.out.println("Вы ввели не верное значение");
        }

    }
}

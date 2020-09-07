import java.util.Scanner;

public class hw_2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите первое число:");
        if(scan.hasNextInt())
        {
            int number1 = scan.nextInt();

            System.out.println("Ведите второе число:");
            int number2 = scan.nextInt();

            System.out.println("Ведите третье число:");
            int number3 = scan.nextInt();

            System.out.println("Наименьшее число:" + Math.min(number1, Math.min(number2, number3)));
        }
    }
}

import java.util.Scanner;
public class hw_2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите цифру: ");
        int num = in.nextInt() % 10 ;

        System.out.println("Ваша цифра: " + num);
    }
}

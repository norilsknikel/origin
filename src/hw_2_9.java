import java.util.*;
public class hw_2_9 {
    public static void main(String[] args) {

        Integer[] array = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};

        Integer[] arr = new Integer[array.length];

        for(int i = 0; i < array.length; i++ ){
            arr[i] = array[array.length - i - 1];
        }
        System.out.println(Arrays.toString(arr));
    }
}

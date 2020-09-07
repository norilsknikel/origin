import java.util.Arrays;

public class hw_2_10 {
    public static void main(String[] args) {
        Integer[] array = {15, 0, 51, -6, -5, 0, -10, -34, 0, 32, 56, -12, 24, -52};

        Integer[] arr = new Integer[array.length];

        int j = 0;

        for (int i =0; i < array.length; i++) {
            if(array[i] != 0){
                arr[j++] = array[i];
            }
        }

        for (; j< arr.length; j++){
            arr[j] = 0;

        }
        System.out.println(Arrays.toString(arr));
    }
}

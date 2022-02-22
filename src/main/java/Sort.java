import java.util.Arrays;

public class Sort {
    public static int[] bubble(int[] arr) {
        boolean swapped;
        do{
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }while (swapped);
        return arr;
    }
}
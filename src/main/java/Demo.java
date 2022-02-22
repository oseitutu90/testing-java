import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int [] numbers = {12,45,6,78,89,6,86,32,34,45,70};
        int [] sortedNumbers = {0, 2, 4, 5, 6, 9, 10, 11, 22, 25, 30, 35, 45, 55, 66, 77, 80, 94, 100};
        int pos = Searching.linearSearch(numbers,8);

        int pos2 = Searching.binarySearch(sortedNumbers,10,0,sortedNumbers.length);
        System.out.println(" > " + pos2);
        System.out.println(Arrays.toString(Sort.bubble(numbers)));

        System.out.println("This is what we want" + Arrays.toString(numbers));
    }

}

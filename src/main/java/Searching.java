public class Searching {
    public static int linearSearch(int[] dataset, int target) {
        for (int i = 0; i < dataset.length; i++) {
            if (dataset[i] == target) {
                return i;
            }

        }
        return -1;
    }

    public static int binarySearch (int [] dataset, int target, int start, int end ){
        int middle = (int)Math.floor(((start + end)/2));//  Find the
        int value = dataset[middle];

        if (target > value){
            System.out.println(target + " > " + value);
           return  binarySearch(dataset, target, middle  + 1 , end);
        }
        else if (target < value){
            System.out.println(target + " < " + value);
            return binarySearch(dataset, target, start, middle  - 1);
        }
        return middle;
    }
}
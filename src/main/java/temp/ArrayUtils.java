package temp;

public class ArrayUtils {
    public int maxArray(int[] array){
        if (array.length == 0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}

import java.lang.reflect.Array;

public class Exercise09 {
    public static void main(String[] args) {
        int theArray[] = {-1,-2,-3,-4,-5,-6,-3,-2};
        int c= maxValue(theArray);
        System.out.println(c);
    }
    public static int maxValue (int [] array) {
        int max=array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>max) {
                max=array[i];
            }

        }
        return max;
    }

}

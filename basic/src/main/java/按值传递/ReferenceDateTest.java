package 按值传递;

import java.util.Arrays;

public class ReferenceDateTest {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println("change前的数组----->" + Arrays.toString(array));
        change(array);
        System.out.println("change后的数组----->" + Arrays.toString(array));
    }

    private static void change(int[] array) {
        array[0] = 9;
        array[1] = 8;
    }
}
/**
 * 结果
 * change前的数组----->[1, 2, 3, 4]
 * change后的数组----->[9, 8, 3, 4]
 */
//证明Java不是按照引用传递
class ReferenceDateRevert{
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println("change前的数组----->" + Arrays.toString(array));
        change(array);
        System.out.println("change后的数组----->" + Arrays.toString(array));
    }

    private static void change(int[] array) {
        array = new int[]{9, 8, 7, 6};
        System.out.println("change方法的数组----->" + Arrays.toString(array));
    }
    /**
     * 结果
     * change前的数组----->[1, 2, 3, 4]
     * change方法的数组----->[9, 8, 7, 6]
     * change后的数组----->[1, 2, 3, 4]
     */
}
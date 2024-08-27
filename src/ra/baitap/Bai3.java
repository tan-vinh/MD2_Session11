package ra.baitap;

import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9};

        int sum = Arrays.stream(a).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}

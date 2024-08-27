package ra.baitap;

import java.util.Arrays;

public class Bai5 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9};

        Arrays.stream(a).forEach(System.out::println);
    }
}

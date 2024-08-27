package ra.baitap;

import java.util.Arrays;

public class Bai1 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9};

        int b = Arrays.stream(a).max().getAsInt();
        System.out.println(b);
    }
}

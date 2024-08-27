package ra.baitap;

import java.util.Arrays;

public class Bai4 {
    public static void main(String[] args) {
        String[] str = new String[]{"B", "A", "D", "C", "H", "F"};

        Arrays.stream(str).sorted().forEach(System.out::println);
    }
}

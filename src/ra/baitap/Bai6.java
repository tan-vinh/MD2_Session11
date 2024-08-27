package ra.baitap;

import java.util.Arrays;

public class Bai6 {
    public static void main(String[] args) {
        String[] str = new String[]{"a", "b", "c", "d", "e", "f"};

        Arrays.stream(str).map(String::toUpperCase).forEach(System.out::println);
    }
}

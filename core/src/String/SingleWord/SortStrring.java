package String.SingleWord;

import java.util.Arrays;

public class SortStrring {

    public static void main(String[] args) {
        String str = "india";

        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println("String after soring " + String.valueOf(arr));
    }
}

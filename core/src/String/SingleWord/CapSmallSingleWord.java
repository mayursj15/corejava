package String.SingleWord;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CapSmallSingleWord {

    public static void main(String[] args) {
        String str = "Mumbai";
        System.out.println("Caps first and last Letter :: " + capsFirstAndLastLetter(str));
        System.out.println("small first and last Letter :: " + smallFirstAndLastLetter(str));
    }

    private static String smallFirstAndLastLetter(String str) {
        return IntStream.range(0, str.length())
                .mapToObj(x -> (x == 0 || x == str.length() - 1) ? Character.toLowerCase(str.charAt(x)) : str.charAt(x))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private static String capsFirstAndLastLetter(String str) {
        String res = "";

        res = IntStream.range(0, str.length())
                .mapToObj(x -> x == str.length() - 1 ? Character.toUpperCase(str.charAt(x)) : str.charAt(x))
                .map(String::valueOf)
                .collect(Collectors.joining());

        return res;
    }
}

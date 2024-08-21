package String.SingleWord;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseSingleWord {
    public static void main(String[] args) {
        String str = "Mumbai";
        System.out.printf("\nLambda :: Reverse of String :: %s is ::%s", str, reverseString1(str));
        System.out.printf("\nString Builder :: Reverse of String :: %s is ::%s", str, reverseString2(str));
        System.out.printf("\nStack :: Reverse of String :: %s is ::%s", str, reverseStringStack(str));
    }

    private static String reverseStringStack(String str) {
        String reverseString = "";
        char[] chars = str.toCharArray();
        Stack<String> stack = new Stack<>();
        for (char x : chars)
            stack.push(String.valueOf(x));
        while (!stack.isEmpty()) reverseString = reverseString + stack.pop();
        return reverseString;
    }

    private static String reverseString1(String str) {
        return IntStream.range(0, str.length())
                .mapToObj(x -> str.charAt(str.length() - 1 - x))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private static String reverseString2(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}

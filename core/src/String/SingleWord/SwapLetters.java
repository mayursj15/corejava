package String.SingleWord;

public class SwapLetters {

    public static void main(String[] args) {
        String str = "Mumbai";
        System.out.println("After swappning ::" + swapping(str));

    }

    private static String swapping(String str) {

        String res = "";

        char[] charArray = str.toCharArray();

        for (int i = 0; i < str.length(); i = i + 2) {
            char swap = charArray[i];
            charArray[i] = charArray[i+1];
            charArray[i+1] = swap;
        }

        res = new String(charArray);

        return res;
    }

}

package String.SingleWord;

public class GetSetCharacter {

    public static void main(String[] args) {
        String str = "Mumbai";
        System.out.println(str.charAt(2));
        System.out.println((char) str.codePointAt(2));

        String str1 = "Muvbai";
        StringBuilder sb = new StringBuilder(str1);
        sb.setCharAt(2, 'm');
        System.out.printf(sb.toString());

    }
}

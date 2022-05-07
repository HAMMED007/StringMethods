package Method;

public class StringMethods {


    void printEveryOther(String words) {


        for (int i = 0; i < words.length(); i = i + 2) {

            System.out.println(words.charAt(i));

        }
    }

      public static int longerLength(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();


        return Math.max(length1, length2);
    }

    public static String lastNChars(String characters, int n) {

        return characters.substring(characters.length() - n);

    }
    public static String secondIndexOf (String characters, char m){

        String result = String.valueOf(characters.indexOf(m, characters.indexOf(m) + 1));
        return result;


    }
}

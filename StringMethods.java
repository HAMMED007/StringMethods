package Method;

public class StringMethods {


    void printEveryOther(String words) {


        for (int i = 0; i < words.length(); i = i + 2) {

            System.out.println(words.charAt(i));

        }
    }

    public static int longerLength(String input1, String input2) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < input1.length(); i = i + 1) {


            count1++;

        }
        for (int i = 0; i < input2.length(); i = i + 1) {


            count2++;

        }
        return Math.max(count1, count2);
    }

    public static String lastNChars(String characters, int n) {

        return characters.substring(characters.length() - n);

    }
    public static String secondIndexOf (String characters, char m){

        String result = String.valueOf(characters.indexOf(m, characters.indexOf(m) + 1));
        return result;


    }
}
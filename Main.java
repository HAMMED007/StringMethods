package Method;


import static Method.StringMethods.*;

public class Main {

    public static void main(String[] args) {

//  prints every other character of the string
        StringMethods stm = new StringMethods();
        System.out.println("** part 1 **");
        stm.printEveryOther("method");
        System.out.println();


//returns the length of the longer of the two strings
        System.out.println("** part 2 **");
        int len = longerLength("bye", "hello");
        System.out.println(len);
        System.out.println();

//a static method called secondIndexOf that takes as its two parameters a string str and a character ch and
// returns the index of the second occurrence of ch in str
        System.out.println("** part 3, example 1 **");
        String index1 = secondIndexOf("banana", 'a');
        System.out.println(index1);
        System.out.println();

// a static method called lastNChars that takes as its two parameters a string str and an integer n,
// and that returns a string consisting of the last n characters of str. For example:
        System.out.println("** part 4, example 1 **");
        String lastN = lastNChars("programming", 5);
        System.out.println(lastN);

        System.out.println("** part 4, example 2 **");
        lastN = lastNChars("programming", 1);
        System.out.println(lastN);
        System.out.println();


        String counters = "banana";
        String m = "n";
        int index;
        int result = counters.indexOf(m);

        for (int i = 0; i < counters.length(); i++) {



        }


    }
}

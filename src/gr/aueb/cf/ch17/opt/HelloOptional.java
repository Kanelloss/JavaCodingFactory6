package gr.aueb.cf.ch17.opt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class HelloOptional {

    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("Coding Factory");

        String str = "Hello!!!";
        Optional<String> optStr2 = Optional.ofNullable(str);
        Optional<String> optStr3 = Optional.empty();

        if (optStr2.isPresent()) {
            String myStr = optStr2.get();
            System.out.println(myStr);
        } else {
            System.out.println("Error, string is null");
        }

        String s = optStr2.orElse("default");
        String s2 = optStr2.orElseThrow(() -> new RuntimeException(""));

        int[] arr = { 1, 2, 3, 4, 5 };

        int even = Arrays
                 .stream(arr)
                 .filter((el) -> el % 2 == 0)
                 .findFirst()       // returns it as optional
                 .orElse(-1);       // turns the optional to -1 if there is no matching value


        List<String> list = Arrays.asList("Hello", "CF");
        List<Integer> myInt = new ArrayList<>();
        myInt.add(0);


        String strVal = list
                .stream()
                .filter((el) -> el.startsWith("H"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Error. Nothing was found."));

        list.removeIf((v) -> v.startsWith("H"));

    }
}

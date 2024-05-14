package gr.aueb.cf.ch7;

public class SplitApp {

    public static void main(String[] args) {
        String s = "Athens Uni of Econ and Business";

        String[] tokens = s.split(" +");        // symbol + here means: 1 or more than 1 times (blank space)

        for (String token : tokens) {
            System.out.println(token);
        }

    }
}

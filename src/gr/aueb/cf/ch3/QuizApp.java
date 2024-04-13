package gr.aueb.cf.ch3;

public class QuizApp {

    public static void main(String[] args) {
        int i = 1;
        int result = 1;
        boolean found = false;

        do {
            result = result + i;
            if (result == 7) { found = true;}
            i++;
        } while ((i >= 1) && (! found));

        System.out.println(i);
    }
}

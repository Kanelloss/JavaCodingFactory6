package gr.aueb.cf.ch16.defaultMethods;

public class CodingFactory implements Iwelcome{

    @Override
    public void saySomething(String message) {
        System.out.println("Hello World!");
    }

    @Override
    public void sayHelloCoding() {
        Iwelcome.super.sayHelloCoding();
        System.out.println("\u2764".repeat(5));     // red heary
    }
}

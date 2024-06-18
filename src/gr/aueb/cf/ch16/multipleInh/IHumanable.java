package gr.aueb.cf.ch16.multipleInh;

public interface IHumanable extends ISpeakable, IReadable {

    @Override
    default void read() {
        System.out.println("I read.");
    }

    @Override
    default void speak() {
        System.out.println("I speak.");
    }
}

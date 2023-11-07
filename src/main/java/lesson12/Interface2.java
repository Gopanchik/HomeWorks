package lesson12;

public interface Interface2 {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Default method");
    }

    static void staticMethod() {
        System.out.println("Static method");
    }

}
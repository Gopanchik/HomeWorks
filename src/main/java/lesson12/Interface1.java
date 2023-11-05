package lesson12;

public interface Interface1 {
    void abstractMethod();
}

interface Interface2 {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Default method");
    }

    static void staticMethod() {
        System.out.println("Static method");
    }

}

class MyClass implements Interface1, Interface2 {
    @Override
    public void abstractMethod() {
        System.out.println("Implemented abstractMethod");
    }
}

class Main4 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClass.abstractMethod();
        myClass.defaultMethod();
        Interface2.staticMethod();
    }
}


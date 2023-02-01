package example;

interface Interface {
    int INT_CONSTANT = 0; // это константаю, то же самое,
    // что и public static final int INT_CONSTANT = 0;

    void instanceMethod1();

    void instanceMethod2();

    static void staticMethod() {
        System.out.println("Interface: static method");
    }

    default void defaultMethod() {
        System.out.println("Interface: default method. он может быть переписан");
    }

    private void privateMethod() {
        System.out.println("Interface: pricate метод в интерфейсах возможны, но у них должно быть тело");
    }


}

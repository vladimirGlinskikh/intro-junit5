package kz.zhelezyaka;

public class Greating {
    private static final String HELLO = "Hello";
    private static final String JAVA = "Java";

    public String helloJava() {
        return HELLO + " " + JAVA;
    }

    public String hellowJava(String name) {
        return HELLO + " " + name;
    }
}

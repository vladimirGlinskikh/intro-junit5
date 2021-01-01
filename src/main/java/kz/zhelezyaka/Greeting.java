package kz.zhelezyaka;

public class Greeting {
    private static final String HELLO = "Hello";
    private static final String JAVA = "Java";

    public String helloJava() {
        return HELLO + " " + JAVA;
    }

    public String helloJava(String name) {
        return HELLO + " " + name;
    }
}

package kz.zhelezyaka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void helloJava() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloJava());
    }

    @Test
    void testHelloJava() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloJava("Vladimir"));
    }
}
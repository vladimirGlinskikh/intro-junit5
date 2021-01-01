package kz.zhelezyaka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
    }

    @Test
    void helloJava() {
        System.out.println(greeting.helloJava());
    }

    @Test
    void testHelloJava() {
        System.out.println(greeting.helloJava("Vladimir"));
    }
}
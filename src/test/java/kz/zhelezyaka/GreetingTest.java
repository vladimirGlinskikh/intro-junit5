package kz.zhelezyaka;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before - I am only called once!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In BeforeEach ...");
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

    @AfterEach
    void tearDown() {
        System.out.println("In AfterEach ...");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("After - I am only called once!");
    }
}
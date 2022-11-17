package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before - I am only called once !!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In before each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Thomas"));
    }

    @Test
    void testHelloWorld2() {
        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In after each....");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After - I am only called once !!!!");
    }
}

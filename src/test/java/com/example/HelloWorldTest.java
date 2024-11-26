package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorldTest {

    @Test
    public void testGreetWithArgument() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello, Jenkins!", helloWorld.greet("Jenkins"));
    }

    @Test
    public void testGreetWithAnotherArgument() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello, ChatGPT!", helloWorld.greet("ChatGPT"));
    }

    @Test
    public void testMainWithoutArgument() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        HelloWorld.main(new String[]{});
        
        String expectedOutput = "No argument provided    Bravo à vous   . Usage: java HelloWorld <name>" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
        
        System.setOut(System.out);
    }
}

package com.example;

public class HelloWorld {

    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();

        if (args.length > 0) {
            System.out.println(helloWorld.greet(args[0]));
        } else {
            System.out.println("No argument provided. Usage: java HelloWorld <name>");
            System.out.println(helloWorld.greet("World"));
        }
    }
}

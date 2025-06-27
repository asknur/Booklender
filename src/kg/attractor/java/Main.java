package kg.attractor.java;

import kg.attractor.java.Homework45.Homework45;
import kg.attractor.java.lesson44.Lesson44Server;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new Homework45("localhost", 9889).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

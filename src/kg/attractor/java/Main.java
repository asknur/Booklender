package kg.attractor.java;
import Homework45.Homework45;
import Homework46.Homework46;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new Homework46("localhost", 9889).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

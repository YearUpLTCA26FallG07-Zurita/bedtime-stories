package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BedtimeStories {
    public static void main(String[] args) throws IOException {

        FileReader goldilocks = new FileReader("goldilocks.txt");
        FileReader hanselGretel = new FileReader("hansel_and_gretel.txt");
        FileReader maryLittleLamb = new FileReader("mary_had_a_little_lamb.txt");

        BufferedReader story1 = new BufferedReader(goldilocks);
        BufferedReader story2 = new BufferedReader(hanselGretel);
        BufferedReader story3 = new BufferedReader(maryLittleLamb);

        String input = Console.promptForString("Enter the name of a story: ").trim();
        String fileName = input.toLowerCase().replace(" ", "_") + ".txt";

        int lineNumber = 1;

        if (input.equalsIgnoreCase("goldilocks")) {
            while ((input = story1.readLine()) != null) {
                System.out.printf("%n%d: %s",lineNumber, input);
                lineNumber += 1;
            }
        } else if (input.equalsIgnoreCase("hansel and gretel")) {
            while ((input = story2.readLine()) != null) {
                System.out.printf("%n%d: %s", lineNumber, input);
                lineNumber += 1;
            }
        } else if (input.equalsIgnoreCase("mary had a little lamb")) {
            while ((input = story3.readLine()) != null) {
                System.out.printf("%n%d: %s", lineNumber, input);
                lineNumber += 1;
                }
            }
        }
    }
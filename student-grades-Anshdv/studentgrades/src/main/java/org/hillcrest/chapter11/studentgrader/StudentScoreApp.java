package main.java.org.hillcrest.chapter11.studentgrader;
import java.io.*;
import java.util.*;

/**
 * Main app/user interface for inputting student data
 */
public class StudentScoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> rawData = new ArrayList<>();
        ArrayList<StudentRecord> records;

        while (true) {
            System.out.print("\nEnter the input file name (type \"q\" to exit): ");
            String inputFile = scanner.nextLine();

            if (inputFile.equalsIgnoreCase("q")) {
                System.out.println("Goodbye!");
                return;
            }

            try (Scanner in = new Scanner(new File(inputFile))) {
                rawData.clear();
                while (in.hasNextLine()) {
                    rawData.add(in.nextLine());
                }

                records = StudentScoreReader.parseRecords(rawData);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
                System.out.println("Please try again.");
            } catch (BadDataException e) {
                System.out.println("An error occurred while parsing your data: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }

        System.out.print("Enter the output file name: ");
        String outputFile = scanner.nextLine();

        try (PrintWriter writer = new PrintWriter(outputFile)) {
            for (StudentRecord record: records) {
                writer.println(record.getName() + ": " + record.getAverage());
            }
            System.out.println("Done writing averages to " + outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred in writing to the output file: " + e.getMessage());
        }
    }
}

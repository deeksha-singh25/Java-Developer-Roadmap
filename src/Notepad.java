import java.io.*;
import java.util.Scanner;

public class Notepad {
    private static final Scanner sc = new Scanner(System.in);

    // Write content to a file
    public static void writeToFile(String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName, true); // append mode
            System.out.println("Enter text (type 'exit' on a new line to stop):");

            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(line + System.lineSeparator());
            }

            writer.close();
            System.out.println("File saved successfully: " + fileName);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Read content from a file
    public static void readFromFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\n--- File Content ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("--------------------\n");
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Menu
    public static void main(String[] args) {
        while (true) {
            System.out.println("=== Simple Notepad ===");
            System.out.println("1. Write to File");
            System.out.println("2. Read from File");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter file name to write: ");
                    String writeFile = sc.nextLine();
                    writeToFile(writeFile);
                    break;
                case 2:
                    System.out.print("Enter file name to read: ");
                    String readFile = sc.nextLine();
                    readFromFile(readFile);
                    break;
                case 3:
                    System.out.println("Exiting Notepad. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}


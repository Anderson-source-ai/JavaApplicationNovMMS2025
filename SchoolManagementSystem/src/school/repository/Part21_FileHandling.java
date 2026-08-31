package school.repository;

import java.io.*;

public class Part21_FileHandling {
    public static void main(String[] args) {
        File file = new File("students.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write("STU001,Nathan,Computer Science");
            writer.newLine();
            System.out.println("Record written to text file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
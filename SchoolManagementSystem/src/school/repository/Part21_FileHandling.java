package school.repository;

import java.io.*;

public class Part21_FileHandling {
    public void saveToFile(String filename, String data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(data);
            writer.newLine();
        }
    }
}
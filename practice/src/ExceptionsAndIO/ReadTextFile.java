package ExceptionsAndIO;

import java.io.*;

public class ReadTextFile {

    public static void main(String[] args) {
        File file = new File("test.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file.getName()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}

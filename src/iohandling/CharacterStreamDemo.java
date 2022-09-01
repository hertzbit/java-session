package iohandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {

    public static void main(String[] args) {

        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("src/someFile.txt");
            fileWriter = new FileWriter("src/outputFW.txt");
            int tempInt;
            while ((tempInt = fileReader.read()) != -1) {
                fileWriter.write((char) tempInt);
            }
            fileWriter.flush();
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}

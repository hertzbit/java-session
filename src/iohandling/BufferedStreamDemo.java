package iohandling;

import java.io.*;

public class BufferedStreamDemo {

    public static void main(String[] args) {


        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileReader = new FileReader("src/someFile.txt");
            bufferedReader = new BufferedReader(fileReader);

            fileWriter = new FileWriter("src/outputBW.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            String tempString = null;
            while ((tempString = bufferedReader.readLine()) != null) {
                bufferedWriter.write(tempString);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}

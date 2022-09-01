package iohandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

    public static void main(String[] args) throws IOException{

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("src/someFile.txt");
            fileOutputStream = new FileOutputStream("src/output.txt");
            int tempInput;
            while ((tempInput = fileInputStream.read()) != -1) {
                fileOutputStream.write(tempInput);
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
}

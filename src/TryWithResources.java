import java.io.*;

public class TryWithResources {

    public static void main(String[] args) {

        File file = new File("src/someFile.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        if (fr != null) {
            try (BufferedReader br = new BufferedReader(fr)){
                StringBuilder response = new StringBuilder();
                String eachLine = "";

                while ((eachLine = br.readLine()) != null) {
                    response.append(eachLine);
                    response.append("\n");
                }
                System.out.println(response);
            } catch (IOException ioException) {
                System.out.println(ioException.getMessage());
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {

    public String read() {
        String textFile = "", s;
        BufferedReader bufferedReader;

        {
            try {
                bufferedReader = new BufferedReader(new java.io.FileReader("/home/ivasik/Рабочий стол/replacement"));

                while ((s = bufferedReader.readLine()) != null)
                    textFile = textFile + s;
              //  System.out.println(textFile);
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return textFile;
    }
}

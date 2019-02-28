import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordReplace {

    private String replase() {
        String oldWord = null, newText = null, newWord = null;
        Scanner inOld = new Scanner(System.in);
        Scanner inNew = new Scanner(System.in);

        System.out.println("Какое слово заменить?");
        oldWord = inOld.next();
        System.out.println("На какое за менить?");
        newWord = inNew.next();

        inNew.close();
        inOld.close();

        Pattern pattern = Pattern.compile("\\b" + oldWord + "\\b");
        Matcher matcher = pattern.matcher(new FileReader().read());
        newText = matcher.replaceAll(newWord);

        return newText;
    }

    public void write() {

        try {
            String text = replase();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/ivasik/Рабочий стол/replacement"));
            bufferedWriter.write(text);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.File;
import java.util.ArrayList;

public class RemoveCharMain {
    public static void main(String[] args) {
        ArrayList<String> inputs = FileUtils.readFile(new File(new File("src").exists() ? "src/SampleInput.txt" : "SampleInput.txt"));
        for (int i = 0; i < inputs.size(); i++)
            inputs.set(i, removeDups(inputs.get(i)));

        inputs.forEach(System.out::println);

    }

    public static String removeDups(String word) {
        if (word.length() <= 1)
            return word;

        if (word.substring(0, word.length() - 1).contains(word.substring(word.length() - 1)))
            return removeDups(word.substring(0, word.length() - 1));

        return removeDups(word.substring(0, word.length() - 1)) + word.substring(word.length() - 1);
    }


}

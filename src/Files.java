import javax.sound.sampled.Line;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.createDirectory;

public class Main {

    public static void main(String[] args) throws IOException {

        String dataPathName = "data";
        String dataFileName = "data.txt";
        String groceriesFileName = "groceries";

//      CREATE A FILE
        Path dataFilePath = Paths.get(dataPathName, dataFileName);
        Files.createFile(dataFilePath);
        String line ="Whose line is it?";
        File.write(dataFilePath, Arrays.asList(Line), StandardOpenOption.CREATE);

        Path groceriesPath = Path.get(dataPathName, groceriesFileName);
        List<String> groceries = Arrays.asList("eggs", "toilet paper", "sanitizer");
        Files.write(dataFilePath, groceries, StandardOpenOption.CREATE);

    }
}

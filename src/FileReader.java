import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void fileReader(File file) {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
    }
}

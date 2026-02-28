import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = Path.of("input.txt").toFile();
        FileReader.fileReader(file);
        HashSet<String> lines = new HashSet<>(Files.readAllLines(file.toPath()));
        HashSet<Book> book = new HashSet<>();
        System.out.println("Как нужно отсортировать?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer.equals("По цене")) {
            System.out.println("Сортировка по убыванию или по возрастанию?");
            String priceAnswer = scanner.nextLine();
            if(priceAnswer.equals("По убыванию")) {
                Comparator<Book> bookComparator = Comparator.comparing(Book::getPrice).reversed();
                List<Book> sortedList = new ArrayList<>(book);
                sortedList.sort(bookComparator);
                sortedList.forEach(System.out::println);

            }else if(priceAnswer.equals("По возрастанию")){
                Comparator<Book> bookComparator = Comparator.comparing(Book::getPrice);
                List<Book> sortedList = new ArrayList<>(book);
                sortedList.sort(bookComparator);
                sortedList.forEach(System.out::println);
            }

        }
        Comparator<Magazine> magazineComparator = Comparator.comparing(Magazine::getPublisher).thenComparing(Magazine::getIssueNumber);
        ArrayList<Magazine> magazine = new ArrayList<>();
        for(String line : lines) {
            String[] parts = line.split(",");
            String type = parts[0];
            if(type.equals("книга")) {
                int price = Integer.parseInt(parts[1]);
                int quantity = Integer.parseInt(parts[2]);
                String name = parts[3];
                String author = parts[4];
                int yearOfManufacture = Integer.parseInt(parts[5]);
                String genre = parts[6];
                book.add(new Book(price, quantity, name, author, yearOfManufacture, genre));
                System.out.println(Arrays.toString(parts));
            } else if (type.equals("журнал")) {
                int price = Integer.parseInt(parts[1]);
                int quantity = Integer.parseInt(parts[2]);
                String name = parts[3];
                String publisher = parts[4];
                int issueNumber = Integer.parseInt(parts[5]);
                int releaseDate = Integer.parseInt(parts[6]);
                magazine.add(new Magazine(price, quantity, name, publisher, issueNumber, releaseDate));
                System.out.println(Arrays.toString(parts));
            } else {
                System.out.println("Нет такого");
            }
        }
    }
}
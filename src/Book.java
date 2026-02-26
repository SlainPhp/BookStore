public class Book extends Product{
    public Book(int price, int quantity, String name,String author, int yearOfManufacture, String genre) {
        super(price, quantity, name);
        this.author = author;
        this.yearOfManufacture = yearOfManufacture;
        this.genre = genre;
    };
    private String author;
    private int yearOfManufacture;
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}

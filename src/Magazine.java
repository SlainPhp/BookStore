public class Magazine extends Product{
    public Magazine(int price, int quantity, String name, String publisher, int issueNumber, int releaseDate) {
        super(price, quantity, name);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
        this.releaseDate = releaseDate;
    }
        private String publisher;
        private int issueNumber;
        private int releaseDate;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }


}

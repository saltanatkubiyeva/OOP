package p1b;

public class Magazine extends LibraryItem{
    private int issueNumber;
    private String genre;

    public Magazine(String title, String author, int publicationYear, int issueNumber, String genre) {
        super(title,author,publicationYear);
        this.issueNumber = issueNumber;
        this.genre = genre;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getGenre() {
        return genre;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getItemType() {return "Magazine";}

    @Override
    public String toString() {
        return super.toString() +
                " | Issue Number: " + issueNumber  +
                " | Genre: " + genre;
    }



}

public class  book {
    private final String name;
    private final Author author;
    private Integer publicationYear;


    public book(String name, Author author, Integer publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer publicationYear() {
        return publicationYear;

    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;

    }

    public Integer getPublicationYear() {
        return publicationYear;
    }
}

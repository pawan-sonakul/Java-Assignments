import java.util.Objects;

public class Books {
    private String isbn;
    private String title;

    public Books(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Objects.equals(isbn, books.isbn);
    }

    public static void main(String[] args) {
        Books books = new Books("1234", "Java");
        Books books1 = new Books("1234", "Java Guide");

        System.out.println(books1.equals(books));
    }
}

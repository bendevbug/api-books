package apibooks.com.apiBooks.Books;

public record DataListBooks(
        Long id,
        String title,
        String author,
        String publishDate,
        String company
) {
    public DataListBooks(Book book) {
        this(book.getId(), book.getTitle(), book.getAuthor(), book.getPublishDate(), book.getCompany());
    }
}

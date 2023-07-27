package apibooks.com.apiBooks.Books;

public record DataBooks(
        Long id,
        String title,
        String author,
        String company,
        String publishDate,

        String numberOfPages
) { }

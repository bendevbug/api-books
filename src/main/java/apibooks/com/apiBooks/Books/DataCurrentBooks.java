package apibooks.com.apiBooks.Books;

import org.antlr.v4.runtime.misc.NotNull;

public record DataCurrentBooks(
        @NotNull Long id,
        String title,
        String author,
        String company,
        String publishDate,

        String numberOfPages
) {
}

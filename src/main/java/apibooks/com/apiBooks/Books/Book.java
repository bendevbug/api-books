package apibooks.com.apiBooks.Books;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "tb_books2")
@Entity(name = "Book")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String company;

    private String publishDate;

    private String numberOfPages;

    public Book(DataBooks data) {
        this.id = data.id();
        this.title = data.title();
        this.author = data.author();
        this.company = data.company();
        this.publishDate = data.publishDate();
        this.numberOfPages = data.numberOfPages();
    }

    public void updateInfoBook(DataCurrentBooks data) {
        if(data.title() != null) {
            this.title = data.title();
        }
        if(data.author() != null) {
            this.author = data.author();
        }
        if(data.company() != null) {
            this.company = data.company();
        }
        if(data.publishDate() != null) {
            this.publishDate = data.publishDate();
        }
        if(data.numberOfPages() != null) {
            this.numberOfPages = data.numberOfPages();
        }

    }
}

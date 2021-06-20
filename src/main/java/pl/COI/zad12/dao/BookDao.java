package pl.COI.zad12.dao;

import pl.COI.zad12.model.Book;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BookDao {
    private final Map<Integer, Book> books = new HashMap<>();

    @PostConstruct
    public void init() {
        books.put(1, new Book(1, "PL30109024027364198827495582","W pustyni i w puszczy","Henryk Sienkiewicz"));
        books.put(2, new Book(2, "PL77109024022442632152255522","Potop","Henryk Sienkiewicz"));
        books.put(3, new Book(3, "PL87109024025968358272989352","Lalka","Bolesław Prus"));
        books.put(4, new Book(4, "PL40109024028394143667732653","Makbet","William Shakespeare"));
    }

    public Map<Integer, Book> getBooks() {
        return books;
    }

    public void deleteBook(int id) {
        books.remove(id);
    }

    public Book getBookById(int id) {
        return books.get(id);
    }

    public void editBook(Book book) {
        if (book.getId() == null) {
            int id = books.keySet().stream().min(((o1, o2) -> o2-o1)).orElse(0)+1;
            book.setId(id);
        }
        books.put(book.getId(), book);
    }
}

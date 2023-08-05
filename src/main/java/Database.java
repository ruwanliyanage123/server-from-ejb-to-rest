import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String, Book> bookMap = new HashMap<>();

    public boolean saveBook(Book book){
        return bookMap.put(book.getIsbn(), book) != null;
    }

    public Book getBook(String isbn){
        return bookMap.get(isbn);
    }
}

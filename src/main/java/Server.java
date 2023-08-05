public class Server {
    private Database database = new Database();
    public boolean saveBook(Book book){
        return database.saveBook(book);
    }

    public Book getBook(String isbn){
        return database.getBook(isbn);
    }
}

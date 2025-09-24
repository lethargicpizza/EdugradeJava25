import java.util.List;
import java.util.ArrayList;

public class Library {
    List<Book> books;
    List<Book> booksAvaliable;
    List<Book> booksNotAvailable;

    public Library() {
        books = new ArrayList<>();
        booksNotAvailable = new ArrayList<>();

            books.add(new Book("Emil i Lönneberga", "Astrid Lindgren", 400, "N/A"));
            books.add(new Book("Pippi Långstrump", "Astrid Lindgren", 400, "N/A"));
            books.add(new Book("Vi på Saltkråkan", "Astrid Lindgren", 400, "N/A"));
        books.add(new Book("Hitchhikers", "Douglas Adams", 400, "N/A"));

            books.add(new Book("Ronja Rövardotter", "Astrid Lindgren", 400, "N/A"));

            booksAvaliable = new ArrayList<>(books);
    }

    public List<Book> getAvaliableBooks() {
        return booksAvaliable;
    }

    public void lendBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                booksNotAvailable.add(book);
                booksAvaliable.remove(book);
            }
        }
    }

    public void listAvaliableBooks() {
        System.out.println("Avaliable Books:");
        for (Book book : booksAvaliable) {
            System.out.println(book.getTitle());
        }
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }
}

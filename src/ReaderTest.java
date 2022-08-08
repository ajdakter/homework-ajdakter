import model.Author;
import model.Book;
import model.Reader;

public class ReaderTest {
    public static void main(String[] args) {
        Author author=new Author("Robert Cecil Martin");
        Book book=new Book(author,"Clean Code",650,"Programing",true,250);
        Reader reader=new Reader("Ajda",17,'K');

        reader.read(book);
    }
}
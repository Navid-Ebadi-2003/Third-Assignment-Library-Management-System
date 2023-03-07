import java.util.ArrayList;

public class User extends Librarian{
    //User should have a list of books
    //User should have a username and a password

    private ArrayList<Book> books = new ArrayList<Book>();

    public User(String username ,String password){
        super(username , password);
    }


    public void rentBook(Book a){
        books.add(a);
    }

    public void returnBook(Book a){
        for(int i=0 ; i<books.size() ; i++ ){
            if(books.get(i)==a){
                books.remove(i);
            }
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

}

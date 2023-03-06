import java.util.ArrayList;

public class User {
    //User should have a list of books
    //User should have a username and a password

    private ArrayList<Book> books = new ArrayList<Book>();
    private String username;
    private String password;

    public User(String username , String password){
        this.username=username;
        this.password=password;
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

    public String getUsername() {
        return username;
    }


    public void chengePassword(String pass){
        this.password= pass;
    }
}

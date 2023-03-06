import java.util.HashMap;
import java.util.ArrayList;
public class Library {
    /*
    * The library should have a list of books.
    * The library should have a map of books ISBNs which is linked to the amount of book
    -> (for example: harry potter -> 4 means there are currently 4 harry potter books)
    * The library should have a list of users and a list of librarians.
     */

    //book related functions

    HashMap<Book , Integer> books = new HashMap<Book, Integer>();
    ArrayList<User> users = new ArrayList<User>();
    ArrayList<Librarian> librarians = new ArrayList<Librarian>();

    public void addBook(Book name , int num){
        books.put(name , num);
    }

    public void removeBook(Book name){
        books.remove(name);

    }

    public void searchBook(String author){
        for(Book i : books.keySet()){
            if(i.getAuthor()== author){
                i.getNameB();
            }
        }
    }

    public void updateBook(Book name , int num){
        books.replace(name , num);
    }

    public void doesBookExist(Book name){
        boolean test = false;
        for(Book i : books.keySet()){
            if(name==i){
                if(books.get(name)>0){
                    test = true;
                }
            }
        }

        if(test==true){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }

    public void increaseBook(Book name ){
        books.replace(name , books.get(name)+1);

    }

    public void decreaseBook(Book name){
        if(books.get(name)>0){
            books.replace(name , books.get(name)-1);
        }
    }

    //user related functions

    public void addUser(){
        //TODO
    }

    public void removeUser(){
        //TODO
    }

    public void searchUser(){
        //TODO
    }

    public void updateUser(){
        //TODO
    }

    public void doesUserExist(){
        //TODO
    }

    //librarian related functions

    public void addLibrarian(){
        //TODO
    }

    public void removeLibrarian(){
        //TODO
    }

    public void searchLibrarian(){
        //TODO
    }

    public void updateLibrarian(){
        //TODO
    }

    public void doesLibrarianExist(){
        //TODO
    }


}

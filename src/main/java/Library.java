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

    public Book searchBook(String name){
        for(Book i : books.keySet()){
            if(i.getNameB()==name){
                return i;
            }
        }
        return null;  //?
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

    public void addUser(User name){
        users.add(name);
    }

    public void removeUser(User name){
        for(int i =0;i<users.size();i++){
            if(users.get(i)==name){
                users.remove(i);
            }
        }
    }

    public User searchUser(String name){
        for(User i : users){
            if(i.getUsername()==name){
                return i;
            }
        }
        return null; //?
    }

    public void updateUser(User name , String pass){
        name.chengePassword(pass);
    }

    public void doesUserExist(User name){
        for(User i : users ){
            if(i==name){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }

    }

    //librarian related functions

    public void addLibrarian(Librarian name){
        librarians.add(name);
    }

    public void removeLibrarian(Librarian name){
        for(int i =0; i<librarians.size();i++){
            if(librarians.get(i)==name){
                librarians.remove(i);
            }
        }
    }

    public Librarian searchLibrarian(String name){
        for(Librarian i :librarians){
            if(i.getUsername()==name){
                return i;
            }
        }
        return null; //?
    }

    public void updateLibrarian(Librarian name , String pass){
        name.chengePassword(pass);
    }

    public void doesLibrarianExist(Librarian name){
        for (Librarian i : librarians){
            if(i==name){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }


}

public class Librarian extends Library {
    /*
    * The librarian should have a username and a password
    * The librarian should be able to search users, librarians and books
    * The librarian should be able to add\remove,update user add\remove,update_
    _ librarian and add\remove,update book
     */
    private String username;
    private String password;

    public Librarian(String username ,String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void chengePassword(String pass){
        this.password= pass;
    }
}

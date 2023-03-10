import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    /*
    * make a functional library app using oop
    * run the main program in Main.java and code the oop part in other classes
    * don't forget to add at least 1 librarian to the library to make it functionable.
    * *  *** don't limit yourself to our template ***
     */

    static Library library = new Library();
    static ArrayList<Book> books = new ArrayList<Book>();  // 2 ways
    public static void main(String[] args) {


//            Book book ;
//        for ()
//        {
//           book = new Book();
//            books.add(book);
//        }


        books.add( new Book("philosophersStone" , "J.K.Rowling" , 1997));
        books.add( new Book("chamberOfSecrets" , "J.K.Rowling" , 1998));
        books.add( new Book("prisonerOfAzkaban" , "J.K.Rowling" , 1999));
        books.add( new Book("gobletOfFire" , "J.K.Rowling" , 2000));
        books.add( new Book("orderOfThePhoenix" , "J.K.Rowling" , 2003));
        books.add( new Book("half_BloodPrince" , "J.K.Rowling" , 2005));
        books.add( new Book("deathlyHallows" , "J.K.Rowling" , 2007));

        library.addBook(books.get(0) , 7);
        library.addBook(books.get(1) , 8);
        library.addBook(books.get(2) , 9);
        library.addBook(books.get(3) , 1);
        library.addBook(books.get(4) , 3);
        library.addBook(books.get(5) , 5);
        library.addBook(books.get(6) , 7);

        // 2 ways

       library.addUser(new User("puria", "1234pe"));
       library.addUser(new User("nima", "5678ne"));


       library.addLibrarian(new Librarian("navid" , "1357na"));

        runMenu();

        System.out.println();
        System.out.println("done");

    }

    //*************************************************************************************

    public static void runMenu(){
        boolean on_off = true;
        Scanner input = new Scanner(System.in);

        while(on_off){

            System.out.println("Hi");
            System.out.println("1.sign in as a user");
            System.out.println("2.sign in as a library");
            System.out.println("3.sign up");

            int command = input.nextInt();
            input.nextLine();

            if(command==1){

                System.out.println("useername: ");
                String name = input.nextLine();
                System.out.println("password: ");
                String pass = input.nextLine();

                if(library.doesUserExist(name)) {
                    User user = library.searchUser(name);

                    if (pass.equals(user.getPassword())) {

                        System.out.println("1.rent a book");
                        System.out.println("2.return a book");

                        int command1 = input.nextInt();
                        input.nextLine();

                        System.out.println("print name's book: ");
                        String nameBook= input.nextLine();

                        if(library.doesBookExist(nameBook)){

                            if (command1 == 1) {

                                user.rentBook(library.searchBook(nameBook));
                                library.decreaseBook(library.searchBook(nameBook));

                                System.out.println("your books: ");
                                for(Book i: user.getBooks()){
                                    System.out.print(i.getNameB() + " ");
                                }

                                on_off=false;

                            }
                            else if (command1 == 2) {

                                user.returnBook(library.searchBook(nameBook));
                                library.increaseBook(library.searchBook(nameBook));

                                System.out.println("your books: ");
                                for(Book i: user.getBooks()){
                                    System.out.print(i.getNameB() + " ");
                                }

                                on_off=false;
                            }

                        }
                        else{
                            System.err.println("this book don't exist or out of stock");
                            on_off=false;
                        }
                    }
                    else {
                        System.err.println("wrong password");
                    }
                }
                else{
                    System.err.println("this user don't exist");
                }



//*******************************************************************************************************



            }
            else if(command==2){
                System.out.println("useername: ");
                String name = input.nextLine();
                System.out.println("password: ");
                String pass = input.nextLine();

                if(library.doesLibrarianExist(name)){

                    Librarian librarian = library.searchLibrarian(name);

                    if(pass.equals(librarian.getPassword())){

                        System.out.println("1.add book");
                        System.out.println("2.remove book");
                        System.out.println("3.update book");
                        System.out.println("4.add user");
                        System.out.println("5.remove user");
                        System.out.println("6.update user");
                        System.out.println("7.add librarian");
                        System.out.println("8.remove librarian");
                        System.out.println("9.update librarian");

                        int command1 = input.nextInt();
                        input.nextLine();

                        switch (command1) {
                            case 1:

                                System.out.println("name of the book: ");
                                String  nameB =input.nextLine();
                                System.out.println("author: ");
                                String author =input.nextLine();
                                System.out.println("year: ");
                                int year = input.nextInt();
                                input.nextLine();
                                System.out.println("number: ");
                                int num = input.nextInt();
                                input.nextLine();

                                books.add(new Book(nameB , author, year));
                                library.addBook(books.get(books.size()-1), num);

                                on_off=false;


                                break;
                            case 2:

                                System.out.println("print name's book: ");
                                String nameBook= input.nextLine();

                                if(library.doesBookExist(nameBook)) {

                                    library.removeBook(library.searchBook(nameBook));
                                    on_off=false;
                                }
                                else{
                                    System.err.println("this book don't exist ");
                                }

                                break;
                            case 3:

                                System.out.println("print name's book: ");
                                String nameBook1= input.nextLine();
                                System.out.println("new number of book: ");
                                int newN = input.nextInt();
                                input.nextLine();

                                if(library.doesBookExist(nameBook1)) {

                                    library.updateBook(library.searchBook(nameBook1) , newN);
                                    on_off=false;
                                }
                                else{
                                    System.err.println("this book don't exist ");
                                }

                                break;
                            case 4:

                                System.out.println("username: ");
                                String username =input.nextLine();
                                System.out.println("password: ");
                                String password =input.nextLine();

                                library.addUser(new User(username , password));
                                on_off=false;

                                break;

                            case 5:

                                System.out.println("username: ");
                                String user =input.nextLine();

                                if(library.doesUserExist(user)){

                                    library.removeUser(library.searchUser(user));
                                    on_off=false;

                                }
                                else{
                                    System.err.println("this user don't exist");
                                }

                                break;
                            case 6:

                                System.out.println("username: ");
                                String user1 =input.nextLine();
                                System.out.println("new password: ");
                                String newPass =input.nextLine();


                                if(library.doesUserExist(user1)){

                                    library.updateUser(library.searchUser(user1), newPass);
                                    on_off=false;

                                }
                                else{
                                    System.err.println("this user don't exist");
                                }


                                break;
                            case 7:

                                System.out.println("username: ");
                                String usernameL =input.nextLine();
                                System.out.println("password: ");
                                String passwordL =input.nextLine();

                                library.addLibrarian(new Librarian(usernameL , passwordL));
                                on_off =false;

                                break;
                            case 8:

                                System.out.println("username: ");
                                String librarian1 = input.nextLine();

                                if(library.doesLibrarianExist(librarian1)){
                                    library.removeLibrarian(library.searchLibrarian(librarian1));
                                    on_off=false;
                                }
                                else {
                                    System.err.println("this librarian don't exist");
                                }

                                break;
                            case 9:

                                System.out.println("username: ");
                                String librarian2 = input.nextLine();
                                System.out.println("new password: ");
                                String newPassL = input.nextLine();


                                if(library.doesLibrarianExist(librarian2)){
                                    library.updateLibrarian(library.searchLibrarian(librarian2) , newPassL);
                                    on_off=false;
                                }
                                else {
                                    System.err.println("this librarian don't exist");
                                }

                                break;
                        }

                    }
                    else{
                        System.err.println("wrong password");
                    }
                }
                else{
                    System.err.println("this librarian don't exist");
                }




            }
            else if (command==3){

                System.out.println("username: ");
                String user = input.nextLine();
                System.out.println("password: ");
                String pass = input.nextLine();

                library.addUser(new User(user , pass));

            }
            else {
                System.err.println("wrong answer");
            }


        }
    }




}

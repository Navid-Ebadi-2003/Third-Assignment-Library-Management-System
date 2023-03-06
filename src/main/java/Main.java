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
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<Book>();


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

       User puria = new User("puria", "1234pe");
       User nima = new User("nima", "5678ne");

       library.addUser(puria);
       library.addUser(nima);

       Librarian navid = new Librarian("navid" , "1357na");

       library.addLibrarian(navid);

        runMenu();

        System.out.println("done");

    }

    public static void runMenu(){
        boolean on_off = true;
        Scanner input = new Scanner(System.in);

        while(on_off){

            System.out.println("Hi");
            System.out.println("1.sign in as a user");
            System.out.println("2.sign in as a library");
            System.out.println("3.sign up");

            int command = input.nextInt();

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

                        System.out.println("print name's book: ");
                        String nameBook= input.nextLine();

                        if(library.doesBookExist(nameBook)){

                            Book book = library.searchBook(nameBook);

                            if (command1 == 1) {

                                user.rentBook(book);
                                library.decreaseBook(book);
                                on_off=false;

                            }
                            else if (command1 == 2) {

                                user.returnBook(book);
                                library.increaseBook(book);
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









            }
            else if (command==3){












            }
            else {
                System.err.println("wrong answer");
            }



        on_off = false;


        }
    }




}

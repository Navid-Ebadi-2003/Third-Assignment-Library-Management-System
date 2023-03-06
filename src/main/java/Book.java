public class Book {
    //Book should contain name,author,year of publish and ISBN

    private String nameB;
    private String author;
    private  int year;
    public Book(String nameB ,String author , int year){
        this.nameB=nameB;
        this.author=author;
        this.year=year;
    }

//    public String getAuthor() {
//        return author;
//    }
//
    public String getNameB() {
        return nameB;
    }
}

package Projects;

public class FictionBook extends Book {
    private String genre;
    FictionBook(String title, String author, int isbn,String genre){
        super(title,author, isbn);
        this.genre=genre;

    }

    @Override
    void borrowBook() {

    }

    @Override
    void returnBook() {

    }

    @Override
    void displayBookInfo() {

    }

}

package Projects;

public class ScienceBook extends Book {
    private String field;
    ScienceBook(String title, String author, int isbn,String field){
        super(title, author, isbn);
        this.field=field;
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

package Projects;

public abstract class  Book {
    protected String title;
    protected String author;
    protected int isbn;
    protected boolean isBorrowed;
    public Book(String title, String author, int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.isBorrowed = false;
    }


    abstract void borrowBook();
    abstract void returnBook();
    abstract void displayBookInfo();
}

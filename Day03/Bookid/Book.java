
public class Book {
    
    int bookId;
    String bookTitle;
    float bookPrice;

    static int count = 0;

    Book() {
        count++;
        bookId = count;
    }

   
    Book(String bookTitle) {
        count++;
        bookId = count;
        this.bookTitle = bookTitle;
    }


    void setPrice(float price) {
        bookPrice = price;
    }

    
    void display() {
        System.out.println(
            "Book ID: " + bookId +
            ", Title=" + bookTitle +
            ", Price: " + bookPrice
        );
    }
    
}
package Project.utility;

public class Book {
      private int bookid;
      private String title;
      private float price;
      
      public Book() {
    	bookid = 0;
    	title = "name";
    	price = 0;
      }
      
	  public Book(int bookid, String title, float price) {
//		super();
		this.bookid = bookid;
		this.title = title;
		this.price = price;
	  }
      
     public void display() {
    	 System.out.println("Book id  :: " + bookid);
    	 System.out.println("tittle  :: " + title);
    	 System.out.println("price  ::" + price);
     } 
      
}

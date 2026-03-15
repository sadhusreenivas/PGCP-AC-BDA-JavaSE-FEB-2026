class Book{
	int isbn;
	String title;
	String author;
    int pages;
    double price;
    String upiId;
    static String publisher = "TMH";

    Book(int isbn, String title, String author, int pages){ // param cons
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.pages = pages;
    }

    Book(int isbn, String title, String author, int pages, double price){
    	this(isbn, title, author, pages); //
    	this.price = price;
    }
     // 3
     Book(int isbn, String title, String author, int pages, double price, String upiId){
    	//this.upiId = upiId;
    	this(isbn, title, author, pages, price); //
    	this.upiId = upiId;
    }

    void dispBook(){
    	System.out.println(isbn+" "+title+" "+author+" "+pages+" "+publisher+" "+price+" "+upiId);
    }
}
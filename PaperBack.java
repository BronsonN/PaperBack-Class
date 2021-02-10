package sait.bms.problemDomain;

public class PaperBack extends Book {

	private String author;
	private long year;
	private String genre;
	
	/*public PaperBack(String author, long year, String genre) {
		super();
	}*/
	
	public PaperBack(long ISBN, String callNumber, int availNumber, int totalNumber, String bookTitle, String author,long year, String genre) {
		super(bookTitle, ISBN, callNumber, availNumber, totalNumber);
		this.author = author;
		this.year = year;
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void printBook() {
		System.out.println("Matching books:");
		System.out.println("ISBN:             " + getISBN());
		System.out.println("Call Number:      " + getCallNumber());
		System.out.println("Available:        " + getAvailabiltyNumber());
		System.out.println("Total:            " + getTotalNumber());
		System.out.println("Title:            " + getBookTitle());
		System.out.println("Author:           " + getAuthor());
		System.out.println("Format:           " + getYear());
		System.out.println("Genre:            " + getGenre());
		System.out.println();
	}
	
	@Override
	public String toString() {
		return getISBN() + ";"  + getCallNumber() + ";" + getAvailabiltyNumber() + ";" +getTotalNumber()+ ";" +getBookTitle()+ ";" +author+ ";" +year+ ";" +genre;
	}
	
	
}

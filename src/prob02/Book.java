package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	int stateCode; // 0 : 대여중     1 : 재고있음
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1; //재고있음 표시
	}
	
	public void rent() {
		stateCode = 0; //대여중..
		System.out.println("[" + title + "] 이(가) 대여 됐습니다.");
	}
	
	public void print(Book book) {
		System.out.print("책 제목 : " + book.title + ", 작가 : " + book.author + ", 대여 유무 : ");
		if(book.stateCode == 0) { //대여중..
			System.out.println("대여 중");
		} else {
			System.out.println("재고 있음");
		}
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	
}
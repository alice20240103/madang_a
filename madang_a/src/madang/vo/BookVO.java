package madang.vo;

public class BookVO {
	private int boookid;
	private String bookname;
	private int price;
	private String publisher;
	public BookVO(int boookid, String bookname, int price, String publisher) {
		super();
		this.boookid = boookid;
		this.bookname = bookname;
		this.price = price;
		this.publisher = publisher;
	}
	public BookVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBoookid() {
		return boookid;
	}
	public void setBoookid(int boookid) {
		this.boookid = boookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
}

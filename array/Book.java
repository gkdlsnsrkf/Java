package array;

//224½ ������


public class Book {
	private String name;
	private String author;
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	public Book() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(name+" , "+author);
	}

}

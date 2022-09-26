package poly;

public class Book {
	
	Book(){}
	
	String name = "";
	String author = "";
	String from = "";
	
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
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	Book(String name, String author, String from){
		this.name = name;
		this.author = author; 
		this.from = from;  
	}
	
	
	
	
	
	
	

}

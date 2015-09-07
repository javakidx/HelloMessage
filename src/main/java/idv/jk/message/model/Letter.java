package idv.jk.message.model;

public class Letter 
{
	
	public Letter(String name, String content) {
		super();
		this.content = content;
		this.name = name;
	}
	
	private String content;
	private String name;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

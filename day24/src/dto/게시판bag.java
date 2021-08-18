package dto;

public class 게시판bag {

	private String id;
	private String title;
	private String writer;
	private String content;
	

	// stters and getters를 생성해보세요
	// toString도 생성해보세요.
	// 숨기고 싶은 정보는 private을 선언해서 숨긴다.

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "게시판bag [id=" + id + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}

	

}

package BBS;

// DB와 화면을 연결해서 데이터를 전송하는 클래스
// DB의 내용이 DTO 객체에 저장됨

public class BoradDTO {
	private int idx;
	private String title;
	private String content;
	private String writer;
	private int viewCnt;
	private boolean noticeYn;
	private boolean secretYn;
	private boolean changeYn;
	private int fileIdxs;
	
	public void info() {
		System.out.println("idx : " + this.idx);
		System.out.println("title : " + this.title);
		System.out.println("content : " + this.content);
		System.out.println("writer : " + this.writer);
		System.out.println("viewCnt : " + this.viewCnt);
		System.out.println("noticeYn : " + this.noticeYn);
		System.out.println("secretYn : " + this.secretYn);
		System.out.println("changeYn : " + this.changeYn);
		System.out.println("fileIdxs : " + this.fileIdxs);
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
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
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	public boolean isNoticeYn() {
		return noticeYn;
	}
	public void setNoticeYn(boolean noticeYn) {
		this.noticeYn = noticeYn;
	}
	public boolean isSecretYn() {
		return secretYn;
	}
	public void setSecretYn(boolean secretYn) {
		this.secretYn = secretYn;
	}
	public boolean isChangeYn() {
		return changeYn;
	}
	public void setChangeYn(boolean changeYn) {
		this.changeYn = changeYn;
	}
	public int getFileIdxs() {
		return fileIdxs;
	}
	public void setFileIdxs(int fileIdxs) {
		this.fileIdxs = fileIdxs;
	}
	
	
}

package BBS;

// DB에 데이터를 가져와서 클래스 객체에 저장
// 첨부파일 DTO 클래스

public class AttachDTO {
	private int idx;
	private int boardIdx;
	private String originalName;
	private String saveName;
	private int size;
	
	public void info() {
		System.out.println("idx : " + this.idx);
		System.out.println("boardIdx : " + this.boardIdx);
		System.out.println("originalName : " + this.originalName);
		System.out.println("saveName : " + this.saveName);
		System.out.println("size : " + this.size);
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getBoardIdx() {
		return boardIdx;
	}
	public void setBoardIdx(int boardIdx) {
		this.boardIdx = boardIdx;
	}
	public String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	public String getSaveName() {
		return saveName;
	}
	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}

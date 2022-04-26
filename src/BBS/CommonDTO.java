package BBS;

public class CommonDTO {

	private String paginationInfo;
	private boolean deleteYn;
	private String insertTime;
	private String updateTime;
	private String deleteTime;

	public String getPaginationInfo() {
		return paginationInfo;
	}

	public void setPaginationInfo(String paginationInfo) {
		this.paginationInfo = paginationInfo;
	}

	public boolean isDeleteYn() {
		return deleteYn;
	}

	public void setDeleteYn(boolean deleteYn) {
		this.deleteYn = deleteYn;
	}

	public String getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getDeleteTime() {
		return deleteTime;
	}

	public void setDeleteTime(String deleteTime) {
		this.deleteTime = deleteTime;
	}
	// 멤버변수 출력용 메소드
	// 디버깅 목적 
	public void info() {
		System.out.println("paginationInfo : " + this.paginationInfo);
		System.out.println("deleteYn : " + this.deleteYn);
		System.out.println("insertTime : " + this.insertTime);
		System.out.println("updateTime : " + this.updateTime);
		System.out.println("deleteTime : " + this.deleteTime);
	}

}

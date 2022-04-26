package DTOTest;

public class BlackPointDTO extends PersonDTO {

	// 흑백 여부 true , false
	private boolean blackYn;
	
	@Override
	public void showPoint() {
		// 흑백여부 + 점의좌표 출력
		System.out.println("blackYn : " + this.blackYn);
		super.showPoint(); // 부모 점의 좌표 출력메소드 호출
	}

	@Override
	public void set(int x, int y) {
	}

	public void setBlackYn(boolean blackYn) {
		this.blackYn = blackYn;
	}
}

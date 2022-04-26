package DTOTest;

public class ColorPointDTO extends PersonDTO{

	// 컬러색상
	private String color;
	
	@Override
	public void showPoint() {
		// 컬러색상 + 점의좌표 출력
		System.out.println(this.color);
		super.showPoint(); // 부모의 점의 좌표 출력메소드 호출
	}

	@Override
	public void set(int x, int y) {
		
	}
	// color 저장용 메소드
	public void setColor(String color) {
		this.color = color;
	}
	
}

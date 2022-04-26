package DTOTest;

public class PersonDTO {
	
	int x;
	int y;
	// 컬러색상 + 점의좌표출력
	public void showPoint() {
		System.out.println("x : " + this.x + " y : " + this.y);
	}
	// 좌표저장
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

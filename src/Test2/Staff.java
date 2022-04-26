package Test2;

public class Staff extends Person{

	public void setStaff() {
		System.out.println("나이 : " + this.getAge());
		System.out.println("이름 : " + this.getName());
		System.out.println("키 : " + this.getHeight());
		System.out.println("몸무게 : " + this.getWeight());
	}
}
